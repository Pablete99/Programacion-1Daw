/* Descripción: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 * distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[] numeros = new int[10];
        char opcion;
        
        do {
            System.out.println("====================== MENÚ ======================");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.println("==================================================");
            System.out.print("Elige una opción: ");
            opcion = teclado.next().toLowerCase().charAt(0);
            
            switch (opcion) {
                
                case 'a':
                    System.out.println("Contenido del array:");
                    System.out.println("--------------------------------------------------");
                    for (int posicion = 0; posicion < numeros.length; posicion++) {
                        System.out.println("Posición " + posicion + " → " + numeros[posicion]);
                    }
                    break;
                    
                case 'b':
                    System.out.print("Introduce un valor entero: ");
                    int valor = teclado.nextInt();
                    
                    System.out.print("Introduce la posición (0-9): ");
                    int posicion = teclado.nextInt();
                    
                    if (posicion >= 0 && posicion < numeros.length) {
                        numeros[posicion] = valor;
                        System.out.println("Valor " + valor + " insertado en la posición " + posicion + ".");
                    } else {
                        System.out.println("Posición fuera de rango. Debe estar entre 0 y 9.");
                    }
                    break;
                    
                case 'c':
                    System.out.println("Saliendo del programa... ¡Hasta luego macho!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
            
        } while (opcion != 'c');
        
    }
}

