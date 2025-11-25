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
        System.out.println("[1]Cadastrar Produto");
        System.out.println("[2]Sair");
        this.opcao = scann.nextInt();
    }

    public void MostrarProdutos() {
        System.out.println("Produto Selecionado:");
        Funcionario.ExibirProdutos();
    }


    public void CadastrarProduto() {
        System.out.println("1 para cadastrar esfiha 2 para cadastrar bebida");
        int cadOpcao = scann.nextInt();

        if (cadOpcao == 1) {
            System.out.println("Digite um sabor");
            String sabor = scann.next();
            System.out.println("Digite o valor: ");
            double valor = scann.nextDouble();
            PrincipalProdutos Esfiha = new Esfihas(sabor, "CArne com cebola", "10", valor, true, sabor);
            Funcionario.CadastrarProduto(Esfiha);

        }
    }
}
