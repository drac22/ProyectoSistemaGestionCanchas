package utp.integrador.Controller;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import utp.integrador.DAO.ReservaDAO;
import utp.integrador.Model.ReporteFinancieroDTO;
import utp.integrador.Model.ReporteOperativoDTO;
import utp.integrador.Model.Reserva;

public class ReservaController {

    private ReservaDAO reservaDAO;

    public ReservaController(ReservaDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }

    public void agregarReserva(Reserva reserva) {
        reservaDAO.agregarReserva(reserva);
    }
    
    public List<ReporteFinancieroDTO> mostrarReporteFinanciero(){
        return reservaDAO.mostrarReporteFinanciero();
    }
    
    public List<ReporteOperativoDTO> mostrarReporteOperativo(){
        return reservaDAO.mostrarReporteOperativo();
    }

    public boolean esHorarioDisponible(int canchaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        return reservaDAO.reservaDisponible(canchaId, fecha, horaInicio, horaFin);
    }
    
    public double calcularMonto(LocalTime horaInicio, LocalTime horaFin) {
        double tarifaPorMediaHora;
        if (horaInicio.isBefore(LocalTime.of(18, 0))) {
            tarifaPorMediaHora = 40.0;
        } else {
            tarifaPorMediaHora = 50.0;
        }

        Duration duracion = Duration.between(horaInicio, horaFin);
        long minutos = duracion.toMinutes();

        double bloquesDeMediaHora = minutos / 30.0;
        double total = bloquesDeMediaHora * tarifaPorMediaHora;

        return total;
    }
}
