/*Descripción: Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.
 *Autor: Pablo González González
 *Fecha: 05/11/2025
 */

package ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = teclado.nextLine();

        String[] palabras = texto.split(" ");

        System.out.println("Palabras separadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

    }
}

