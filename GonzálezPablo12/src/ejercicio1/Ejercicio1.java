/* Descripción: Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado de multiplicarlos. Implementa y utiliza la función: 
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 * Autor: Pablo González González
 * Fecha: 13/11/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        double a;
        System.out.println("Inserte el primer número: ");
        a = teclado.nextDouble();
        
        double b;
        System.out.println("Inserte el segundo número: ");
        b = teclado.nextDouble();

		double multiplicacion = multiplica( a,b);
		
		
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
	}
    public static double multiplica (double a, double b) {
    	double multiplicacion = a * b;
    	
    	return multiplicacion;
    }
	
}
