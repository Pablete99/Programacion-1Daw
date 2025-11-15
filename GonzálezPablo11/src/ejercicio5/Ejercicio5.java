/*Descripción: Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
 no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 *Autor: Pablo González González
 *Fecha: 05/11/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String cadena = teclado.nextLine();
		
		cadena = cadena.replace(" ", "").toLowerCase();
		
		String invertida = "";
		for (int i = cadena.length() -1; i >= 0; i--) {
			invertida = invertida + cadena.charAt(i);
		}
		
		if (cadena.equals(invertida)) {
			System.out.println("La frase es un palíndromo.");
		} else {
			System.out.println("La frase no es un palíndromo.");
		}
		
	}
}

