package Model.Usuario;

import Arrays.Array;
import Arrays.ArrayPedido;
import Model.Produto.PrincipalProdutos;
import Arrays.ArrayEsfihas;
import Model.Produto.Esfihas;
import Model.Produto.Bebidas;
import Arrays.ArrayBebidas;

public class Funcionario extends Usuario {

    private double salario;
    private int permission;

    Array ListaProdutos = new Array(3);
    ArrayPedido ListaPedidos = new ArrayPedido(3);
    ArrayEsfihas ListaEsfihas = new ArrayEsfihas(3);
    ArrayBebidas ListaBebidas = new ArrayBebidas(3);

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

    public void CadastrarEsfihas(Esfihas esfihas) {
        ListaEsfihas.Inserir(esfihas);
    }

    public boolean DeletarEsfihaID(int Id) {
        return ListaEsfihas.RemoverPorID(Id);
    }

    public void ExibirEsfihas() {
        ListaEsfihas.Exibir();
    }

    public void CadastrarBebidas(Bebidas bebidas) {
        ListaBebidas.Inserir(bebidas);
    }

    public void DeletarBebidasID(int Id) {
        return ListaBebidas.BebidasRemoverPorID(Id);
    }

    public void ExibirBebidas() {
        ListaBebidas.Exibir();

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

    public void VerTodosOsPedidos() {
        ListaPedidos.Exibir();

    }

    public void RemoverItemPedido(int id) {
        ListaPedidos.RemoverPorID(id);

    }

}
