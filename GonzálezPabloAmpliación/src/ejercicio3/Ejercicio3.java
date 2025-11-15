/* Descripción : Escribe un programa que calcule el salario semanal de un trabajador
 * Fecha: 28/10/2025
 * Autor: Pablo González González
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int salario40; // el salario obtenido con 40 horas o menos de trabajao 
		int salario; //  la parte del salario superior a 40 horas
		int salarioTotal; // salario total
		int horas; 
		System.out.println("Inserte las horas trabajadas semanalmente: ");
		horas = teclado.nextInt();
		
		
		if ( horas <= 40) {
			salario40 = horas * 12;
			System.out.println("El salario semanal que recibirás será igual a: " + salario40);
		}
		
		if ( horas > 40) {
			salario40 = 40 *12;
			salario = (horas - 40) * 16;
			salarioTotal = salario40 + salario;
			System.out.println("El salario semanal que recibirás será igual a: " + salarioTotal);
		}
		
		
	
		
		

	}

}
