/*Descripción : Solicita un año al usuario, muestra siglo y diferencia con año actual
* Autor: Pablo González González
* Fecha: 29/10/202
*/
package González;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// inicalizamos año y variables para calculos posteriores
		
		int añosPasados;
		int añosFaltan;
		int año = 0;
		int añoMal = 0;
		 // Para decorar un poco lo que vera el usuario, en este caso el profesor
		
		System.out.println("ANÁLISIS DE AÑO");
		System.out.println("========================================================================================");
		System.out.println("Inserte su año de nacimiento, debe ser entre ( 1801 - 2100) ambos valores incluidos: ");
		año = teclado.nextInt();
		while ( año != -1 || añoMal != 3) {                                                                                // si el usuario inserta un -1 finalizará el programa o si mete 3 veces mal el año
				
			if ( año < 1801 || año > 2100) {                                                                           // si año no esta en el rango para, si lo esta continua el programa
			añoMal++;
			System.out.println("Año no válido");
			
			} 
		else {
				
			   // Comprobamos el siglo del año introducido
			
			
			    if ( año > 1801 && año < 1901) {
					System.out.println("Su año de nacimiento se encuentra en el siglo XIX.");
				} else if ( año >= 1901 && año < 2001) {
					System.out.println("Su año de nacimiento se encuentra en el siglo XX.");
				} else if ( año >= 2001 && año < 2100) {
					System.out.println("Su año de nacimiento se encuentra en el siglo XXI.");
				}
				
				//Comprobamos si es actual, anterior o posterior y años que faltan para llegar y años que han pasado
			    
			    if ( año == 2025) {
			    	System.out.println("El año introducido coincide con el actual.");
			    } else if ( año < 2025) {
			    	System.out.print("El año introducido es anterior al actual.");
			    	añosPasados = 2025 - año;
			    	System.out.println(" Han pasado " + añosPasados +  " años.");
			    } else if ( año > 2025) {
			    	System.out.print("El año introducido es posterior al actual.");
			    	añosFaltan = año - 2025;
			    	System.out.println(" Faltan " + añosFaltan + " años.");
			    	
			    }
				System.out.println("========================================================================================");

		       }
		
		
			}
			
		}

    }
	


	
