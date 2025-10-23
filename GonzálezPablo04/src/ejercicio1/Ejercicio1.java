/* Descripción: num1 num2 iguales, mayor uno o menor uno  decirlo ( Condicionales )
 * Fecha: 6/10/2025
 * Autor: Pablo González González
 * 
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		System.out.println("Inserte un número: ");
		num1 = teclado.nextInt();
		
		int num2;
		System.out.println("Inserte otro número: ");
		num2 = teclado.nextInt();
		
		
		if ( num1 > num2) {
			System.out.println("El primer número introducido es mayor que el segundo. ");
		}
		if ( num1 == num2) {
			System.out.println("Los dos número son iguales. ");
		}
        if (num1 < num2) {
        	System.out.println("El segundo número introducido es mayor que el primero. ");
        }
	}

}
