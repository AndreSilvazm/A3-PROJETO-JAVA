package Model.Usuario;

import Arrays.ArrayPedido;
import Model.Pedido.Pedido;

public class Cliente extends Usuario {
    private int carteira;


    ArrayPedido ListaPedidos = new ArrayPedido(3);

    public Cliente() {
    }
    public Cliente(String cliente_nome, String cliente_senha, String cliente_username, String telefone, int carteira) {
        super(cliente_nome, cliente_username, cliente_senha);
        this.carteira = carteira;
    }

    public void CadastrarPedido(Pedido pedido){
        ListaPedidos.Inserir(pedido);
    }

}
