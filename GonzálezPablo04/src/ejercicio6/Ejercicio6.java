
/* Descripción: ampliacacion ej nota ciclo fomrativo ( bien,...)
 * Fecha: 08/10/2025
 * Autor: Pablo González González
 * 
 */

package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

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
		
		
		if (nota < 0 || nota > 10) {
			System.out.println("La nota académica indicada es incorrecta ");
		}
		
		
		
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
		} else if (nota == 9) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (sobresaliente) ");
		} else if (nota == 10) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + ciclo);
			System.out.println("Nota: " + nota + " (Matrícula de honor) ");
		}


	}


	}


