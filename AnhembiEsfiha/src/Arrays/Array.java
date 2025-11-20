package Arrays;

import Produto.PrincipalProdutos;

public class Array implements Arrays {
    private PrincipalProdutos[] lista;
    private int contador;
    private PrincipalProdutos[] NovoArray;
    private int tamanho;

    public Array(int tamanho) {
        this.lista = new PrincipalProdutos[tamanho];
        this.contador = 0;
        this.tamanho = tamanho;
    }

    @Override
    public void Inserir(PrincipalProdutos produto) {

        //ANTES DE QUALQUER NOVA INTERAÇÃO VERIFICAR SE O ARRAY ESTÁ CHEIO;

        if(VerificaSeOArrayEstaCheio()) {
            System.out.println("Aumentando Tamanho da Lista");
            this.lista = this.NovoArray();
        }

        if (contador < lista.length) {
            lista[contador] = produto;
            contador++;
        } else {
            System.out.println("Array cheio!");
        }
    }

    @Override
    public void Exibir() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i].getNome());
            System.out.println(lista[i].getId());
            System.out.println(lista[i].getDescricao());
            System.out.println(lista[i].getValor());
        }
    }

    @Override
    public PrincipalProdutos[] NovoArray() {
        this.NovoArray = new PrincipalProdutos[lista.length + 3];
        for (int i = 0; i < contador; i++) {
            NovoArray[i] = lista[i];
        }
        return NovoArray;
    }

    private boolean VerificaSeOArrayEstaCheio(){
        return this.contador == lista.length;
    }

    public int PegarIndexPeloID(int id){
        for (int i = 0; i < contador; i++) {
            if(lista[i].getId() == id){
                return i;
            }
        }

        return -1;
    }

    public boolean RemoverPorID(int id) {
        int index = PegarIndexPeloID(id);

        if (index == -1) {
            System.out.println("ID não encontrado.");
            return false;
        }

        // Deslocar todos os elementos para trás
        for (int i = index; i < contador - 1; i++) {
            lista[i] = lista[i + 1];
        }

        // Limpar o último elemento
        lista[contador - 1] = null;

        // Decrementar o contador
        contador--;

        return true;
    }
}
