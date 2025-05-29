package utp.integrador.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.integrador.Model.Cliente;
import utp.integrador.Model.Conexion;

public class ClienteDAO implements IClienteDAO {

    //listar
    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        var sql = "SELECT * FROM tbl_cliente ORDER BY id";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setUsername(rs.getString("username"));
                cliente.setPassword(rs.getString("password"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setDireccion(rs.getString("direccion"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar un Cliente: " + e.getMessage());
        }
        return clientes;
    }

    //buscar
    @Override
    public Cliente buscarClienteById(int id) {
        PreparedStatement ps;
        ResultSet rs;
        var sql = "SELECT * FROM tbl_cliente WHERE id = ?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) { // next pregeunta si hay registros
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setUsername(rs.getString("username"));
                cliente.setPassword(rs.getString("password"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setDireccion(rs.getString("direccion"));
                return cliente;
            }
        } catch (SQLException e) {
            System.out.println("Error al encontrar el Cliente por Id: " + e.getMessage());
        }
        return null;
    }

    //insertar
    @Override
    public Cliente agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        var sql = "INSERT INTO tbl_cliente(nombres, apellidos, correo, username, password, celular, direccion) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getUsername());
            ps.setString(5, cliente.getPassword());
            ps.setString(6, cliente.getCelular());
            ps.setString(7, cliente.getDireccion());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar un Cliente: " + e.getMessage());
        }
        return cliente;
    }

    //actualizar
    @Override
    public Cliente modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        var sql = "UPDATE tbl_cliente SET nombres=?, apellidos=?, correo=?, username=?, password=?, celular=?, direccion=? WHERE id=?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getUsername());
            ps.setString(5, cliente.getPassword());
            ps.setString(6, cliente.getCelular());
            ps.setString(7, cliente.getDireccion());
            ps.setInt(8, cliente.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al modificar el Cliente: " + e.getMessage());
        }
        return cliente;
    }

    //eliminar
    @Override
    public boolean eliminarCliente(int id) {
        PreparedStatement ps;
        var sql = "DELETE FROM tbl_cliente WHERE id=?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el Cliente: " + e.getMessage());
        }
        return false;
    }

//    public static void main(String[] args) {
//        IClienteDAO clienteDAO = new ClienteDAO();
//
//        var clientes = clienteDAO.listarClientes();
//        clientes.forEach(System.out::println);
//        
//        var buscarCliente = clienteDAO.buscarClienteById(2);
//        if (buscarCliente != null) {
//            System.out.println("Cliente encontrado");
//            System.out.println(buscarCliente);
//        } else{
//            System.out.println("Cliente no encontrado");
//        }
//
//    }
}
