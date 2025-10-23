package buclefor;

import java.util.Scanner;

public class Buclefor2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserte el número inicial: ");
		int inicio = teclado.nextInt();
		
		System.out.println("Inserte el número final: ");
		int fin = teclado.nextInt();
		
		
		for (int contador = inicio; contador <= fin; contador ++) {
			if (  contador % 5 == 0 ) {
			System.out.println(contador + " es múltiplo de 5");
			}
		}


	}

}
