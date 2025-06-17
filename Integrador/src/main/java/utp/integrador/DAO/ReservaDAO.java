package utp.integrador.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import utp.integrador.Model.Conexion;
import utp.integrador.Model.Reserva;

public class ReservaDAO {

    public boolean reservaDisponible(int canchaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        String sql = "SELECT COUNT(*) FROM tbl_reserva "
                + "WHERE idCancha = ? AND fecha = ? "
                + "AND (? >= horaInicio AND ? < horaFinal "
                + "OR ? > horaInicio AND ? <= horaFinal "
                + "OR horaInicio >= ? AND horaFinal <= ?);";
        PreparedStatement ps;
        ResultSet rs;

        try (Connection con = Conexion.getConexion()) {
            ps = con.prepareStatement(sql);
            ps.setInt(1, canchaId);
            ps.setDate(2, java.sql.Date.valueOf(fecha));
            ps.setTime(3, java.sql.Time.valueOf(horaInicio));
            ps.setTime(4, java.sql.Time.valueOf(horaFin));
            ps.setTime(5, java.sql.Time.valueOf(horaInicio));
            ps.setTime(6, java.sql.Time.valueOf(horaFin));
            ps.setTime(7, java.sql.Time.valueOf(horaInicio));
            ps.setTime(8, java.sql.Time.valueOf(horaFin));
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Reserva agregarReserva() {
        PreparedStatement ps;
        var sql = "INSERT INTO tbl_reserva(monto, fecha, horaInicio, horaFinal, idCliente, idCancha, idUsuario) VALUES(?, ?, ?, ?, ?, ?, ?)";
        Reserva reserva = new Reserva();
        try (Connection con = Conexion.getConexion()) {

            ps = con.prepareStatement(sql);
            ps.setDouble(1, reserva.getMonto());
            ps.setDate(2, java.sql.Date.valueOf(reserva.getFecha()));
            ps.setTime(3, java.sql.Time.valueOf(reserva.getHoraInicio()));
            ps.setTime(4, java.sql.Time.valueOf(reserva.getHoraFinal()));
            ps.setInt(5, reserva.getIdCliente());
            ps.setInt(6, reserva.getIdCancha());
            ps.setInt(7, reserva.getIdUsuario());

            ps.executeUpdate();
            System.out.println("Reserva agregada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar reserva: " + e.getMessage());
        }

        return reserva;
    }
}
