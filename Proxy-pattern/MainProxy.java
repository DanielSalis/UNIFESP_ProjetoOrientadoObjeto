public class MainProxy {

    public static void main(String[] args) {

        Livro l1 = new ProxyBook("Harry Potter a Camara Filosofal,","Nelson Rodrigues", true);
        l1.info();
        l1 = ((ProxyBook) l1).settingAnBook();
        l1.info();
    
        Livro l2 = new ProxyBook("Percy Johnson e o Prisioneiro de Askaban,","Machado de assis", true);
        l2.info();
        l2 = ((ProxyBook) l2).settingAnBook();
        l2.info();
        
    
    }
}