package Model.Pedido;

public class Pedido {
    private int IdPedido;
    private String clienteNome;
    private static int valor = 1;
    private double valorTotal;

    public Pedido() {
    this.IdPedido = valor++;
        
    }

    public Pedido(int IdPedido, String clienteNome, double valorTotal) {
        this.IdPedido = valor++;
        this.clienteNome = clienteNome;
        this.valorTotal = valorTotal;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        Pedido.valor = valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdPedido() {
        return IdPedido;
    }

}
