/*Descripción: Ejercicio 3 — Matriz 2D (clásico de examen)
Crea un programa que:
Pida dos valores N y M.
Cree una matriz NxM.
Rellene la matriz con valores enteros introducidos por teclado.
Muestre:
La suma de cada fila.
La suma de cada columna.
El total de números positivos, negativos y ceros de toda la matriz.
(Sin usar librerías especiales.)
 *Autor: Pablo González González
 *Fecha: 22/10/2025
 */
package ejercicio3ArraysBidimensionales;
import java.util.Scanner;

public class ClásicoExamen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int numColumnas = teclado.nextInt();

        int[][] matriz = new int[numFilas][numColumnas];

        System.out.println("Introduce los valores de la matriz:");
        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                System.out.print("Valor fila " + fila + ", columna " + columna + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("\nSuma de filas:");
        for (int fila = 0; fila < numFilas; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < numColumnas; columna++) {
                sumaFila += matriz[fila][columna];

                if (matriz[fila][columna] > 0) positivos++;
                else if (matriz[fila][columna] < 0) negativos++;
                else ceros++;
            }
            System.out.println(sumaFila); 
        }

        System.out.println("\nSuma de columnas:");
        for (int columna = 0; columna < numColumnas; columna++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < numFilas; fila++) {
                sumaColumna += matriz[fila][columna];
            }
            System.out.println(sumaColumna); 
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}

