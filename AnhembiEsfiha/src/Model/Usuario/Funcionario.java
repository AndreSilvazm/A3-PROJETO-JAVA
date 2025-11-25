package Model.Usuario;

public class Funcionario extends Usuario {
    private double salario;
    private int permission;

    public Funcionario() {
    }

    
    public Funcionario(String nome, String username, String senha, double salario, int permission) {
        this.salario = salario;
        this.permission = permission;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
    
}
