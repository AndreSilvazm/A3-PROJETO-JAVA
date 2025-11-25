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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static int getNEXT_ID() {
        return NEXT_ID;
    }
    
}
