public class Main {
   public static void main(String[] args) {
        
        Door d = new Door();
        d.setEstado(new EstadoAberta());
        d.showStatus();

        d.setEstado(new EstadoFechada());
        d.showStatus();
   } 
}
