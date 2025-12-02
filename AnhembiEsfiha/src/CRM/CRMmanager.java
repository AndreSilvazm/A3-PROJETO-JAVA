package CRM;

import Arrays.ArrayPedido;
import Model.Pedido.Pedido;
import Model.Produto.Bebidas;
import Model.Produto.Esfihas;
import Model.Produto.PrincipalProdutos;
import Model.Usuario.Cliente;
import Model.Usuario.Funcionario;
import Utils.Estilos;

import java.util.Scanner;

public class CRMmanager {

    private int opcao;

    Scanner scann = new Scanner(System.in);

    PrincipalProdutos Bebida = new Bebidas();
    Funcionario Funcionario = new Funcionario();
    Cliente Cliente = new Cliente();
    Pedido Pedido = new Pedido();

    ArrayPedido PedidosGerais = new ArrayPedido(10);


    private String formaPagamento;
    private String ruaEntrega;
    private String numeroEntrega;
    private String cepEntrega;


    // MENU PRINCIPAL

    public void MostrarMenuInicial() {
        System.out.println(Estilos.LARANJA + Estilos.NEGRITO);
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║         ANHEMBI ESFIHAS              ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║ [1] Área do Cliente                   ║");
        System.out.println("║ [2] Área do Funcionário               ║");
        System.out.println("║ [3] Sair                              ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print(Estilos.DOURADO + "Escolha uma opcao: " + Estilos.RESET);

        try {
            this.opcao = Integer.parseInt(scann.nextLine());
        } catch (Exception e) {
            this.opcao = -1;
        }
    }

    public void Executar() {
        boolean rodando = true;

        while (rodando) {
            MostrarMenuInicial();

            switch (opcao) {
                case 1 -> MenuCliente();
                case 2 -> MenuFuncionario();
                case 3 -> {
                    System.out.println(Estilos.DOURADO + "Saindo... Ate logo!" + Estilos.RESET);
                    rodando = false;
                }
                default -> System.out.println(Estilos.DOURADO + "Opção inválida!" + Estilos.RESET);
            }
        }
    }


    // ÁREA DO CLIENTE

    public void MenuCliente() {
        int escolha = 0;

        while (escolha != 2) {
            System.out.println(Estilos.BEGE + Estilos.NEGRITO);
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║          AREA DO CLIENTE             ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ [1] Cardápio                         ║");
            System.out.println("║ [2] Voltar                           ║");
            System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

            try {
                escolha = Integer.parseInt(scann.nextLine());
            } catch (Exception e) {
                escolha = -1;
            }

            if (escolha == 1) MenuCardapio();
        }
    }

    public void MenuCardapio() {
        int escolha = 0;

        while (escolha != 3) {
            System.out.println(Estilos.BEGE + Estilos.NEGRITO);
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║              CARDAPIO                ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ [1] Esfihas                          ║");
            System.out.println("║ [2] Bebidas                          ║");
            System.out.println("║ [3] Voltar                           ║");
            System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

            try {
                escolha = Integer.parseInt(scann.nextLine());
            } catch (Exception e) {
                escolha = -1;
            }

            if (escolha == 1) MenuEsfihas();
            if (escolha == 2) MenuBebidas();
        }
    }

    public void MenuEsfihas() {
        while (true) {
            System.out.println(Estilos.BEGE + Estilos.NEGRITO);
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║        ESFIHAS DISPONIVEIS            ║");
            System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

            Funcionario.ExibirEsfihas();

            System.out.println(Estilos.DOURADO + "\n[7] Voltar   [8] Avancar" + Estilos.RESET);

            String entrada = scann.nextLine();

            if (entrada.equals("7")) return;
            if (entrada.equals("8")) {
                FinalizarPedidoReal();
                return;
            }
        }
    }

    public void MenuBebidas() {
        while (true) {
            System.out.println(Estilos.BEGE + Estilos.NEGRITO);
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║        BEBIDAS DISPONIVEIS            ║");
            System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

            Funcionario.ExibirBebidas();

            System.out.println(Estilos.DOURADO + "\n[4] Voltar   [5] Avancar" + Estilos.RESET);

            String entrada = scann.nextLine();

            if (entrada.equals("4")) return;
            if (entrada.equals("5")) {
                FinalizarPedidoReal();
                return;
            }
        }
    }


    public int EscolherEsfihaReal() {
        while (true) {
            System.out.println(Estilos.DOURADO + "Digite o ID da esfiha: " + Estilos.RESET);
            String line = scann.nextLine();

            try {
                int id = Integer.parseInt(line);
                Esfihas es = Funcionario.PegarEsfihaPeloID(id);

                if (es != null) {
                    System.out.println(Estilos.LARANJA + "Selecionada: " + es.getSabor() + " - R$" + es.getPreco() + Estilos.RESET);
                    return id;
                }
            } catch (Exception ignored) {}

            System.out.println(Estilos.DOURADO + "ID inválido!" + Estilos.RESET);
        }
    }

    public int EscolherBebidaReal() {
        while (true) {
            System.out.println(Estilos.DOURADO + "Digite o ID da bebida: " + Estilos.RESET);
            String line = scann.nextLine();

            try {
                int id = Integer.parseInt(line);
                Bebidas b = Funcionario.PegarBebidasID(id);

                if (b != null) {
                    System.out.println(Estilos.LARANJA + "Selecionada: " + b.getDescricao() + " - R$" + b.getPreco() + Estilos.RESET);
                    return id;
                }
            } catch (Exception ignored) {}

            System.out.println(Estilos.DOURADO + "ID inválido!" + Estilos.RESET);
        }
    }


    public void MenuPagamento() {
        while (true) {
            System.out.println(Estilos.BEGE + Estilos.NEGRITO);
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║         FORMA DE PAGAMENTO           ║");
            System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

            System.out.println("[1] PIX");
            System.out.println("[2] Cartão");
            System.out.println("[3] Dinheiro");

            String escolha = scann.nextLine();

            switch (escolha) {
                case "1" -> { formaPagamento = "PIX"; return; }
                case "2" -> { formaPagamento = "Cartão"; return; }
                case "3" -> { formaPagamento = "Dinheiro"; return; }
                default -> System.out.println(Estilos.DOURADO + "Opção inválida!" + Estilos.RESET);
            }
        }
    }


    public void MenuEndereco() {

        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        ENDERECO DE ENTREGA            ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

        System.out.print("Rua: ");
        ruaEntrega = scann.nextLine();

        System.out.print("Número: ");
        numeroEntrega = scann.nextLine();

        System.out.print("CEP: ");
        cepEntrega = scann.nextLine();
    }


    public void FinalizarPedidoReal() {

        System.out.println(Estilos.DOURADO + "Escolha sua Esfiha:" + Estilos.RESET);
        int esfihaID = EscolherEsfihaReal();

        System.out.println(Estilos.DOURADO + "\nEscolha sua Bebida:" + Estilos.RESET);
        int bebidaID = EscolherBebidaReal();

        System.out.println("Digite seu nome:");
        String nomeCliente = scann.nextLine();

        MenuPagamento();
        MenuEndereco();

        double valor = Funcionario.CalculoValorTotalPedido(esfihaID, bebidaID);

        Pedido novoPedido = new Pedido(nomeCliente, valor, esfihaID, bebidaID);

        PedidosGerais.Inserir(novoPedido);

        System.out.println(Estilos.LARANJA + Estilos.NEGRITO);
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║          PEDIDO FINALIZADO            ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ Cliente: " + nomeCliente);
        System.out.println("║ Esfiha: " + Funcionario.PegarEsfihaPeloID(esfihaID).getSabor());
        System.out.println("║ Bebida: " + Funcionario.PegarBebidasID(bebidaID).getDescricao());
        System.out.println("║ Pagamento: " + formaPagamento);
        System.out.println("║ Endereço: Rua " + ruaEntrega + ", Nº " + numeroEntrega);
        System.out.println("║ CEP: " + cepEntrega);
        System.out.println("║ Valor total: R$" + valor);
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);
    }


    public void MenuFuncionario() {
        while (true) {

            // FUNCIONÁRIO SEM LOGIN
            if (Funcionario.getPermission() != 1) {

                System.out.println(Estilos.BEGE + Estilos.NEGRITO);
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║        AREA DO FUNCIONARIO           ║");
                System.out.println("╠══════════════════════════════════════╣");
                System.out.println("║ [1] Fazer Login                      ║");
                System.out.println("║ [2] Voltar                           ║");
                System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

                String line = scann.nextLine();

                if (line.equals("1")) {
                    FazerLogin();
                } else if (line.equals("2")) {
                    return;
                } else {
                    System.out.println(Estilos.DOURADO + "Opção inválida!" + Estilos.RESET);
                }

            } else {

                // FUNCIONÁRIO LOGADO
                System.out.println(Estilos.BEGE + Estilos.NEGRITO);
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║     AREA DO FUNCIONARIO (LOGADO)     ║");
                System.out.println("╠══════════════════════════════════════╣");
                System.out.println("║ [1] Cadastrar Produto                ║");
                System.out.println("║ [2] Deletar Produto                  ║");
                System.out.println("║ [3] Atualizar Produto                ║");
                System.out.println("║ [4] Ver Produtos                     ║");
                System.out.println("║ [5] Ver Pedidos                      ║");
                System.out.println("║ [6] Remover Pedido                   ║");
                System.out.println("║ [7] Logout                           ║");
                System.out.println("║ [8] Voltar                           ║");
                System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

                String line = scann.nextLine();

                switch (line) {
                    case "1" -> CadastrarProduto();
                    case "2" -> DeletarProduto();
                    case "3" -> AtualizarProduto();
                    case "4" -> VerTodosProdutos();
                    case "5" -> VerTodosPedidos();
                    case "6" -> RemoverPedidoPorId();
                    case "7" -> {
                        Funcionario.setPermission(0);
                        System.out.println(Estilos.DOURADO + "Logout realizado!" + Estilos.RESET);
                    }
                    case "8" -> { return; }
                    default -> System.out.println(Estilos.DOURADO + "Opção inválida!" + Estilos.RESET);
                }
            }
        }
    }


    public void FazerLogin() {
        System.out.println(Estilos.DOURADO + "Username: " + Estilos.RESET);
        String username = scann.nextLine();

        System.out.println(Estilos.DOURADO + "Senha: " + Estilos.RESET);
        String senha = scann.nextLine();

        Funcionario.Login(username, senha);
    }


    public void CadastrarProduto() {
        if (Funcionario.getPermission() != 1) {
            System.out.println(Estilos.DOURADO + "Acesso Negado." + Estilos.RESET);
            return;
        }

        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         CADASTRAR PRODUTO            ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

        System.out.println(Estilos.DOURADO + "1 - Esfiha | 2 - Bebida" + Estilos.RESET);
        String tipo = scann.nextLine();

        if (tipo.equals("1")) {
            System.out.println(Estilos.LARANJA + "\n--- CADASTRO DE ESFIHA ---" + Estilos.RESET);
            System.out.println(Estilos.DOURADO + "Sabor: " + Estilos.RESET);
            String sabor = scann.nextLine();

            System.out.println(Estilos.DOURADO + "Preco: " + Estilos.RESET);
            String valorStr = scann.nextLine().replace(",", ".");

            double valor;
            try {
                valor = Double.parseDouble(valorStr);
            } catch (Exception e) {
                System.out.println(Estilos.DOURADO + "Valor invalido!" + Estilos.RESET);
                return;
            }

            Esfihas esf = new Esfihas(sabor, sabor + " - " + sabor, "0", valor, true, sabor);
            Funcionario.CadastrarEsfihas(esf);

            System.out.println(Estilos.LARANJA + Estilos.NEGRITO + "\nEsfiha cadastrada com sucesso!" + Estilos.RESET);
        }

        if (tipo.equals("2")) {
            System.out.println(Estilos.LARANJA + "\n--- CADASTRO DE BEBIDA ---" + Estilos.RESET);
            System.out.println(Estilos.DOURADO + "Nome da Bebida: " + Estilos.RESET);
            String nomeBebida = scann.nextLine();

            System.out.println(Estilos.DOURADO + "Categoria (Ex: Refrigerante, Suco, Agua): " + Estilos.RESET);
            String categoria = scann.nextLine();

            System.out.println(Estilos.DOURADO + "Preco: " + Estilos.RESET);
            String valorStr = scann.nextLine().replace(",", ".");

            double valor;
            try {
                valor = Double.parseDouble(valorStr);
            } catch (Exception e) {
                System.out.println(Estilos.DOURADO + "Valor invalido!" + Estilos.RESET);
                return;
            }

            Bebidas beb = new Bebidas(nomeBebida, nomeBebida + " - " + categoria, "0", valor, true, categoria);
            Funcionario.CadastrarBebidas(beb);

            System.out.println(Estilos.LARANJA + Estilos.NEGRITO + "\nBebida cadastrada com sucesso!" + Estilos.RESET);
        }
    }


    public void DeletarProduto() {
        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          DELETAR PRODUTO             ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

        System.out.println(Estilos.DOURADO + "1 - Esfiha | 2 - Bebida" + Estilos.RESET);
        String tipo = scann.nextLine();

        System.out.println(Estilos.DOURADO + "ID: " + Estilos.RESET);
        String idStr = scann.nextLine();

        try {
            int id = Integer.parseInt(idStr);

            if (tipo.equals("1")) Funcionario.DeletarEsfihaID(id);
            if (tipo.equals("2")) Funcionario.DeletarBebidasID(id);

            System.out.println(Estilos.LARANJA + "Produto deletado com sucesso!" + Estilos.RESET);
        } catch (Exception e) {
            System.out.println(Estilos.DOURADO + "ID invalido!" + Estilos.RESET);
        }
    }


    public void VerTodosProdutos() {
        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          TODOS OS PRODUTOS            ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);
        System.out.println("\n" + Estilos.LARANJA + Estilos.NEGRITO + "--- ESFIHAS ---" + Estilos.RESET);
        Funcionario.ExibirEsfihas();
        System.out.println("\n" + Estilos.LARANJA + Estilos.NEGRITO + "--- BEBIDAS ---" + Estilos.RESET);
        Funcionario.ExibirBebidas();
        System.out.println();
    }

    public void VerTodosPedidos() {
        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║               PEDIDOS                ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

        PedidosGerais.Exibir();
    }


    public void RemoverPedidoPorId() {
        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         REMOVER PEDIDO               ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

        System.out.println(Estilos.DOURADO + "ID do pedido: " + Estilos.RESET);
        String idStr = scann.nextLine();

        try {
            int id = Integer.parseInt(idStr);
            PedidosGerais.RemoverPorID(id);
            System.out.println(Estilos.LARANJA + "Pedido removido com sucesso!" + Estilos.RESET);
        } catch (Exception e) {
            System.out.println(Estilos.DOURADO + "ID invalido!" + Estilos.RESET);
        }
    }

    public void AtualizarProduto() {
        if (Funcionario.getPermission() != 1) {
            System.out.println(Estilos.DOURADO + "Acesso Negado." + Estilos.RESET);
            return;
        }

        System.out.println(Estilos.BEGE + Estilos.NEGRITO);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         ATUALIZAR PRODUTO            ║");
        System.out.println("╚══════════════════════════════════════╝" + Estilos.RESET);

        System.out.println(Estilos.DOURADO + "1 - Esfiha | 2 - Bebida" + Estilos.RESET);
        String tipo = scann.nextLine();

        System.out.println(Estilos.DOURADO + "ID do produto: " + Estilos.RESET);
        String idStr = scann.nextLine();

        try {
            int id = Integer.parseInt(idStr);

            if (tipo.equals("1")) {
                Esfihas esfihaAtual = Funcionario.PegarEsfihaPeloID(id);

                if (esfihaAtual == null) {
                    System.out.println(Estilos.DOURADO + "Esfiha não encontrada!" + Estilos.RESET);
                    return;
                }

                System.out.println(Estilos.LARANJA + "\\n--- ATUALIZAR ESFIHA ---" + Estilos.RESET);
                System.out.println(Estilos.DOURADO + "Novo Sabor (atual: " + esfihaAtual.getSabor() + "): " + Estilos.RESET);
                String sabor = scann.nextLine();

                System.out.println(Estilos.DOURADO + "Novo Preco (atual: " + esfihaAtual.getPreco() + "): " + Estilos.RESET);
                String valorStr = scann.nextLine().replace(",", ".");

                double valor;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (Exception e) {
                    System.out.println(Estilos.DOURADO + "Valor inválido!" + Estilos.RESET);
                    return;
                }

                Esfihas esfihaAtualizada = new Esfihas(sabor, sabor + " - " + sabor, "0", valor, true, sabor);
                Funcionario.AtualizarEsfihaPorID(id, esfihaAtualizada);

                System.out.println(Estilos.LARANJA + Estilos.NEGRITO + "Esfiha atualizada com sucesso!" + Estilos.RESET);
            }

            if (tipo.equals("2")) {
                Bebidas bebidaAtual = Funcionario.PegarBebidasID(id);

                if (bebidaAtual == null) {
                    System.out.println(Estilos.DOURADO + "Bebida não encontrada!" + Estilos.RESET);
                    return;
                }

                System.out.println(Estilos.LARANJA + "\\n--- ATUALIZAR BEBIDA ---" + Estilos.RESET);
                System.out.println(Estilos.DOURADO + "Nova Categoria (atual: " + bebidaAtual.getCategoria() + "): " + Estilos.RESET);
                String categoria = scann.nextLine();

                System.out.println(Estilos.DOURADO + "Novo Preco (atual: " + bebidaAtual.getPreco() + "): " + Estilos.RESET);
                String valorStr = scann.nextLine().replace(",", ".");

                double valor;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (Exception e) {
                    System.out.println(Estilos.DOURADO + "Valor inválido!" + Estilos.RESET);
                    return;
                }

                Bebidas bebidaAtualizada = new Bebidas(bebidaAtual.getNome(), bebidaAtual.getNome() + " - " + categoria, "0", valor, true, categoria);
                Funcionario.AtualizarBebidaPorID(id, bebidaAtualizada);

                System.out.println(Estilos.LARANJA + Estilos.NEGRITO + "Bebida atualizada com sucesso!" + Estilos.RESET);
            }

        } catch (Exception e) {
            System.out.println(Estilos.DOURADO + "ID inválido!" + Estilos.RESET);
        }
    }
}