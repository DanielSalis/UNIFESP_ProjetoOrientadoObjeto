package PadraoFacade;

public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador("Amplificador A4000");
        DvdPlayer dvd = new DvdPlayer("DVD Player Samsumg", amp);
        Projetor projetor = new Projetor("Projector Samsumg", dvd);
        LuzAmbiente luz = new LuzAmbiente("Luzes inteligentes da Positivo");
       
        HomeTheater homeTheater = new HomeTheater(amp, dvd, projetor, luz);
       
        homeTheater.ativarModoCinema("Scott Pilgrim contra o mundo");
        homeTheater.encerrarModoCinema();
       }
}
