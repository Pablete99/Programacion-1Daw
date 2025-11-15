package primerejconwhile;

import java.util.Scanner;

public class Primerejconwhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num, suma;
		System.out.println("Dame un número: ") ;
		num = teclado.nextInt();
		int contador = 1;
		suma = num;
		
		while ( num != 0 && contador !=8) { 
			System.out.println("Dame un número: ");
			num = teclado.nextInt();
			contador  = contador + 1; // seria igual poner contador++
			suma = suma + num;  // ACUMULADOR
			
		}
		System.out.println("La sumna es: " + suma);

	}

}
 