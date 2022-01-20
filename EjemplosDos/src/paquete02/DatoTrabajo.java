/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa    
    // método que permita preguntar al usuario la dirección de la empres

    public static String obtenerDatoE() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();

        return nombreEmpresa;
    }

    public static String obtenerDatoDir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la dirección de la empresa");
        String dirEmpresa = entrada.nextLine();
        return dirEmpresa;
    }

}
