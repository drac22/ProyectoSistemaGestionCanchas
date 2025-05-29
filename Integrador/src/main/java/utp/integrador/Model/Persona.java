package utp.integrador.Model;

public class Persona {

    private int id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String username;
    private String password;
    private String celular;

    public Persona(){
        
    }

    public Persona(int id){
        this.id = id;
    }
    
    public Persona(int id, String nombres, String apellidos, String correo, String username, String password, String celular) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.celular = celular;
    }
    
    public Persona(String nombres, String apellidos, String correo, String username, String password, String celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", username=" + username + ", password=" + password + ", celular=" + celular + '}';
    }

}
