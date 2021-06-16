package PadraoComposite;
import java.util.ArrayList;
import java.util.List;

public class Jornal extends Publicacao {
    public Jornal(String n) {
        super(n);
    }

    List<Publicacao> cadernos = new ArrayList<Publicacao>();

    public void addPublicacao(Publicacao p){
        cadernos.add(p);
    }

    public void removePublicacao(Publicacao p){
        cadernos.remove(p);
    }

    @Override
    public int getPublicacoes(){
        int counter = 0;

        if(cadernos.size() > 0){
            for(Publicacao caderno : cadernos){
                counter += caderno.getPublicacoes();
            }
        }

        if(getArtigo() != null){
            counter ++;
        }
        

        return counter;
    }

    public Publicacao getCaderno(String n){
        for(Publicacao caderno : cadernos){
            if(caderno.getNome() == n){
                return caderno;
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

        if(cadernos.size() > 0){
            for(Publicacao caderno : cadernos){
                s = s + " " +caderno.toString();
            }
        }

        if(getArtigo() != null){
            s = s + " " + artigo.getNome();
        }
        

        return s;
    }
}
