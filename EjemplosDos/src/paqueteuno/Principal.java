/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import paquetedos.DatoPersonal;
import paquetetres.DatosUbicacion;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Ciuadad: %s\n",
                nombre,
                ciudad);
    }
    
}
