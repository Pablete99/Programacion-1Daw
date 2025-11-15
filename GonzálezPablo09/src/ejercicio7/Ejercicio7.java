package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int P;
		System.out.println("Introudzca el valor P: ");
		P = teclado.nextInt();
		int Q;
		System.out.println("Introudzca el valor Q: ");
		Q = teclado.nextInt();
		
		
		int [] almacen;
		almacen = new int [Q];
		
		if ( Q < P) {
			System.out.println("Los números introducidos no son correctos, recuerda que el número P siempre tiene que ser menor que el número Q. ");
		}
		else {		

		for ( int contador = 0; contador < Q; contador++) {
			int posicion = 0;
			almacen [posicion] = contador + 1;
			System.out.println("En el puesto " + contador + " hay un: "+ contador );
			posicion++;
		}


	}
}


}
