/*Descripción: Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
 * Autor: Pablo González González
 * Fecha: 27/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		String lunes,martes,miercoles,jueves,viernes;
		String dia;
		System.out.println("Inserte el dia de la semana que desees saber que asignatura toca a primera hora: ");
		dia = teclado.next();
		
		
		if ( dia.equalsIgnoreCase("Lunes")) {
			System.out.println("El lunes por la mañana toca  Base de datos.");	
		}
		if ( dia.equalsIgnoreCase("Martes")) {
			System.out.println("El martes por la mañana toca  Itinerario Personal para la empleabilidad I.");	
		}
		if ( dia.equalsIgnoreCase("Miercoles")) {
			System.out.println("El miercoles por la mañana toca  Digitalización Aplicada a los Sectores Productivos GS.");	
		}
		if ( dia.equalsIgnoreCase("Jueves")) {
			System.out.println("El jueves por la mañana toca  Base de datos.");	
		}
		if ( dia.equalsIgnoreCase("Viernes")) {
			System.out.println("El viernes por la mañana toca  Sistemas Informáticos.");	
		}
		
		

	}

}
