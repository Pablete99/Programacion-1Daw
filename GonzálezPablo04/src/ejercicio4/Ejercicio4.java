/* Descripción: bono de 50 euros de descuento
 * Fecha: 08/10/2025
 * Autor: Pablo González González
 * 
 */
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.println("Introduzca el primer importe gastado: ");
		double ImporteGastado1 = teclado.nextDouble();
		
		System.out.println("Introduzca el segundo importe gastado: ");
		double ImporteGastado2 = teclado.nextDouble();
		
		System.out.println("Introduzca el tercero importe gastado: ");
		double ImporteGastado3 = teclado.nextDouble();
		
		System.out.println("Introduzca el cuarto importe gastado: ");
		double ImporteGastado4 = teclado.nextDouble();
		 
	   double importetotal = (ImporteGastado1 + ImporteGastado2 + ImporteGastado3 + ImporteGastado4 );
	   
	   double importemedio = ( importetotal / 4 );
	   
	   if ( importetotal >= 300) {
		   System.out.println(" Nombre: " + nombre);
		   System.out.println("Apellidos: " + apellidos);
		   System.out.println("Importe Gastado 1: " + ImporteGastado1);
		   System.out.println("Importe Gastado 2: " + ImporteGastado2);
		   System.out.println("Importe Gastado 3: " + ImporteGastado3);
		   System.out.println("Importe Gastado 4: " + ImporteGastado4);
		   System.out.println("Importe Medio: " + importemedio);
		   System.out.println(" Felicidades, sus compras han alcanzado la cantidad mínima requerida para la aplicación de un descuento de 50 euros.");


	   }
	   else {
		   System.out.println(" Nombre: " + nombre);
		   System.out.println("Apellidos: " + apellidos);
		   System.out.println("Importe Gastado 1: " + ImporteGastado1);
		   System.out.println("Importe Gastado 2: " + ImporteGastado2);
		   System.out.println("Importe Gastado 3: " + ImporteGastado3);
		   System.out.println("Importe Gastado 4: " + ImporteGastado4);
		   System.out.println("Importe Medio: " + importemedio);
		   System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone descuento.");
	   }
		

	}

}
