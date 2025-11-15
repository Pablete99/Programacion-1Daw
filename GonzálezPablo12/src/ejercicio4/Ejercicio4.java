/* Descripción: Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero.
 *Implementa y utiliza la función: int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 * Autor: Pablo González González
 * Fecha: 13/11/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inserte un número entero: ");
        int a = teclado.nextInt();

        int signo = dimeSigno(a);

        if (signo == -1) {
            System.out.println("El número es negativo");
        } else if (signo == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es positivo");
        }
    }

    public static int dimeSigno(int a) {
        if (a < 0) {
            return -1;
        } else if (a == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

