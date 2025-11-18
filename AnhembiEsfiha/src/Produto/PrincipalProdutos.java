package Produto;

public class PrincipalProdutos {

    private int id, quantidade;
    private String descricao, nome, adicional;
    private double preco;
    private boolean combo;
    private int valor = 1;

    public PrincipalProdutos() {
        this.id = valor;
        valor++;
    }

    public PrincipalProdutos(int quantidade, String nome, String descricao, String adicional, double preco, boolean combo) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
        this.adicional = adicional;
        this.preco = preço;
        this.combo = combo;
        this.id = valor;
        valor++;

    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preço) {
        this.preco = preço;
    }

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
