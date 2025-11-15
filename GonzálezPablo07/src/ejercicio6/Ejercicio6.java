/*Descripción : Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
número negativo.
Autor: Pablo González González
Fecha: 15/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int num;
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		double cuadrado;
		
		while ( num >= 0) {
			
			cuadrado = ( num * num);
			System.out.println("El cuadrado del número introducido es: " + cuadrado );
			System.out.println("Inserte otro número: ");
			num = teclado.nextInt();
			
		}
		System.out.println("El número introducido es negativo, termina el programa.");

		

	}

}
