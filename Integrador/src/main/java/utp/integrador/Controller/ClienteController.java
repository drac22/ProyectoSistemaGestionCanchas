package utp.integrador.Controller;

import java.util.List;
import utp.integrador.DAO.ClienteDAO;
import utp.integrador.Model.Cliente;

public class ClienteController {

    private final ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
    public List<Cliente> mostrarClientes(){
        return clienteDAO.listarClientes();
    }
    
    public void agregarCliente(Cliente cliente){
        clienteDAO.agregarCliente(cliente);
    }
    
    public void modificarCliente(Cliente cliente){
        clienteDAO.modificarCliente(cliente);
    }
    
    public void eliminarCliente(int idCliente){
        clienteDAO.eliminarCliente(idCliente);
    }
}
