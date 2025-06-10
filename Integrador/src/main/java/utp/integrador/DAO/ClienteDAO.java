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
        var sql = "SELECT * FROM tbl_cliente ORDER BY id";
        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setCorreo(rs.getString("correo"));
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
        ResultSet rs;
        var sql = "SELECT * FROM tbl_cliente WHERE id = ?";
        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) { // next pregeunta si hay registros
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setCorreo(rs.getString("correo"));
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
        var sql = "INSERT INTO tbl_cliente(nombres, apellidos, correo, celular, direccion) VALUES(?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getCelular());
            ps.setString(5, cliente.getDireccion());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar un Cliente: " + e.getMessage());
        }
        return cliente;
    }

    //actualizar
    @Override
    public Cliente modificarCliente(Cliente cliente) {
        var sql = "UPDATE tbl_cliente SET nombres=?, apellidos=?, correo=?, celular=?, direccion=? WHERE id=?";
        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getCelular());
            ps.setString(5, cliente.getDireccion());
            ps.setInt(6, cliente.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al modificar el Cliente: " + e.getMessage());
        }
        return cliente;
    }

    //eliminar
    @Override
    public boolean eliminarCliente(int id) {
        var sql = "DELETE FROM tbl_cliente WHERE id=?";
        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el Cliente: " + e.getMessage());
        }
        return false;
    }
}
