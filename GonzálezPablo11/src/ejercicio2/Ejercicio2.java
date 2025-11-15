/*Descripción: Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas
 *Autor: Pablo González González
 *Fecha: 05/11/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String cadena1;
		System.out.println("Inserte la primera cadena: ");
		cadena1 = teclado.nextLine();
		
		String cadena2;
		System.out.println("Inserte la segunda cadena: ");
		cadena2 = teclado.nextLine();
		
		 if (cadena1.equals(cadena2)) {
	            System.out.println("Las cadenas son exactamente iguales (respetando mayúsculas).");
	        } else {
	            System.out.println("Las cadenas son diferentes si se tienen en cuenta las mayúsculas.");
	        }
		 
		 if (cadena1.equalsIgnoreCase(cadena2)) {
	            System.out.println("Las cadenas son iguales sin diferenciar mayúsculas y minúsculas.");
	        } else {
	            System.out.println("Las cadenas también son diferentes sin diferenciar mayúsculas y minúsculas.");
	        }

	}

}
