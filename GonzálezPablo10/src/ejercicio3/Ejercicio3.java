/*Descripción : 3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int M;
		System.out.println("Inserte el valor M: ");
		M = teclado.nextInt();
		
		int N;
		System.out.println("Inserte el valor N: ");
		N = teclado.nextInt();
		 int contador0 = 0;
		 int contadorPosi = 0;
		 int contadorNeg = 0;
		
		int almacen [] [] = new int [N] [M];
		
		 for (int fila = 0; fila < almacen.length; fila++) {
	            for (int col = 0; col < almacen.length; col++) {
	            	System.out.print("Introduce el valor para [" + fila + "][" + col + "]: ");
	                almacen[fila][col] = teclado.nextInt();
	            }
		 }
		 
		 for (int fila = 0; fila < almacen.length; fila++) {
	            for (int col = 0; col < almacen.length; col++) {
	            	
	             if ( almacen [fila][col] == 0) {
	            	 contador0++;
	            	 
	             }
	             if ( almacen [fila][col] < 0) {
	            	 contadorNeg++;
	            	 
	             }
	             if ( almacen [fila][col] > 0) {
	            	 contadorPosi++;
	            	 
	             }
	             

	            
	            }
	             System.out.println("Hay " +  contadorPosi + " números positivos."  );
	             System.out.println("Hay " +  contadorNeg + " números negativos."  );
	             System.out.println("Hay " +  contador0 + " ceros."  );
		 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	












}



