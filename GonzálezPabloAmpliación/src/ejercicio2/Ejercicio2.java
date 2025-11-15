/*Decripción: introduce hora = buenos dias,tardes,noches
 * 
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hora;
		System.out.println("Introduce la hora ( solo la hora, no se tendrán en cuenta los minutos ): ");
		hora = teclado.nextInt();
		
		
		if ( hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias, te deso una feliz mañana.");
		}
		if ( hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes, te deso una feliz tarde.");
		}
		if ( hora >= 21 || hora <= 5) {
			System.out.println("Buenas noches, te deso una feliz noche.");
		}
		
		
	}

}
