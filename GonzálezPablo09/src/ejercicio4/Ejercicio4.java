/*Descrición: pide 20 num, almacena en el array y muestra la suma de positivos y de naegativos
 * Autor: Pablo González González
 * Fecha:23/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

			
	   final int numeros = 20;
		int numInsertado;
		int [] almacen;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
        almacen = new int [numeros];
		
		for ( int posicion=0; posicion<20; posicion++){
			System.out.println("Inserte un número: ");
			numInsertado = teclado.nextInt();
			almacen[posicion] = numInsertado;
			}
		
		
		
		for ( int posicion=0; posicion<20; posicion++) {
			
			if (almacen[posicion] < 0) {
				sumaNegativos = almacen[posicion] + sumaNegativos;
			}
			
			if (almacen[posicion] > 0) {
				sumaPositivos = almacen[posicion] + sumaPositivos;
			}
		
		}
		
		
	   System.out.println("La suma de los números positivos es: " + sumaPositivos );
	   System.out.println("La suma de los números negativos es: " + sumaNegativos );

  }


}