package utp.integrador.Model;

public class Usuario extends Persona {

    private String rol;
    private String username;
    private String password;

    public Usuario() {
        super();
    }

    public Usuario(int id) {
        super(id);
    }

    public Usuario(String nombres, String apellidos, String correo, String username, String password, String celular, String rol) {
        super(nombres, apellidos, correo, celular);
        this.rol = rol;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "id=" + getId()
                + ", nombres='" + getNombres() + "'"
                + ", apellidos='" + getApellidos() + "'"
                + ", correo='" + getCorreo() + "'"
                + ", username='" + getUsername() + "'"
                + ", password='" + getPassword() + "'"
                + ", celular='" + getCelular() + "'"
                + ", rol='" + rol + "'"
                + '}';
    }

}
