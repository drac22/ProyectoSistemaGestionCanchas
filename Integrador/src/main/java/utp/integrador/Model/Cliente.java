package utp.integrador.Model;

public class Cliente extends Persona {

    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Cliente(){
        super();
    }
    
    public Cliente(int id){
        super(id);
    }

    public Cliente(String nombres, String apellidos, String correo, String celular, String direccion) {
        super(nombres, apellidos, correo, celular);
        this.direccion = direccion;
    }
    
    public Cliente(int id, String nombres, String apellidos, String correo, String celular, String direccion) {
        super(id, nombres, apellidos, correo, celular);
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "id=" + getId()
                + ", nombres='" + getNombres() + "'"
                + ", apellidos='" + getApellidos() + "'"
                + ", correo='" + getCorreo() + "'"
                + ", celular='" + getCelular() + "'"
                + ", direccion='" + direccion + "'"
                + '}';
    }

}
