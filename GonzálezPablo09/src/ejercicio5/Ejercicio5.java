/*Descrición: pide 20 num, almacena en el array y muestra la suma media
 * Autor: Pablo González González
 * Fecha:23/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int numeros = 20;
		int numInsertado;
		int [] almacen;
		int suma = 0;
		int media;

		
		almacen = new int [numeros];
		
		for ( int posicion=0; posicion<20; posicion++){
			System.out.println("Inserte un número: ");
			numInsertado = teclado.nextInt();
			almacen[posicion] = numInsertado;

        }
		
		for ( int posicion=0; posicion<20; posicion++) {
			suma = suma + almacen[posicion];
		}
		
		media = suma / 20;
		
		System.out.println("La media de los número incluidos en el array es : " + media);

	}

}
