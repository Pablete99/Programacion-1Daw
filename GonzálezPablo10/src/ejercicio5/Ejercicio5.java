/*Descripción:Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para cada
persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género.
Fecha: 4/11/2025
Autor: Pablo González González
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        int N;
        System.out.println("Introduce el número de personas: ");
        N = teclado.nextInt();
        
        int sueldos [] [] = new int [N] [2];
        
        for ( int empleados = 0; empleados < N; empleados++) {
        		System.out.println("Inserte el sexo: ");
        		sueldos[empleados][0] = teclado.nextInt();
        		System.out.println("Inserte el sueldo: ");
        		sueldos [empleados][1] = teclado.nextInt();
        		
        		}
        
        int sumaHombre = 0;
        int sumaMujer = 0;
        int numHombre = 0, numMujer = 0;
        for ( int empleados = 0; empleados < N; empleados++) {
        	if ( sueldos [empleados][0] == 0) {
        		sumaHombre = sumaHombre + sueldos[empleados][1];
        		numHombre++;
        	}
        	if ( sueldos [empleados][0] == 1) {
        		sumaMujer = sumaMujer + sueldos[empleados][1];
        		numMujer++;
        	}
        }
         int medioHombre = sumaHombre / numHombre;
         int medioMujeres = sumaMujer / numMujer;
        
        
        System.out.println("El sueldo medio de los hombres: " + medioHombre);
        System.out.println("El sueldo medio de las mujeres es: " + medioMujeres);
        
	
	if (medioHombre > medioMujeres) {
        System.out.println("Existe brecha salarial a favor de los hombres.");
    } else if (medioMujeres > medioHombre) {
        System.out.println("Existe brecha salarial a favor de las mujeres.");
    } else {
        System.out.println("No existe brecha salarial.");
    }

	
	}
	
	
}
