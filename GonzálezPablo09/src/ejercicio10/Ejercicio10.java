/*Descripción : Crea un programa para realizar cálculos relacionados con la altura
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */
package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N;
		System.out.println("Inserte un valor: ");
		N = teclado.nextInt();
		
		double almacen [];
		almacen = new double [N];
		
		for ( int contador = 0; contador < N; contador++) {
			System.out.println("Introduce altura: ");
			almacen [contador] = teclado.nextDouble();;	
		}
		
		double maxAltura = almacen[0];
		double minAltura = almacen[0];
		double alturaMedia = 0;
		double suma = 0;
		

		for ( int contador = 0; contador < N; contador++) {
			suma = almacen [contador] + suma;
	}
		alturaMedia = suma / N;
		double    encimaMedia = 0;
		double    debajoMedia = 0;
		
		for ( int contador = 0; contador < N; contador++) {
				if ( maxAltura < almacen[contador]) {
					maxAltura = almacen[contador];
				}
				if ( minAltura > almacen[contador]) {
					minAltura = almacen[contador];
				}
				
				if ( almacen[contador] > alturaMedia) {
					encimaMedia++;
				}
				if ( almacen[contador] < alturaMedia) {
					debajoMedia++;
				}
				
				
		}
		System.out.println("ALTURAS ANÁLISIS");
		System.out.println("====================================================================");
		System.out.println("La altura media es: " + alturaMedia );
		System.out.println("La alutra máxima es: " + maxAltura);
		System.out.println("La altura mínima es: " + minAltura);
		System.out.println("Las personas por encima de la media son: " + encimaMedia);
		System.out.println("las personas por debajo de la media son: " + debajoMedia );
		System.out.println("====================================================================");

	}

}
