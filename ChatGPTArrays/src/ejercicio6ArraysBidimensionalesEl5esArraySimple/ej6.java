/*Descripción: Pida al usuario N alumnos y M asignaturas.
Cree una matriz NxM donde se guardarán las notas (números entre 0 y 10).
El suario debe introducir TODAS las notas manualmente.
El programa debe mostrar:
✅ La nota media, máxima y mínima de cada alumno.
✅ La nota media de cada asignatura.
✅ Cuántos alumnos han aprobado todas las asignaturas.
✅ Cuántos alumnos tienen algún suspenso.
 *Autor: Pablo González González
 *Fecha: 11/11/2025
 */

package ejercicio6ArraysBidimensionalesEl5esArraySimple;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Inserte número de alumnos (filas): ");
        int N = teclado.nextInt();

        System.out.print("Inserte número de asignaturas (columnas): ");
        int M = teclado.nextInt();

        // Crear matriz NxM
        int[][] notas = new int[N][M];

        // Rellenar matriz
        for (int alumno = 0; alumno < N; alumno++) {
            for (int asignatura = 0; asignatura < M; asignatura++) {
                System.out.print("Nota del alumno " + alumno + " en la asignatura " + asignatura + ": ");
                notas[alumno][asignatura] = teclado.nextInt();
            }
        }

        System.out.println("=== RESULTADOS POR ALUMNO ===");

        int alumnosAprobaronTodo = 0;
        int alumnosConSuspensos = 0;

        // ---- CALCULAR MEDIA, MIN, MAX DE CADA ALUMNO ----
        for (int alumno = 0; alumno < N; alumno++) {

            int suma = 0;
            int min = notas[alumno][0];
            int max = notas[alumno][0];

            boolean tieneSuspensos = false;

            for (int asignatura = 0; asignatura < M; asignatura++) {

                int nota = notas[alumno][asignatura];

                suma = suma + nota;

                if (nota < min) min = nota;
                if (nota > max) max = nota;

                if (nota < 5) tieneSuspensos = true;
            }

            double media = (double) suma / M;

            if (tieneSuspensos) alumnosConSuspensos++;
            else alumnosAprobaronTodo++;

            System.out.println("Alumno " + alumno + ": Media = " + media + 
                               "  Min = " + min + "  Max = " + max);
        }

        // ---- MEDIA POR ASIGNATURA ----
        System.out.println("=== MÉDIA POR ASIGNATURA ===");

        for (int asignatura = 0; asignatura < M; asignatura++) {

            int suma = 0;

            for (int alumno = 0; alumno < N; alumno++) {
                suma += notas[alumno][asignatura];
            }

            double mediaAsignatura = (double) suma / N;
            System.out.println("Media de la asignatura " + asignatura + ": " + mediaAsignatura);
        }

        System.out.println("=== RESUMEN FINAL ===");
        System.out.println("Alumnos que aprobaron TODO: " + alumnosAprobaronTodo);
        System.out.println("Alumnos con ALGÚN suspenso: " + alumnosConSuspensos);
    }
}



