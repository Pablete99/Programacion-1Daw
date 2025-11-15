/* Descripción: Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
 * Autor: Pablo González González
 * Fecha: 13/11/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a;
        System.out.println("Inserte el primer número: ");
        a = teclado.nextInt();
        
        int b;
        System.out.println("Inserte el segundo número: ");
        b = teclado.nextInt(); 
        
        int menor = menor(a,b);

        System.out.println("El menor de los números introducidos es: " + menor);
        
        

	}
	
	public static int menor(int a, int b) {
		
		int menor = 0;
		if ( a < b) {
			menor = a;
		}
		if ( b < a) {
			menor = b;
		}
		
		return menor;
	}

}
