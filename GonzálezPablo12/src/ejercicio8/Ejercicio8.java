/* Descripción: Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones: int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 * Autor: Pablo González González
 * Fecha: 14/11/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inserte el valor N: ");
        int n = teclado.nextInt();

        int sumatorio = suma1aN(n);
        System.out.println("El sumatorio es igual a: " + sumatorio);

        int productorio = producto1aN(n);
        System.out.println("El productorio es igual a: " + productorio);

        double intermedio = intermedio1aN(n);
        System.out.println("El número intermedio es: " + intermedio);

        teclado.close();
    }

    public static int suma1aN(int n) {
        int suma = 0;
        for (int contador = 1; contador <= n; contador++) {
            suma += contador;
        }
        return suma;
    }

    public static int producto1aN(int n) {
        int producto = 1;
        for (int contador = 1; contador <= n; contador++) {
            producto *= contador;
        }
        return producto;
    }

    public static double intermedio1aN(int n) {
        return n / 2.0; 
    }
}
