package PadraoComposite;
public class Main {

    public static void main(String[] args) {
        Artigo a1 = new Artigo("a1", "conteudo01");
        Artigo a2 = new Artigo("a2", "conteudo02");
        Artigo a3 = new Artigo("a3", "conteudo03");
        Artigo a4 = new Artigo("a4", "conteudo04");
        Artigo a5 = new Artigo("a5", "conteudo05");
        Artigo a6 = new Artigo("a6", "conteudo06");
        Artigo a7 = new Artigo("a7", "conteudo07");
        Jornal j1 = new Jornal("jornal1");
        Caderno c1 = new Caderno("Caderno 1");
        Caderno c2 = new Caderno("Caderno 2");
        Revista r1 = new Revista("Revista 1");
        Revista r2 = new Revista("Revista 2");
        Revista r3 = new Revista("Revista 3");
        Revista r4 = new Revista("Revista 4");
        
        j1.setArtigo(a1);
        j1.addPublicacao(c1);
        j1.addPublicacao(c2);

        c1.setArtigo(a2);
        c1.addPublicacao(r1);
        c1.addPublicacao(r2);
        c1.addPublicacao(r3);
        
        c2.setArtigo(a3);
        c2.addPublicacao(r4);

        r1.setArtigo(a4);
        r2.setArtigo(a5);
        r3.setArtigo(a6);
        r4.setArtigo(a7);

        int publicacoes = j1.getPublicacoes();
        System.out.println(publicacoes);

        System.out.println();

        String s = j1.toString();
        System.out.println(s);
    
    }
    
}