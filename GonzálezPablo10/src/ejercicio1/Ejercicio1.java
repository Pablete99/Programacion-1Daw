/* Descripción: 1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int[][] almacen = new int[5][5];
        int valor = 1;
        
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                almacen[fila][col] = valor;
                valor++;
            }
        }

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(almacen[fila][col] + " ");
            }
            
        }
    }
}
