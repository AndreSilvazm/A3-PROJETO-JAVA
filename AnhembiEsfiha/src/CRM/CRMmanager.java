package CRM;

import Model.Produto.Bebidas;
import Model.Produto.Esfihas;
import Model.Produto.PrincipalProdutos;
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

    public void MostrarMenuInicial() {
        System.out.println("Menu Inicial");
        System.out.println("[1]Login de Funcionario");
        System.out.println("[2]Cadastrar produto");
        System.out.println("[3]Ver Pedidos");
        this.opcao = scann.nextInt();
    }

    public void MostrarEsfihas() {
        System.out.println("Esfiha Selecionada: ");
        Funcionario.ExibirEsfihas();
    }
public void MostrarBebidas(){
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
            if(cadOpcao == 2){
                System.out.println("Digite a Categoria da bebida: ");
                String categoria = scann.next();
                System.out.println("Digite o Valor: ");
                double valor = scann.nextDouble();
                Bebidas bebidas = null;
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
    int id= scann.nextInt();
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
