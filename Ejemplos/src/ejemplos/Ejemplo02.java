/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

// import java.security.SecureRandom;
import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int valorA = obtenerNumero();
        int valorB = obtenerNumero();
        int valorC = obtenerNumero();
        int valorD = obtenerNumero();
        int valorE = obtenerNumero();
        int suma = obtnerSuma(valorA, valorB, valorC, valorD, valorE);
        System.out.printf("La suma de %d + %d + %d + %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                valorC,
                valorD,
                valorE,
                suma);
    }
    
    public static int obtenerNumero() {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(5);
        return valorAleatorio;
    }
    
    public static int obtnerSuma(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }
    
}
