package PadraoComposite;

public class Revista extends Publicacao {
    public Revista(String n) {
        super(n);
    }

    @Override
    public int getPublicacoes(){
        int counter = 0;

        if(getArtigo() != null){
            counter ++;
        }

        return counter;
    }

    @Override
    public void setArtigo(Artigo artigo) {
        super.setArtigo(artigo);
    }

    @Override
    public Artigo getArtigo() {
        return super.getArtigo();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String toString() {
        String s = "";

        if(getArtigo() != null){
            s = s + " " + artigo.getNome();
        }
        
        s = s + " " + getNome();

        return s;
    }
}
