
package Produto;

public class Bebidas extends PrincipalProdutos {
       private String categoria;

    public Bebidas() {

    }

    public Bebidas(int id, String nome, String descricao, String adicional, double valor, boolean combo, String categoria) {
        super(id, nome, descricao, adicional, valor, combo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
