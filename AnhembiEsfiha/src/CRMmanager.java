

  public class CRMManager {
    
    private Esfiha[] esfihas;
    private int contadorEsfihas;
    private static int proximoId = 1;

   
    public CRMManager() {
        this.esfihas = new Esfiha[10]; 
        this.contadorEsfihas = 0;
        
        System.out.println("Cardápio carregando...");
        
        // Inserção dos 6 sabores iniciais
        adicionar(new Esfiha("Aberta", "Carne Tradicional", "Padrão", 5.50, 8));
        adicionar(new Esfiha("Aberta", "Queijo Mussarela", "Padrão", 4.90, 7));
        adicionar(new Esfiha("Fechada", "Frango c/ Catupiry Original", "Padrão", 6.80, 10));
        adicionar(new Esfiha("Doce", "Chocolate c/ Morango", "Mini", 7.50, 6));
        adicionar(new Esfiha("Fechada", "Brócolis c/ Queijo", "Padrão", 6.50, 9));
        adicionar(new Esfiha("Aberta", "Calabresa c/ Cebola", "Padrão", 5.90, 8));
        
        System.out.println(this.contadorEsfihas + " sabores disponíveis.");
    }
    
    
    public void adicionar(Esfiha novaEsfiha) { 
        if (this.contadorEsfihas < this.esfihas.length) {
            novaEsfiha.setId(proximoId++);
            this.esfihas[this.contadorEsfihas] = novaEsfiha;
            this.contadorEsfihas++;
        }
        
    }
    
    
    private int buscarIndicePorId(int id) {
        for (int i = 0; i < this.contadorEsfihas; i++) {
            if (this.esfihas[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

   
    public Esfiha buscarPorId(int id) {
        int indice = buscarIndicePorId(id);
        return (indice != -1) ? this.esfihas[indice] : null;
    }
    
   
    public Esfiha[] listarTodos() {
        Esfiha[] lista = new Esfiha[this.contadorEsfihas];
        for (int i = 0; i < this.contadorEsfihas; i++) {
            lista[i] = this.esfihas[i];
        }
        return lista;
    }
}

