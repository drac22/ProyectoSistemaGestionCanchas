package utp.integrador.DAO;

import java.util.List;
import utp.integrador.Model.Usuario;

public interface IUsuarioDAO {
    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioById(int id);
    Usuario agregarUsuario(Usuario usuario);
    Usuario modificarUsuario(Usuario usuario);
    boolean eliminarUsuario(int id);
    Usuario buscarUsuarioByUsername(String username);
}
