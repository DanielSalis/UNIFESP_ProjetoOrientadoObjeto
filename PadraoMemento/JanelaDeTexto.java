public class JanelaDeTexto {

    private StringBuilder textoAtual;

    public JanelaDeTexto() {
        this.textoAtual = new StringBuilder();
    }

    public String getCurrentText() {
        return textoAtual.toString();
    }

    public void addText(String t) {
        textoAtual.append(t);
    }

    public EstadoJanelaDeTexto save() {
        return new EstadoJanelaDeTexto(textoAtual.toString());
    }

    public void restore(EstadoJanelaDeTexto estado) {
        textoAtual = new StringBuilder(estado.getTexto());
    }
}