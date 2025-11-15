package cadenaDeCaracteres;

import java.util.Scanner;

public class Ejercicio1Cadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		String cadena;
		System.out.println("Dame una cadena de caracteres");
		cadena =teclado.nextLine();
		
		//Mostrar la longitud de la cadena
		System.out.println("La longitud de la cadena es : " + cadena.length());
		
		//Mostrar el primer caracter de la cadena
		System.out.println("El primer caracter de la cadena es : " + cadena.charAt(0));

		//Mostrar el ultimo caracter de la cadena
		System.out.println("El último caracter de la cadena es : " + cadena.charAt(cadena.length() - 1));
		
		//Mostrar la segunda palabra de la cadena
		String []palabras = cadena.split(" ");
		String segundaPalabra = palabras[1];
		System.out.println("la segunda palabra es: " + segundaPalabra) ;
		
		//Mostrar la cadena con la primera letra y la ultima en mayúscula
		String primLetra = cadena.substring(0,1);
		primLetra = primLetra.toUpperCase();
		
		String ultLetra = cadena.substring(longitud-2, longitud-1);
		ultLetra = ultLetra.toUpperCase();
		
		String medio = cadena.substring(1, longitud-2);


	}

}
