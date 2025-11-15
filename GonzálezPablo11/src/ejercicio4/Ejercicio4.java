/* Descripción: Crea un programa que muestre por pantalla cuántas vocales de cada tipo hay en una frase.
   No se debe diferenciar entre mayúsculas y minúsculas.
 * Autor: Pablo González González
 * Fecha: 05/11/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inserte la cadena de caracteres: ");
        String cadena = teclado.nextLine();

        cadena = cadena.toLowerCase();

        int numA = 0;
        int numE = 0;
        int numI = 0;
        int numO = 0;
        int numU = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == 'a') numA++;
            else if (c == 'e') numE++;
            else if (c == 'i') numI++;
            else if (c == 'o') numO++;
            else if (c == 'u') numU++;
        }

        System.out.println("Nº de A's: " + numA);
        System.out.println("Nº de E's: " + numE);
        System.out.println("Nº de I's: " + numI);
        System.out.println("Nº de O's: " + numO);
        System.out.println("Nº de U's: " + numU);

    }
}

