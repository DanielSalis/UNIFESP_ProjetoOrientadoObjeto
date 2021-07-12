public class UserChat extends Usuario {
     
  public UserChat(InterfaceDeChat room, String id, String name) {
      super(room, id, name);
  }

  @Override
  public void receberMensagem(String message) {
      System.out.println(this.getName() + " " + this.getId() + " <- mensagem recebida : " + message);
  }

  @Override
  public void enviarMensagem(String mensagem, String identificadorDoUsuario) {
      System.out.println(this.getName() + " " + this.getId() + " -> Mensagem enviada : " + mensagem);
      getMediator().enviar(mensagem, identificadorDoUsuario);
  }

}