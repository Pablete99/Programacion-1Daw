package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int fin;
		System.out.println("inserte el fin de la secuencia: ");
		fin = teclado.nextInt();
		
		
        for ( int contador = 1; contador < fin; contador++) {
			if ( contador % 2 == 0) {
				System.out.print(" " + contador );
			}
	}
	}

}
