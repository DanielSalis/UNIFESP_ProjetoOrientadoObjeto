package PadraoAdapter;

public class User {
    private String nome;
    private String sobrenone;
    private int idade;

    public User(String n, String s, int i) {
        nome = n;
        sobrenone = s;
        idade = i;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenone() {
        return sobrenone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenone(String sobrenone) {
        this.sobrenone = sobrenone;
    }

    public String toString() {
        return getNome();
    }
}
