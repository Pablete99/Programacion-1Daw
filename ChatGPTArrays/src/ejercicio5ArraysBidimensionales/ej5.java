/*Descripción: "Análisis de temperaturas"
Crea un programa que:
Cree un array de tamaño 30 y lo rellene con temperaturas reales aleatorias entre –5.0 y 45.0.
(Usa Math.random()).
Muestre todas las temperaturas en una sola línea.
Calcule y muestre:
La temperatura máxima.
La temperatura mínima.
La media de todas.
Cuántos días la temperatura fue superior a la media.
Cuántos días fue inferior a 0 grados.
 *Autor: Pablo González González
 *Fecha: 11/11/2025
 */
package ejercicio5ArraysBidimensionales;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int almacen[] = new int [30];
        
        
        for ( int posicion=0; posicion < 30;posicion++) {
        	almacen[posicion] = (int)(Math.random()*50 - 5);
        	System.out.print(" " + almacen[posicion]);
        }
        System.out.println();
        int tempMax = 0;
        int tempMin = 0;
        int tempMedia = 0;
        int suma = 0;
        int superiorMedia = 0;
        int inferior0 = 0;
        
        for ( int posicion=0; posicion < 30;posicion++) {
        	suma = suma + almacen[posicion];
        	if ( almacen[posicion] < 0) {
        		inferior0++;
        	}
        	if ( tempMax < almacen[posicion]) {
        		tempMax = almacen[posicion];
        	}
        	if ( tempMin > almacen[posicion]) {
        		tempMin = almacen[posicion];
        	}
        }
        
        tempMedia = suma / 30;
        for ( int posicion=0; posicion < 30;posicion++) {
        	if (almacen[posicion] > tempMedia) {
        		superiorMedia++;
        	}
        }
        
        System.out.println("La temperatura máxima es: " + tempMax);
        System.out.println("La temperatura mínima es: " + tempMin);
        System.out.println("La temperatura media es: " + tempMedia);
        System.out.println("Se han registrado " + inferior0 + " días con una temperatura por debajo de 0");
        System.out.println("Se han registrado " + superiorMedia + " días con una temperatura por encima de la media");



	}

}
