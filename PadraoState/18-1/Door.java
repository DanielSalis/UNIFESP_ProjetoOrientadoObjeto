public class Door {
    public final Estado Aberta = new EstadoAberta();
    public final Estado Fechada = new EstadoFechada();

    public Estado Estado;

    public void setEstado(Estado estado) {
        this.Estado = estado;
    }

    public void showStatus(){
        Estado.status();
    }
}
