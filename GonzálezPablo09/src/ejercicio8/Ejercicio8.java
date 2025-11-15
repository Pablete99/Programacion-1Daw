/*Descripción : cree un array con 100 números reales aleatorios entre 0.0 y 1.0, uego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		int R;
		System.out.println("Inserte un valor real (R): ");
		R = teclado.nextInt();
		
		double [] almacen;
		almacen = new double [100];
		
		for ( int posicion = 0; posicion <R; posicion++) {
			almacen [posicion] = Math.random()* 100;
		}
		
		for ( int posicion = 0; posicion <R; posicion++) {
			if ( almacen[posicion] == R) {
				System.out.println("El número " +  almacen[posicion]  +  " de la posicion " + posicion + " coincide con el número (R) introducido anteriormente.");
			}
		}
		
	}

}
