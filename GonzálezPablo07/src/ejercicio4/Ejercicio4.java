/* Descripción: Utilizando un bucle while solicita al usuario que introduzca valores positivos, almacena
la suma de todos estos valores, así como la cantidad de números introducidos. El bucle
parará cuando introduzca un 0. En ese momento el programa mostrará por pantalla la
cantidad de números mayores de 0 introducidos así como la media de los mismos.
 * Fecha: 08/10/2025
 * Autor: Pablo González González
 * 
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num ;
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		int suma = num;
		int contador = 0; // inicializamos el contador en cero para que no nos afecte al introducir el número 0, que queremos no contar
		 
		
		while ( num != 0 ) {
			 System.out.println("Dame otro número: ");
			 num = teclado.nextInt();
			 suma = suma + num;
			 contador++;
			 
		 } System.out.println("La suma de todos los números es: " + suma + " y la cantidad de números introducidos es: " + contador);
		
		 if (contador > 0) {
		 double media = ( (double ) suma / contador );
		 System.out.println("La media de los números introducidos es: " + media);
		 } else {
			 System.out.println("No se ha introducido números positivos");
		 }


	}

}
