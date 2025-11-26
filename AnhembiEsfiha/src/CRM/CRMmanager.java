package CRM;

import Model.Pedido.Pedido;
import Model.Produto.Bebidas;
import Model.Produto.Esfihas;
import Model.Produto.PrincipalProdutos;
import Model.Usuario.Cliente;
import Model.Usuario.Funcionario;

import java.util.Scanner;

public class CRMmanager {

    private int opcao;
    private String sabor;

    public int getOpcao() {
        return opcao;
    }

    Scanner scann = new Scanner(System.in);

    //INSTANCIANDO OS PRODUTOS
    PrincipalProdutos Bebida = new Bebidas();
    Funcionario Funcionario = new Funcionario();
    Cliente Cliente = new Cliente();
    Pedido Pedido = new Pedido();

    public void MostrarMenuInicial() {
        System.out.println("Menu Inicial");
        System.out.println("[1]Login de Funcionario");
        System.out.println("[2]Cadastrar produto");
        System.out.println("[3]Ver Pedidos");
        System.out.println("[3]Fazer Pedidos");
        System.out.println("[4]Sair");
        this.opcao = scann.nextInt();
    }


    public void CadastrarPedido(){
        System.out.println("Cardapio");
        MostrarEsfihas();

        System.out.println("Selecione uma Esfiha");
        int EsfihaOpcao = scann.nextInt();

        MostrarBebidas();
        System.out.println("Agora, selecione uma bebida");
        int BebidaOpcao = scann.nextInt();

        System.out.println("Agora, Nos dia o seu nome");
        String ClienteNome = scann.next();

        System.out.println("PEDIDO FINALIZADO COM SUCESSO! ABAIXO, OS DETALHES DO SEU PEDIDO");
        ExibirPedidoCompleto(EsfihaOpcao, BebidaOpcao, ClienteNome);

    }

    public void ExibirPedidoCompleto(int EsfihaID, int BebidaID, String ClienteNome ){
        System.out.println(Funcionario.PegarEsfihaPeloID(EsfihaID).getId());
        System.out.println(Funcionario.PegarEsfihaPeloID(EsfihaID).getSabor());
        System.out.println(Funcionario.PegarBebidasID(BebidaID).getDescricao());
        double valorTotal = Funcionario.CalculoValorTotalPedido(EsfihaID, BebidaID);

        System.out.println("" + Funcionario.CalculoValorTotalPedido(EsfihaID, BebidaID));

        Pedido Pedido = new Pedido(ClienteNome, valorTotal,EsfihaID, BebidaID);

    }


    public void MostrarEsfihas() {
        System.out.println("Esfiha Selecionada: ");
        Funcionario.ExibirEsfihas();
    }

    public void MostrarBebidas() {
        System.out.println("Bebida Selecionada: ");
        Funcionario.ExibirBebidas();
    }

    private boolean VerificarFuncionario() {
        int permission = Funcionario.getPermission();
        if (permission == 1) {
            return true;
        }
        return false;
    }

    public void CadastrarProduto() {
        if (VerificarFuncionario()) {
            System.out.println("1 para cadastrar esfiha 2 para cadastrar bebida");
            int cadOpcao = scann.nextInt();

            if (cadOpcao == 1) {
                System.out.println("Digite um sabor");
                String sabor = scann.next();
                System.out.println("Digite o valor: ");
                double valor = scann.nextDouble();
                Esfihas Esfiha = new Esfihas(sabor, "CArne com cebola", "10", valor, true, sabor);
                Funcionario.CadastrarEsfihas(Esfiha);

            }
            if (cadOpcao == 2) {
                System.out.println("Digite a Categoria da bebida: ");
                String categoria = scann.next();
                System.out.println("Digite o Valor: ");
                double valor = scann.nextDouble();
                Bebidas bebidas = new Bebidas("Whiskey", "Ardente", "10", valor, true, categoria );
                Funcionario.CadastrarBebidas(bebidas);
            }
        }
    }

    public void DeletarEsfiha() {
        System.out.println("Qual id do produto para deletar: ");
        int id = scann.nextInt();
        Funcionario.DeletarEsfihaID(id);

    }

    public void DeletarBebida() {
        System.out.println("Qual id do produto para deletar: ");
        int id = scann.nextInt();
        Funcionario.DeletarBebidasID(id);

    }

    public void FazerLogin() {
        System.out.println("Coloque seu Username");
        String username = scann.next();
        System.out.println("Coloque sua senha");
        String senha = scann.next();
        Funcionario.Login(username, senha);
    }

    public void VerTodosPedidos() {
        System.out.println("Lista de todos os Pedidos: ");
        Funcionario.VerTodosOsPedidos();

    }

    public void RemoverPedidoPorId() {
        System.out.println("Qual id do pedido para ser removido: ");
        Funcionario.RemoverItemPedido(opcao);


    }
}
