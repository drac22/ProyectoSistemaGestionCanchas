package utp.integrador.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import utp.integrador.Model.Conexion;
import utp.integrador.Model.ReporteFinancieroDTO;
import utp.integrador.Model.ReporteOperativoDTO;
import utp.integrador.Model.Reserva;

public class ReservaDAO {

    public boolean reservaDisponible(int canchaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        String sql = "SELECT COUNT(*) FROM tbl_reserva "
                + "WHERE idCancha = ? AND fecha = ? "
                + "AND (? < horaFinal AND ? > horaInicio)";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, canchaId);
            ps.setDate(2, java.sql.Date.valueOf(fecha));
            ps.setTime(3, java.sql.Time.valueOf(horaInicio));
            ps.setTime(4, java.sql.Time.valueOf(horaFin));

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count == 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Reserva agregarReserva(Reserva reserva) {
        PreparedStatement ps;
        var sql = "INSERT INTO tbl_reserva(monto, fecha, horaInicio, horaFinal, idCliente, idCancha, idUsuario) VALUES(?, ?, ?, ?, ?, ?, ?)";
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

    public List<ReporteFinancieroDTO> mostrarReporteFinanciero() {
        List<ReporteFinancieroDTO> reporte = new ArrayList<>();
        var sql = "SELECT \n"
                + "    r.idReserva,\n"
                + "    u.nombres AS nombreUsuario,\n"
                + "    c.nombres AS nombreCliente,\n"
                + "    r.fecha,\n"
                + "    r.monto\n"
                + "FROM \n"
                + "    tbl_reserva r\n"
                + "JOIN \n"
                + "    tbl_cliente c ON r.idCliente = c.id\n"
                + "JOIN \n"
                + "    tbl_usuario u ON r.idUsuario = u.id;";

        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ReporteFinancieroDTO dto = new ReporteFinancieroDTO(
                        rs.getInt("idReserva"),
                        rs.getString("nombreUsuario"),
                        rs.getString("nombreCliente"),
                        rs.getDate("fecha").toLocalDate(),
                        rs.getDouble("monto")
                );
                reporte.add(dto);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar reservas: " + e.getMessage());
        }
        return reporte;
    }

    public List<ReporteOperativoDTO> mostrarReporteOperativo() {
        List<ReporteOperativoDTO> reporte = new ArrayList<>();
        String sql = "SELECT \n"
                + "    c.idCancha AS idCancha,\n"
                + "    c.ubicacion,\n"
                + "    COUNT(r.idReserva) AS numeroVecesAlquilada,\n"
                + "    SUM(TIMESTAMPDIFF(MINUTE, r.horaInicio, r.horaFinal)) AS minutosTotales\n"
                + "FROM \n"
                + "    tbl_reserva r\n"
                + "JOIN \n"
                + "    tbl_cancha c ON r.idCancha = c.idCancha\n"
                + "GROUP BY \n"
                + "    c.idCancha, c.ubicacion\n"
                + "ORDER BY \n"
                + "    c.idCancha ASC;";

        try (Connection con = Conexion.getConexion()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idCancha = rs.getInt("idCancha");
                String ubicacion = rs.getString("ubicacion");
                int veces = rs.getInt("numeroVecesAlquilada");
                int minutosTotales = rs.getInt("minutosTotales");

                int horas = minutosTotales / 60;
                int minutos = minutosTotales % 60;
                String formatoHHmm = String.format("%02d:%02d", horas, minutos);

                ReporteOperativoDTO dto = new ReporteOperativoDTO(
                        idCancha,
                        ubicacion,
                        veces,
                        formatoHHmm
                );
                reporte.add(dto);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar reporte operativo: " + e.getMessage());
        }

        return reporte;
    }

}
