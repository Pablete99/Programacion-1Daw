package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] almacen = new int[4][5]; 

        for (int alumno = 0; alumno < almacen.length; alumno++) {
            for (int asig = 0; asig < almacen[alumno].length; asig++) {
                System.out.print("Inserte la nota del Alumno " + (alumno + 1) + " de la asignatura " + (asig + 1) + ": ");
                almacen[alumno][asig] = teclado.nextInt();
            }
        }

        for (int alumno = 0; alumno < almacen.length; alumno++) {
            int min = almacen[alumno][0];
            int max = almacen[alumno][0];
            int suma = 0;

            for (int asig = 0; asig < almacen[alumno].length; asig++) {
                int nota = almacen[alumno][asig];
                if (nota < min) min = nota;
                if (nota > max) max = nota;
                suma = suma + nota;
            }

            double media = (double) suma / 5;

            System.out.println("Alumno " + (alumno + 1) + ":");
            System.out.println("Nota mínima: " + min);
            System.out.println("Nota máxima: " + max);
            System.out.println("Nota media: " + String.format("%.2f", media));
        }

    }
}

