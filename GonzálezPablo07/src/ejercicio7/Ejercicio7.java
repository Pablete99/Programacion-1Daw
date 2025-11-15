/*Descripción : Realizar un juego para adivinar un número entero
Autor: Pablo González González
Fecha: 16/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		
		double numAleatorio = Math.random();
		
		numAleatorio = ( int) (numAleatorio*50);

		
		int num = 0;
		
		
		while ( num != numAleatorio){
			System.out.println("Introduce el número que piensas que es: ");
			num = teclado.nextInt();
		
			if ( num > numAleatorio) {
			System.out.println("El número es menor");
			}
			if ( num < numAleatorio) {
			System.out.println("El número es mayor");
			}
		
			if ( num == numAleatorio ) {
			System.out.println("¡¡¡Ganaste, has adivinado el número!!!");
			}

	
		}
	
	}
}
