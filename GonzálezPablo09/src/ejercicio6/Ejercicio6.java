package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N;
		System.out.println("Introudzca el valor N: ");
		N = teclado.nextInt();
		
		int M;
		System.out.println("Introudzca el valor M: ");
		M = teclado.nextInt();
		
		
		int [] arrayN;
		arrayN = new int [N];
		
		for ( int posicion = 0; posicion < N; posicion++);{
			arrayN[posicion] = M;
		}

	}

}
