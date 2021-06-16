package PadraoFacade;

public class LuzAmbiente {
    
    String descricao;
 
    public LuzAmbiente(String descricao) {
        this.descricao = descricao;
    }
     
    public void on() {
        System.out.println(descricao + " on");
    }
     
    public void off() {
        System.out.println(descricao + " off");
    }
     
    public void dim(int level) {
        System.out.println(descricao + " diminuindo luz " + level  + "%");
    }

    public void aumentar(int level) {
        System.out.println(descricao + " aumentando luz " + level  + "%");
    }
      
    public String toString() {
            return descricao;
    }
   }