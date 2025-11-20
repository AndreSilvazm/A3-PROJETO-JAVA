package Produto;

public abstract class PrincipalProdutos {

    private int id, quantidade;
    private String descricao, nome, adicional;
    private double preco;
    private boolean combo;
    private static int valor = 1;

    public PrincipalProdutos() {
        this.id = valor++;

    }

    public PrincipalProdutos(int quantidade, String nome, String descricao, String adicional, double preco, boolean combo) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
        this.adicional = adicional;
        this.preco = preco;
        this.combo = combo;
        this.id = valor++;


    }

    // Adicionado para compatibilidade com chamadas de super em classes filhas
    public PrincipalProdutos(String nome, String descricao, String adicional, double preco, boolean combo) {
        this.nome = nome;
        this.descricao = descricao;
        this.adicional = adicional;
        this.preco = preco;
        this.combo = combo;
        this.id = valor++;
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


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}