/* Descripción: Ejercicio 2 relacion 2 de prpblemas
 * Fecha: 1/10/2025
 * Autor: Pablo González González
 * 
 */


package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Pido los datos
        
		String nombreEquipo;
		System.out.println("Inserte el nombre del club : ");
        nombreEquipo = teclado.nextLine();
		
		int fundado;
		System.out.println("Inserte el año de fundación del club : ");
		fundado = teclado.nextInt();
		
		teclado.nextLine();
		String estadio;
		System.out.println("Inserte el nombre del estadio del club: ");
		estadio = teclado.nextLine();
		
		String capitanEquipo;
		System.out.println("Inserte el nombre del cápitan del equipo : ");
		capitanEquipo = teclado.nextLine();
		
		System.out.println( "*****************************************************************************************************");
		System.out.println( "******* Nombre del Equipo: " + nombreEquipo + " *****************************************************");
		System.out.println( "******* Fundado en: " +  fundado + " ****************************************************************");
		System.out.println("******* Estadio: " + estadio + " *********************************************************************");
		System.out.println( "****** Capitán:  " +  capitanEquipo + " *************************************************************");
      
	}

}
