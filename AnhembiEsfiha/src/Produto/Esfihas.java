
package Produto;


public class Esfihas extends PrincipalProdutos {
      private String sabor;

    public Esfihas() {
    }

    public Esfihas(int id, String nome, String descricao, String adicional, double valor, boolean combo, String sabor) {
        super(id, nome, descricao, adicional, valor, combo);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
