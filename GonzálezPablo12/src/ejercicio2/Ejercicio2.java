/* Descripción: Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función: boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 * Autor: Pablo González González
 * Fecha: 13/11/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        System.out.println("Inserte su edad: ");
        edad = teclado.nextInt();
        
        boolean mayorEdad = mayoriaEdad(edad);
        
        if (mayorEdad == true) {
        	System.out.println("Eres mayor de edad.");
        } else {
        	System.out.println("Eres menor de edad.");
        }
        
        

	}
	
	public static boolean mayoriaEdad ( int edad) {
		
		boolean mayorEdad = false;
		
		if ( edad >= 18) {
			mayorEdad = true;
		} else {
			mayorEdad = false;
		}
		
		return (mayorEdad);
	}

}
