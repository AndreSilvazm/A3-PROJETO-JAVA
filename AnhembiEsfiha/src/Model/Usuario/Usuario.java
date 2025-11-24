package Model.Usuario;

public abstract class Usuario {

    private static int NEXT_ID = 1;

    private int ID;
    private String nome;
    private String username;
    private String senha;

    public Usuario() {
        this.ID = NEXT_ID++;
    }

    public Usuario(String nome, String username, String senha){
        this.ID = NEXT_ID++;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
    }

    public int getID() {
        return ID;
    }
}
