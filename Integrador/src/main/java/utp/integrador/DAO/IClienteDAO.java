package utp.integrador.DAO;

import java.util.List;
import utp.integrador.Model.Cliente;

public interface IClienteDAO {
    List<Cliente> listarClientes();
    Cliente buscarClienteById(int id);
    Cliente agregarCliente(Cliente cliente);
    Cliente modificarCliente(Cliente cliente);
    boolean eliminarCliente(int id);
}
