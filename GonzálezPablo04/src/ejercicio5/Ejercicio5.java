/* Descripción: ciclo formativo nota ( bien,....)
 * Fecha: 08/10/2025
 * Autor: Pablo González González
 * 
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserte su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Inserte sus apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.println("Indique en el ciclo formativo en el que se encuentra: ");
		String ciclo = teclado.nextLine();
		
		System.out.println("Inserte su nota académica: ");
		int nota = teclado.nextInt();
		
		
		if ( nota < 5) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (insuficiente) ");

		} else if ( nota == 5 ) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (suficiente) ");
		}
		else if ( nota ==6) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (bien) ");
		}else if (nota <= 8) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (notable) ");
		} else if (nota <= 10) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (sobresaliente) ");
		}


	}

}
