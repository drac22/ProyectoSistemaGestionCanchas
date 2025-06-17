package utp.integrador.Model;

import java.time.LocalDateTime;

public class Pago {
    private int idPago;
    private double montoPagado;
    private String metodoPago;
    private LocalDateTime fechahoraPago;
    private int idReserva;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDateTime getFechahoraPago() {
        return fechahoraPago;
    }

    public void setFechahoraPago(LocalDateTime fechahoraPago) {
        this.fechahoraPago = fechahoraPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
}
