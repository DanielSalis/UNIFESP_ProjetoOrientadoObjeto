package PadraoFacade;

public class DvdPlayer {
    
    String descricao;
    int currentTrack;
    Amplificador amplificador;
    String filme;
    
    public DvdPlayer(String descricao, Amplificador amplificador) {
     this.descricao = descricao;
     this.amplificador = amplificador;
    }
    
    public void on() {
     System.out.println(descricao + " on");
    }
    
    public void off() {
     System.out.println(descricao + " off");
    }
   
    public void ejetarDisco() {
        filme = null;
        System.out.println(descricao + " ejetar disco");
    }
    
    public void play(String filme) {
     this.filme = filme;
     currentTrack = 0;
     System.out.println(descricao + " reproduzindo \"" + filme + "\"");
    }
   
    public void play(int track) {
     if (filme == null) {
      System.out.println(descricao + " não foi possível reproduzir " + track);
     } else {
      currentTrack = track;
      System.out.println(descricao + " reproduzindo " + currentTrack + " do filme: \"" + filme + "\"");
     }
    }
   
    public void stop() {
     currentTrack = 0;
     System.out.println(descricao + " parou de reproduzir \"" + filme + "\"");
    }
    
    public void pause() {
     System.out.println(descricao + " pausou \"" + filme + "\"");
    }
       
    public void setSurroundAudio() {
     System.out.println(descricao + " som surround");
    }
    
    public String toString() {
     return descricao;
    }
   }