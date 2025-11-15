
/*Descripción: Ejercicio 4 — Matriz tipo tablero (más difícil)
Crea un programa que:
Cree una matriz de 10x10.
La rellene con valores aleatorios entre 0 y 9.
Muestre la matriz.
Luego muestre:
La suma de la diagonal principal.
La suma de la diagonal inversa.
Cuántos números de toda la matriz son múltiplos de	3
 *Autor: Pablo González González
 *Fecha: 22/10/2025
 */
package ejercicio4ArraysBidimensionales;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        int numFilas = 10;
        int numColumnas = 10;
        int[][] matriz = new int[numFilas][numColumnas];

        // Rellenar matriz con valores aleatorios entre 0 y 9
        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                matriz[fila][columna] = (int) (Math.random() * 10);
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 10x10:");
        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // Suma de la diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int fila = 0; fila < numFilas; fila++) {
            sumaDiagonalPrincipal += matriz[fila][fila]; // Elementos donde fila == columna
        }

        // Suma de la diagonal inversa
        int sumaDiagonalInversa = 0;
        for (int fila = 0; fila < numFilas; fila++) {
            int columnaInversa = numColumnas - 1 - fila;
            sumaDiagonalInversa += matriz[fila][columnaInversa]; // Elementos donde fila + columna == 9
        }

        // Contar múltiplos de 3
        int multiplosDe3 = 0;
        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                if (matriz[fila][columna] % 3 == 0) {
                    multiplosDe3++;
                }
            }
        }

        // Mostrar resultados
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal inversa: " + sumaDiagonalInversa);
        System.out.println("Cantidad de múltiplos de 3: " + multiplosDe3);
    }
}

