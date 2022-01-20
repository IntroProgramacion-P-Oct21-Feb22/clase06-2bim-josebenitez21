/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;


import paquete04.OperadorDos;
import paquete04.OperadorUno;


/**
 *
 * @author USUARIO
 */
public class Principal {
    
 public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero();
        int valorB = OperadorUno.obtenerNumero();
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                suma);
    }
}