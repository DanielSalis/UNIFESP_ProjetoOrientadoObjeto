package PadraoComposite;
public class Artigo {
    public String nome;
    public String conteudo;

    public Artigo(String n, String c){
        nome = n;
        conteudo = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
