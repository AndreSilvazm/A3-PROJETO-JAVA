package Produto;

public class Bebidas extends PrincipalProdutos {
    private String categoria;

    public Bebidas() {

    }

    public Bebidas(int quantidade, String nome, String descricao, String adicional, double preco, boolean combo, String categoria) {
        super(quantidade, nome, descricao, adicional, preco, combo);
        this.categoria = categoria;
    }

    // Construtor adicional compatível com PrincipalProdutos(String, String, String, double, boolean)
    public Bebidas(String nome, String descricao, String adicional, double preco, boolean combo, String categoria) {
        super(nome, descricao, adicional, preco, combo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}