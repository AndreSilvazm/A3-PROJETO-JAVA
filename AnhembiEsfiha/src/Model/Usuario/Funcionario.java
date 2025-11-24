package Model.Usuario;

public class Funcionario extends Usuario {
    private double salario;
    private int permission;

    public Funcionario(String nome, String username, String senha, double salario, int permission) {
        this.salario = salario;
        this.permission = permission;
    }
}
