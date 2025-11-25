package Model.Endereco;

public class Endereco {

    private String Rua;
    private String numero;
    private String bairro;

    public Endereco(String Rua, String numero, String bairro) {
        this.Rua = Rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco() {

    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void CadastrarEndereço() {
    }
}
