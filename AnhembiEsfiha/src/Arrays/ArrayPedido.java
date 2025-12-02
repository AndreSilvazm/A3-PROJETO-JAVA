package Arrays;

import Model.Pedido.Pedido;

public class ArrayPedido implements ArrayPedidoInterface {

    private Pedido[] lista;
    private int contador;
    private Pedido[] NovoArray;
    private int tamanho;

    public ArrayPedido(int tamanho) {
        this.lista = new Pedido[tamanho];
        this.contador = 0;
        this.tamanho = tamanho;
    }

    @Override
    public void Inserir(Pedido produto) {

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
            System.out.println(lista[i].getIdPedido());
            System.out.println(lista[i].getClienteNome());
            System.out.println(lista[i].getValorTotal());

        }
    }

    @Override
    public Pedido[] NovoArray() {
        this.NovoArray = new Pedido[lista.length + 3];
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
            if(lista[i].getIdPedido() == id){
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
