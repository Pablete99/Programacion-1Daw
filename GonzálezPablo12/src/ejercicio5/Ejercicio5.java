/* Descripción: Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función: // Devuelve la conversión de millas a kilómetros
 * Autor: Pablo González González
 * Fecha: 14/11/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int millas;
        System.out.println("Introduce las millas que desee convertir a kilómetros: ");
        millas = teclado.nextInt();
        
        double kilometros = millas_a_kilometros(millas);
        System.out.println("El número de kilometros que equivalen a " + millas + " millas es: " + kilometros + " km");
        
        

	}
	public static  double millas_a_kilometros(int millas) {
		double kilometros = millas * 1.60934;
		
		return kilometros;
	}

}
