/*Descripción: Un gimnasio quiere analizar el rendimiento de sus socios.
Pide al usuario el número de **socios (N)** y el número de **semanas (M)** que se registrarán.
Se guardará en una **matriz NxM** el número de **horas de entrenamiento** que cada socio realiza cada semana.
El programa debe:
✅ Pedir manualmente **todas las horas** (números enteros entre 0 y 40).
✅ Mostrar:
* 🧍‍♂️ La **media, máxima y mínima** de horas de cada socio.
* 📅 La **media de horas por semana** (columna).
* 💪 Cuántos socios **entrenaron más de 10 horas cada semana**.
* 😴 Cuántos socios **tuvieron alguna semana sin entrenar (0 horas)**.
Fecha: 12/11/2025
Autor: Pablo González González
*/

package ejercicio6ArraysBidimensionales;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        int socios;
        System.out.println("Inserte el número de socios ( filas ): ");
        socios = teclado.nextInt();
        
        int semanas;
        System.out.println("Inserte el número de semanas ( columnas ): ");
        semanas = teclado.nextInt();
        
        int gimnasio [] [] = new int [socios] [semanas];
        
        
        System.out.println("========== Datos de los Socios ==========");
        
        for ( int filas = 0; filas < socios; filas++) {
        	for ( int columnas = 0; columnas < semanas; columnas++) {
            	
        		System.out.println("Inserte el número de horas del socio " + filas + " en la semana " + columnas + ":");
        		gimnasio [filas][columnas] = teclado.nextInt();
        		
        		System.out.println( gimnasio [filas][columnas] );
        		
            }
        }
        
        int contadorMas10 = 0;
    	int contador0 = 0;
        
        for ( int filas = 0; filas<socios; filas++) {
        	
        	int suma = 0;
        	int maxHora = 0;
        	int minHora = 0;
        	
        	
        	for ( int columnas = 0; columnas < semanas; columnas++) {
        		suma = suma + gimnasio [filas][columnas];
        		
        		if ( maxHora < gimnasio [filas][columnas]) {
        			maxHora = gimnasio [filas][columnas];
        		}
        		if ( minHora > gimnasio [filas][columnas]) {
        			minHora = gimnasio [filas][columnas];
        		}
        		
        		
        		
        	}
        	
        	if ( suma == 0) {
        		contador0++;
        		}
        	if ( suma > 10) {
        		contadorMas10++;
        	}
        	
        	
        	int media = suma / semanas;
        	System.out.println("El socio número " + filas + " ha estado como máximo " + maxHora + " una semana en el gym, el mínimo de horas que ha estado una semana en el gym son:  " + minHora + " y su media de horas por semana es: " + media);
        	System.out.println("Además han habido un total de " + contador0 + " que s ehan pasado una o más semanas sin entrenar y un total de " + contadorMas10 + " que han entrenado al menos una semana mas de 10 horas" );
        }
        
        for ( int columnas = 0; columnas < semanas; columnas++) {
        	int suma = 0;
        	for ( int filas = 0; filas<socios; filas++) {
        		suma = suma + gimnasio [filas][columnas];
        		
        		
        	}
            int mediaSemana = suma / socios;	
            System.out.println("La media de horas por semana es de: " + mediaSemana);
	    }

}
	

}
