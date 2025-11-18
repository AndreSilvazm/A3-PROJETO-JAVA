
package Produto;

public class Bebidas extends PrincipalProdutos {
       private String categoria;

    public Bebidas() {

    }

    public Bebidas( String nome, String descricao, String adicional, double valor, boolean combo, String categoria) {
        super(nome, descricao, adicional, valor, combo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
