/* Descripción: Pedir 10 números. Mostrar la media de los números positivos, la media de los números
negativos y la cantidad de ceros.
 * Fecha: 16/10/2025
 * Autor: Pablo González González
 * 
 */


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		        int cantidadPositivos = 0;
		        int cantidadNegativos = 0;
		        int cantidadCeros = 0;
		        double sumaPositivos = 0;
		        double sumaNegativos = 0;

		        for (int num = 1; num <= 10; num++) {
		            System.out.print("Introduce el número " + num + ": ");
		            double numero = teclado.nextDouble();

		            if (numero > 0) {
		                sumaPositivos = numero;
		                cantidadPositivos++;
		            }  if (numero < 0) {
		                sumaNegativos = numero;
		                cantidadNegativos++;
		            } if (numero == 0) {
		                cantidadCeros++;
		            }
		        }

		        double mediaPositivos = 0;
		        double mediaNegativos = 0;

		        if (cantidadPositivos > 0) {
		            mediaPositivos = sumaPositivos / cantidadPositivos;
		        }

		        if (cantidadNegativos > 0) {
		            mediaNegativos = sumaNegativos / cantidadNegativos;
		        }

		        if (cantidadPositivos > 0)
		            System.out.println("Media de los números positivos: " + mediaPositivos);
		        else
		            System.out.println("No se introdujeron números positivos.");

		        if (cantidadNegativos > 0)
		            System.out.println("Media de los números negativos: " + mediaNegativos);
		        else
		            System.out.println("No se introdujeron números negativos.");

		        System.out.println("Cantidad de ceros: " + cantidadCeros);

		       
		    }
		

		

	}


