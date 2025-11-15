/* Descripción:Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
pequeño. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el mínimo de los dos valores.
 * Autor: Pablo González González
 * Fecha: 14/11/2025
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        
        int num2;
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        int num3;
        System.out.println("Introduce el tercer número: ");
        num3 = teclado.nextInt();
        
        int candidato = mayor(num1,num2);
        
        if ( candidato > num3) {
        	System.out.println("El mayor número es: " + candidato);
        } else {
        	System.out.println("El mayor número es: " + num3);
        }
        
        

	}
	public static int mayor(int num1, int num2) {
		if ( num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
