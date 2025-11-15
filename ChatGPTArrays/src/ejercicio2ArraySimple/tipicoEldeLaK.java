/*Descripcion: Ejercicio 2 — Nivel Jedi (Arrays aleatorios)
Crear un programa que:
Cree un array de tamaño 50 con números enteros aleatorios entre -20 y 20.
Pida al usuario un valor entero K.
Muestre:
Cuántos valores del array son mayores que K.
Cuántos son menores que K.
La distancia entre el mayor y el menor valor del array (máximo – mínimo).
Tampoco puedes usar la clase Arrays.
 * Autor : Pablo González González
 * Fecha: 10/11/2025
  */
 
package ejercicio2ArraySimple;

import java.util.Scanner;

public class tipicoEldeLaK {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

		
		int [] almacen = new int [50];
		
		for ( int posicion= 0;posicion<50;posicion++) {
			almacen[posicion]= (int)((Math.random()*40)-20);
		}
		
		int k;
		System.out.println("Inserte el valor de k: ");
		k = teclado.nextInt();
		
		int numMayor = almacen[0];
		int numMenor = almacen[0];
		int contadorMayorK = 0;
		int contadorMenorK = 0;
		
		
		for ( int posicion= 0;posicion<50;posicion++) {
			
			if ( almacen[posicion] > k) {
				contadorMayorK++;
			}
			if ( numMayor < almacen[posicion]) {
				numMayor = almacen[posicion];
			}
			if ( numMenor > almacen[posicion]) {
				numMenor = almacen[posicion];
			}
			if ( almacen[posicion] < k) {
				contadorMenorK++;
			}
			
			
		}
		
		int distancia = numMayor - numMenor;
		
		
		System.out.println("En el array hay " + contadorMayorK + " números mayores que que k");		
		System.out.println("En el array hay " + contadorMenorK + " números menores que k");
		System.out.println("La distancia entre el mayor número del array es: " + distancia);

		
		

	}

}
