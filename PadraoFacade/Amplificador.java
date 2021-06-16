package PadraoFacade;

public class Amplificador {
    
    String description;
    DvdPlayer dvd;
    
    public Amplificador(String description) {
     this.description = description;
    }
    
    public void ligar() {
     System.out.println(description + " on");
    }
    
    public void desligar() {
     System.out.println(description + " desligando...");
    }
    
    public void setStereoSound() {
     System.out.println(description + " Som stereo ativado");
    }
    
    public void setSurroundSound() {
     System.out.println(description + " Som surround ativado");
    }
    
    public void setVolume(int level) {
     System.out.println(description + " ajustando volume para:" + level);
    }
   
    public void setDvd(DvdPlayer dvd) {
     System.out.println(description + " configurando dvd player " + dvd);
     this.dvd = dvd;
    }
    
    public String toString() {
     return description;
    }
   }
