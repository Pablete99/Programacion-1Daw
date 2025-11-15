package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N;
		System.out.println("Introudzca el valor N: ");
		N = teclado.nextInt();
<<<<<<< HEAD
=======
		
>>>>>>> 568c5f9fc17509900e73ac41947b53c8ce1285d6
		int M;
		System.out.println("Introudzca el valor M: ");
		M = teclado.nextInt();
		
		
		int [] arrayN;
		arrayN = new int [N];
		
<<<<<<< HEAD
		for ( int posicion= 0; posicion < N; posicion++){
			arrayN[posicion] = M;
			System.out.println("El valor de la posión " + posicion + " es: " + arrayN[posicion] );
		}
	
=======
		for ( int posicion = 0; posicion < N; posicion++);{
			arrayN[posicion] = M;
		}
>>>>>>> 568c5f9fc17509900e73ac41947b53c8ce1285d6

	}

}
