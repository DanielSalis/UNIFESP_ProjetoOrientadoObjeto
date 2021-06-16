package PadraoComposite;
import java.util.ArrayList;
import java.util.List;

public class Caderno extends Publicacao {
    public Caderno(String n) {
        super(n);
    }

    List<Publicacao> revistas = new ArrayList<Publicacao>();

    public void addPublicacao(Publicacao p){
        revistas.add(p);
    }

    public void removePublicacao(Publicacao p){
        revistas.remove(p);
    }

    @Override
    public int getPublicacoes(){
        int counter = 0;

        if(revistas.size() > 0){
            for(Publicacao revista : revistas){
                counter += revista.getPublicacoes();
            }
        }

        if(getArtigo() != null){
            counter ++;
        }

        return counter;
    }

    public Publicacao getRevista(String n){
        for(Publicacao revista : revistas){
            if(revista.getNome() == n){
                return revista;
            }
        }

        return null;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Artigo getArtigo() {
        return super.getArtigo();
    }

    @Override
    public String toString() {
        String s = getNome();

        if(revistas.size() > 0){
            for(Publicacao revista : revistas){
                s = s + " " +revista.toString();
            }
        }

        if(getArtigo() != null){
            s = s + " " + artigo.getNome();
        }
        

        return s;
    }
}
