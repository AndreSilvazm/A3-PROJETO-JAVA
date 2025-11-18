
package Produto;


public class Esfihas extends PrincipalProdutos {
      private String sabor;

    public Esfihas() {
    }

    public Esfihas(int quantidade, String nome, String descricao, String adicional, double preco, boolean combo, String sabor) {
        super(quantidade, nome, descricao, adicional, preco, combo);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
  
}
