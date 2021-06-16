package PadraoFacade;

public class Projetor {
    
    String descricao;
    DvdPlayer dvdPlayer;
    
    public Projetor(String descricao, DvdPlayer dvdPlayer) {
        this.descricao = descricao;
        this.dvdPlayer = dvdPlayer;
    }
    
    public void on() {
        System.out.println(descricao + " on");
    }
    
    public void off() {
        System.out.println(descricao + " off");
    }
   
    public void wideScreenMode() {
        System.out.println(descricao + " reproduzindo da maneira errada 16x9 - fica a dica se for jogar cs");
    }
   
    public void squareScreenMode() {
        System.out.println(descricao + " reproduzindo da maneira certa 4x3 - escutou a dica");
    }
     
    public String toString() {
        return descricao;
    }
   }