
package Produto;

public class PrincipalProdutos {
    private int id;
    private String descricao, nome, adicional;
    private double valor;
    private boolean combo;

    public PrincipalProdutos() {

    }

    public PrincipalProdutos( String nome, String descricao, String adicional, double valor, boolean combo) {
        this.id =+ 1;
        this.nome = nome;
        this.descricao = descricao;
        this.adicional = adicional;
        this.valor = valor;
        this.combo = combo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

}

