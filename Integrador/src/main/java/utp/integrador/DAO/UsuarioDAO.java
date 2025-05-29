/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.integrador.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.integrador.Model.Usuario;
import utp.integrador.Model.Conexion;

/**
 *
 * @author David
 */
public class UsuarioDAO implements IUsuarioDAO {

    //listar
    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        var sql = "SELECT * FROM tbl_usuario ORDER BY id";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar Usuarios: " + e.getMessage());
        }
        return usuarios;
    }

    //buscar
    @Override
    public Usuario buscarUsuarioById(int id) {
        PreparedStatement ps;
        ResultSet rs;
        var sql = "SELECT * FROM tbl_usuario WHERE id = ?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setRol(rs.getString("rol"));
                return usuario;
            }
        } catch (SQLException e) {
            System.out.println("Error al encontrar Usuario por Id: " + e.getMessage());
        }
        return null;
    }

    //insertar
    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        PreparedStatement ps;
        var sql = "INSERT INTO tbl_usuario(nombres, apellidos, correo, username, password, celular, rol) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombres());
            ps.setString(2, usuario.getApellidos());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getUsername());
            ps.setString(5, usuario.getPassword());
            ps.setString(6, usuario.getCelular());
            ps.setString(7, usuario.getRol());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar Usuario: " + e.getMessage());
        }
        return usuario;
    }

    //actualizar
    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        PreparedStatement ps;
        var sql = "UPDATE tbl_usuario SET nombres=?, apellidos=?, correo=?, username=?, password=?, celular=?, rol=? WHERE id=?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombres());
            ps.setString(2, usuario.getApellidos());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getUsername());
            ps.setString(5, usuario.getPassword());
            ps.setString(6, usuario.getCelular());
            ps.setString(7, usuario.getRol());
            ps.setInt(8, usuario.getId());
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                return usuario;
            } else {
                System.out.println("No se encontró un usuario con ese ID para modificar");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar Usuario: " + e.getMessage());
        }
        return usuario;
    }

    //eliminar
    @Override
    public boolean eliminarUsuario(int id) {
        PreparedStatement ps;
        var sql = "DELETE FROM tbl_usuario WHERE id=?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar Usuario por ID: " + e.getMessage());
        }
        return false;
    }

    // buscar usuario por username
    public Usuario buscarUsuarioByUsername(String username) {
        PreparedStatement ps;
        ResultSet rs;
        var sql = "SELECT * FROM tbl_usuario WHERE username=?";
        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setRol(rs.getString("rol"));
                return usuario;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar Usuario por ID: " + e.getMessage());
        }
        return null;
    }

}
