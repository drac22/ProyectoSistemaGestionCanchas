/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utp.integrador;

import utp.integrador.Model.Cliente;
import utp.integrador.Model.Usuario;

/**
 *
 * @author David
 */
public class Integrador {

    public static void main(String[] args) {
        Usuario nuevoUsuario = new Usuario("David Ruben", "Arone Calle", "arone@gmail.com", "drac", "daruarca", "999888777", "ROL_TRABAJADOR");
        nuevoUsuario.setId(1);
        System.out.println(nuevoUsuario.getId());
        System.out.println(nuevoUsuario.toString());
        
    }
}
