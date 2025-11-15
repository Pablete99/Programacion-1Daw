/*  Descripción:Escribe un programa Java que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €)
 * mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5), usando el mínimo número posible.
 * Autor: Pablo González González
 * Fecha: 27/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador500 = 0, contador200 = 0, contador100 = 0, contador50 = 0, 
            contador20 = 0, contador10 = 0, contador5 = 0;
        int dineroUsuario;

        System.out.print("Inserte el dinero que disponga (múltiplo de 5): ");
        dineroUsuario = teclado.nextInt();

        if (dineroUsuario % 5 != 0) {
            System.out.println("La cantidad debe ser múltiplo de 5.");
        }
        else {

        while (dineroUsuario >= 500) {
            contador500++;
            dineroUsuario = dineroUsuario - 500;
        }

        while (dineroUsuario >= 200) {
            contador200++;
            dineroUsuario = dineroUsuario - 200;
        }

        while (dineroUsuario >= 100) {
            contador100++;
            dineroUsuario = dineroUsuario - 100;
        }

        while (dineroUsuario >= 50) {
            contador50++;
            dineroUsuario = dineroUsuario - 50;
        }

        while (dineroUsuario >= 20) {
            contador20++;
            dineroUsuario = dineroUsuario - 20;
        }

        while (dineroUsuario >= 10) {
            contador10++;
            dineroUsuario = dineroUsuario - 10;
        }

        while (dineroUsuario >= 5) {
            contador5++;
            dineroUsuario = dineroUsuario - 5;
        }

        
        if (contador500 > 0) System.out.println("Billetes de 500€: " + contador500);
        if (contador200 > 0) System.out.println("Billetes de 200€: " + contador200);
        if (contador100 > 0) System.out.println("Billetes de 100€: " + contador100);
        if (contador50 > 0) System.out.println("Billetes de 50€: " + contador50);
        if (contador20 > 0) System.out.println("Billetes de 20€: " + contador20);
        if (contador10 > 0) System.out.println("Billetes de 10€: " + contador10);
        if (contador5 > 0) System.out.println("Billetes de 5€: " + contador5);
    }
    }
    
 }
