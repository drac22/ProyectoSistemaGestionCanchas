package utp.integrador.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import utp.integrador.DAO.ReservaDAO;
import utp.integrador.Model.Reserva;

public class ReservaController {

    private ReservaDAO reservaDAO;

    public ReservaController(ReservaDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }
    
    public void agregarReserva(Reserva reserva){
        reservaDAO.agregarReserva();
    }

    public boolean esHorarioDisponible(int canchaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        return reservaDAO.reservaDisponible(canchaId, fecha, horaInicio, horaFin);
    }

    public double calcularMonto(LocalTime horaInicio, LocalTime horaFin) {
        double tarifaPorHora = 100.0;

        long horas = ChronoUnit.HOURS.between(horaInicio, horaFin);

        return horas * tarifaPorHora;
    }
}
