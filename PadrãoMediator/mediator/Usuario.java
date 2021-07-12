public abstract class Usuario
{
    private InterfaceDeChat chatMediador;
     
    private String id;
    private String nome;
     
    public Usuario(InterfaceDeChat r, String i, String n){
        this.chatMediador = r;
        this.nome = i;
        this.id = n;
    }
     
    public abstract void enviarMensagem(String msg, String userId);
    public abstract void receberMensagem(String msg);
 
    public InterfaceDeChat getMediator() {
        return chatMediador;
    }
 
    public String getId() {
        return id;
    }
 
    public String getName() {
        return nome;
    }
}