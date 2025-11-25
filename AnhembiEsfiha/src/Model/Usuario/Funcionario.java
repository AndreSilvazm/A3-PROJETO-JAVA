package Model.Usuario;

import Arrays.Array;
import Model.Produto.PrincipalProdutos;

public class Funcionario extends Usuario {

    private double salario;
    private int permission;

    Array ListaProdutos = new Array(3);

    public Funcionario() {
    }

    public Funcionario(String nome, String username, String senha, double salario, int permission) {
        this.salario = salario;
        this.permission = permission;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
    //EXIBIR PRODUTOS

    public void CadastrarProduto(PrincipalProdutos Produto) {
        ListaProdutos.Inserir(Produto);
    }

    public boolean DeletarProdutoPeloID(int Id) {
        return ListaProdutos.RemoverPorID(Id);
    }

    public void ExibirProdutos() {
        ListaProdutos.Exibir();
    }

    public void Login(String username, String senha) {
        System.out.println(username);
        System.out.println(senha);
        if (senha.equals("admin") && username.equals("admin")) {
            System.out.println("Permissão de admin logada");
            this.permission = 1;
        } else {
            System.out.println("Acesso Negado");
        }
    }
}