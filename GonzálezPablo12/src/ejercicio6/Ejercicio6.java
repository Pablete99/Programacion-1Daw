/* Descripción: Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función: double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 * Autor: Pablo González González
 * Fecha: 14/11/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double precio = 0;
        
        for ( int contador = 0; contador < 5; contador++) {
        	System.out.println("Inserte el precio del producto para aplicarle el iva: ");
        	precio = teclado.nextDouble();
        	
        	// llamo a la función para aplicar el iva 
        	precio = precioConIVA(precio);
        	System.out.println("El precio mas el IVA queda: " + precio);
        }

        
        

	}
	public static double precioConIVA(double precio) {
	    precio = precio * 1.21;
		return precio;
	}
}
