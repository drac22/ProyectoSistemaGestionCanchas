/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.integrador.Model;

/**
 *
 * @author David
 */
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

    public Cliente(String nombres, String apellidos, String correo, String username, String password, String celular, String direccion) {
        super(nombres, apellidos, correo, username, password, celular);
        this.direccion = direccion;
    }
    
    public Cliente(int id, String nombres, String apellidos, String correo, String username, String password, String celular, String direccion) {
        super(id, nombres, apellidos, correo, username, password, celular);
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "id=" + getId()
                + ", nombres='" + getNombres() + "'"
                + ", apellidos='" + getApellidos() + "'"
                + ", correo='" + getCorreo() + "'"
                + ", username='" + getUsername() + "'"
                + ", password='" + getPassword() + "'"
                + ", celular='" + getCelular() + "'"
                + ", direccion='" + direccion + "'"
                + '}';
    }

}
