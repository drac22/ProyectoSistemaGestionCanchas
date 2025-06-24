package utp.integrador.Model;

public class ReporteOperativoDTO {

    private int idCancha;
    private String ubicacion;
    private int vecesAlquiladas;
    private String totalHoras;

    public ReporteOperativoDTO(int idCancha, String ubicacion, int vecesAlquiladas, String totalHoras) {
        this.idCancha = idCancha;
        this.ubicacion = ubicacion;
        this.vecesAlquiladas = vecesAlquiladas;
        this.totalHoras = totalHoras;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int id) {
        this.idCancha = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String cancha) {
        this.ubicacion = cancha;
    }

    public int getVecesAlquiladas() {
        return vecesAlquiladas;
    }

    public void setVecesAlquiladas(int vecesAlquiladas) {
        this.vecesAlquiladas = vecesAlquiladas;
    }

    public String getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(String totalHoras) {
        this.totalHoras = totalHoras;
    }

}
