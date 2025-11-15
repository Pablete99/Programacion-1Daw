/*Descripción: Ejercicio 1 — Nivel Padawan / Jedi (Array unidimensional)
Crea un programa que pida al usuario 15 números enteros, los guarde en un array y luego muestre:
La suma de los números en posiciones pares (0,2,4,...).
El producto de los números en posiciones impares (1,3,5,...).
El valor que más veces aparece y cuántas veces aparece.
 *Autor: Pablo González González
 *Fecha: 22/10/2025
 */
package ejercicio1ArraySimple;

import java.util.Scanner;

public class Guarda15Muestra {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        int almacen[] = new int [15];
        
        
        for ( int posicion = 0; posicion<15;posicion++) {
        	System.out.println("Inserte un número: ");
        	almacen [posicion] = teclado.nextInt();
        }
        
        for ( int posicion = 0; posicion<15;posicion++) {
        	System.out.println("El valor que se encuentra en la posición " + posicion + " es: " + almacen[posicion]);
        }
        

	}

}
