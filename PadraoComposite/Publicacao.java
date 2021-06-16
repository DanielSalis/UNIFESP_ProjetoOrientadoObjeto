package PadraoComposite;
public class Publicacao {
    public Artigo artigo;
    public String nome;

    public Publicacao(String n){
        nome = n;
    }

    public int  getPublicacoes(){
        return 1;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
