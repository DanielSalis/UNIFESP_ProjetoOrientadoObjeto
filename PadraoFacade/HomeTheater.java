package PadraoFacade;

public class HomeTheater {
    Amplificador amp;
    DvdPlayer dvd;
    Projetor projector;
    LuzAmbiente luz;
    
    public HomeTheater(Amplificador a, DvdPlayer d, Projetor p, LuzAmbiente l) {
     this.amp = a;
     this.dvd = d;
     this.projector = p;
     this.luz = l;
    }
    
    public void ativarModoCinema(String movie) {
     System.out.println("\n Iniciando configuração de Filme \n");
     luz.dim(10);
     projector.on();
     projector.wideScreenMode();
     amp.ligar();
     amp.setDvd(dvd);
     amp.setSurroundSound();
     amp.setVolume(5);
     dvd.on();
     dvd.play(movie);
    }
 
    public void encerrarModoCinema() {
     System.out.println("\nEncerrando configuração de filme\n");
     luz.on();
     projector.squareScreenMode();
     projector.off();
     amp.desligar();
     dvd.stop();
     dvd.ejetarDisco();
     dvd.off();
     luz.aumentar(10);
    }
   
    public void listenToDvD(String nomeDvD) {
     System.out.println("\nIniciando DVD:"+nomeDvD+"\n");
     luz.on();
     amp.ligar();
     amp.setVolume(10);
     amp.setStereoSound();
    }
   
    public void endDvd() {
     System.out.println("\nDesligando aparelho de DVD\n");
     amp.desligar();
     dvd.off();
    }
   
    public void listenToRadio(double frequency) {
     System.out.println("\nIniciando Radio\n");
     amp.ligar();
     amp.setVolume(8);
    }
   
    public void endRadio() {
     System.out.println("Amplificador desligado");
     amp.desligar();
    }
   }