/*Descripción : rea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int almacen [];
		almacen = new int [100];
		
		for (int contador = 0; contador < almacen.length; contador++) {
            almacen[contador] = (int) (1 + Math.random() * 10);
        }
		
		int N;
		System.out.println("Inserte un número N: ");
		N = teclado.nextInt();
		
		for ( int posicion = 0; posicion < 100; posicion++) {
			 if ( N == almacen [posicion] ) {
				 System.out.println("En la posición " + posicion + " esta el número " + N + " que coincide con el número introducido.");
			 } 
		}
		
	
		

	}

}
