package dowhile;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num, suma = 0;
		int contador = 0;
		
		do { 
			System.out.println("Dame un número: ( 0 PARA TERMINAR) ");
			num = teclado.nextInt();
			suma = suma + num;  // ACUMULADOR
			if (contador !=0) {
				contador = contador + 1;
			}
		} while ( num != 0 );
		
	//	contador = contador - 1; // resto 1 para no tener en cuenta el 0
		System.out.println("La sumna es: " + suma);
		System.out.println("El contador de números es: " + contador);

	}


	}


