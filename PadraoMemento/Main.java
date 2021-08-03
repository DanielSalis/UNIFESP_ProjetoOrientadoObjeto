public class Main {
    
    public static void main(String[] args) {
        Editor editor = new Editor(new JanelaDeTexto());
        editor.appendOnDocument("Hoje não\n");
        editor.appendOnDocument("Hoje não\n");
        editor.appendOnDocument("Hoje não\n");
        editor.salvar();
        
        editor.appendOnDocument("Hoje sim!\n");
        editor.desfazer();

        editor.appendOnDocument("Hoje sim?\n");
        editor.salvar();
    }

}
