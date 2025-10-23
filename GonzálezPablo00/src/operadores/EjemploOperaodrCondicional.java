/*
 * Descrpción: Como funciona el operador condicional y contar los caracteres
 * Autor: Pablo González González
 * Fecha: 26/09/2025
 */
package operadores;

import java.util.Scanner;

public class EjemploOperaodrCondicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);// PEDIR DATOS ASI !!!!!
        
		String nombre;
		System.out.println("Dime tu nombre: ");
        nombre = teclado.nextLine();
		int longitud = nombre.length();
		System.out.println("Número de caracteres de tu nombre: " + longitud);
		
		String nombreEnMinuscula;
		nombreEnMinuscula = nombre.toLowerCase();
		System.out.println(nombreEnMinuscula);
        
		System.out.println(" En mayúscula es " + nombre.toUpperCase());
		
		boolean esPablo;
		esPablo = nombre.equals("pablo");
		System.out.println(esPablo);
		
        int edad;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		
		String mayorEdad;
		mayorEdad = ( edad > 17) ? "Eres mayor de edad" : "Eres menor de edad ";
		System.out.println(mayorEdad);
	}

}
