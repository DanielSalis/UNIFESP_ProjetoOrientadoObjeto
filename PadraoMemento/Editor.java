public class Editor {

    private JanelaDeTexto janelaDialog;
    private EstadoJanelaDeTexto estadoAtualDoTexto;

    public Editor(JanelaDeTexto textWindow) {
        this.janelaDialog = textWindow;
    }

    public void appendOnDocument(String text) {
        janelaDialog.addText(text);
        System.out.println("Concatenando texto atual: \n" + janelaDialog.getCurrentText());
    }

    public void salvar() {
        estadoAtualDoTexto = janelaDialog.save();
        System.out.println("Salvando estado atual do texto: \n" + janelaDialog.getCurrentText());
    }

    public void desfazer() {
        janelaDialog.restore(estadoAtualDoTexto);
        System.out.println("Desfazendo mudança no texo: \n" + janelaDialog.getCurrentText());
    }
}