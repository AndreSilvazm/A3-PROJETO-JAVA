package Model.Usuario;

import Arrays.ArrayPedido;
import Arrays.ArrayProdutos;
import Model.Produto.Esfihas;
import Model.Produto.Bebidas;

public class Funcionario extends Usuario {

    private double salario;
    private int permission;

    ArrayPedido ListaPedidos = new ArrayPedido(3);
    ArrayProdutos<Esfihas> ListaEsfihas = new ArrayProdutos<>(3);
    ArrayProdutos<Bebidas> ListaBebidas = new ArrayProdutos<>(3);

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

    public boolean DeletarEsfihaID(int id) {
        return ListaEsfihas.RemoverPorID(id);
    }

    public void ExibirEsfihas() {
        ListaEsfihas.Exibir();
    }


    public void CadastrarBebidas(Bebidas bebidas) {
        ListaBebidas.Inserir(bebidas);
        System.out.println("BEBIDA INSERIDA COM SUCESSO");
    }

    public boolean DeletarBebidasID(int id) {
        return ListaBebidas.RemoverPorID(id);
    }

    public void ExibirBebidas() {
        ListaBebidas.Exibir();

    }

    public void Login(String username, String senha) {
        if (senha.equals("admin") && username.equals("admin")) {
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

    public Esfihas PegarEsfihaPeloID(int id) {
        return ListaEsfihas.PegarDadosProdutoPeloID(id);
    }

    public Bebidas PegarBebidasID(int id) {
        return ListaBebidas.PegarDadosProdutoPeloID(id);
    }

    public double CalculoValorTotalPedido(int esfihaID, int bebidasID) {
        return PegarEsfihaPeloID(esfihaID).getValor() +  PegarBebidasID(bebidasID).getValor();
    }

    public void AtualizarEsfihaPorID(int id, Esfihas esfihaAtualizada) {
        ListaEsfihas.AtualizarProdutoPorID(id, esfihaAtualizada);
    }

    public void AtualizarBebidaPorID(int id, Bebidas bebidaAtualizada) {
        ListaBebidas.AtualizarProdutoPorID(id, bebidaAtualizada);
    }

}
