/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class DatoAcademico {

    public static double[] obtenerNotas(int n) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] notas = new double[n];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese su nota:");
            notas[i] = entrada.nextDouble();

        }
        return notas;
    }
}
