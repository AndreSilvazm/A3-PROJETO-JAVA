
package Produto;


public class Esfihas extends PrincipalProdutos {
      private String sabor;

    public Esfihas() {
    }

    public Esfihas( String nome, String descricao, String adicional, double valor, boolean combo, String sabor) {
        super(nome, descricao, adicional, valor, combo);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
