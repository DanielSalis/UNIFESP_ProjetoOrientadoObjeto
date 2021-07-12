import java.util.HashMap;
import java.util.Map;
 
public class ChatRoom implements InterfaceDeChat {
 
    private Map<String, Usuario> usersMap = new HashMap<>();
 
    @Override
    public void enviar(String m, String id) 
    {
        Usuario usuario = usersMap.get(id);
        usuario.receberMensagem(m);
    }
 
    @Override
    public void adicionarUsuario(Usuario u) {
        this.usersMap.put(u.getId(), u);
    }
}