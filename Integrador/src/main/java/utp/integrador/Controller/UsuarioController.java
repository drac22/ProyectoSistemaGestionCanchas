package utp.integrador.Controller;

import java.util.List;
import utp.integrador.DAO.UsuarioDAO;
import utp.integrador.Model.Usuario;

public class UsuarioController {

    private final UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public List<Usuario> mostrarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }

    public void agregarCliente(Usuario usuario) {
        usuarioDAO.agregarUsuario(usuario);
    }

    public void modificarCliente(Usuario usuario) {
        usuarioDAO.modificarUsuario(usuario);
    }

    public void eliminarCliente(int idUsuario) {
        usuarioDAO.eliminarUsuario(idUsuario);
    }
}
