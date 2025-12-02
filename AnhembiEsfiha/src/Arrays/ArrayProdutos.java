package Arrays;

import Model.Produto.PrincipalProdutos;

public class ArrayProdutos<T extends PrincipalProdutos> implements InterfaceArrayProdutos<T> {
    private T[] lista;
    private int contador;
    private T[] NovoArray;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ArrayProdutos(int tamanho) {
        this.lista = (T[]) new PrincipalProdutos[tamanho];
        this.contador = 0;
        this.tamanho = tamanho;
    }

    @Override
    public void Inserir(T produto) {
        // ANTES DE QUALQUER NOVA INTERAÇÃO VERIFICAR SE O ARRAY ESTÁ CHEIO;
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
            System.out.println("ID: " + lista[i].getId());
            System.out.println("Nome: " + lista[i].getNome());
            System.out.println("Descrição: " + lista[i].getDescricao());
            System.out.println("Preço: R$ " + lista[i].getPreco());
            System.out.println("---");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] NovoArray() {
        this.NovoArray = (T[]) new PrincipalProdutos[lista.length + 3];
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
            if(lista[i].getId()== id){
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

    public T PegarDadosProdutoPeloID(int id){
        int index = PegarIndexPeloID(id);

        if (index == -1) {
            return null;
        }

        return lista[index];
    }

    @Override
    public boolean AtualizarProdutoPorID(int id, T produtoAtualizado) {
        int index = PegarIndexPeloID(id);

        if (index == -1) {
            System.out.println("ID não encontrado.");
            return false;
        }

        // Atualizar os dados do produto usando os setters
        lista[index].setNome(produtoAtualizado.getNome());
        lista[index].setDescricao(produtoAtualizado.getDescricao());
        lista[index].setAdicional(produtoAtualizado.getAdicional());
        lista[index].setPreco(produtoAtualizado.getPreco());
        lista[index].setCombo(produtoAtualizado.isCombo());
        lista[index].setQuantidade(produtoAtualizado.getQuantidade());

        return true;
    }
}
