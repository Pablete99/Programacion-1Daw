/* Descripción:2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int almacen [] [] = new int [10] [10];
        
        
        for (int fila = 0; fila < 10; fila++) {
            for (int col = 0; col < 10; col++) {
                almacen [fila][col] = (fila + 1) * ( col + 1);
            	 }
	       }
        
        for (int fil = 0; fil < 10; fil++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(almacen[fil][col] + " ");
                }
            System.out.println();
        }

	}
	
}
