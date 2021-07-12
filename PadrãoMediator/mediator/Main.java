public class Main 
{
    public static void main(String[] args) 
    {
        InterfaceDeChat chatroom = new ChatRoom();
        Usuario userDaniel = new UserChat(chatroom,"01", "Daniel");
        Usuario userMilena = new UserChat(chatroom,"02", "Milena");
        
        chatroom.adicionarUsuario(userDaniel);
        chatroom.adicionarUsuario(userMilena);
        userDaniel.enviarMensagem("Salve, deboas?", "2");
        userMilena.enviarMensagem("Beleza na represa e você?", "1");
    }
}