package utp.integrador.Model;

import java.time.LocalDate;

public class ReporteFinancieroDTO {

    private int id;
    private String nombreUsuario;
    private String nombreCliente;
    private LocalDate fechaReserva;
    private double monto;

    public ReporteFinancieroDTO(int id, String nombreUsuario, String nombreCliente, LocalDate fechaReserva, double monto) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombreCliente = nombreCliente;
        this.fechaReserva = fechaReserva;
        this.monto = monto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
