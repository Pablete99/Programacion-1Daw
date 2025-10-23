package ejerciciosclase;

import java.util.Scanner;

public class EjercicioCondiciónAnidada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int acertadas;
		System.out.println("Introduce el número de preguntas acertadas: ");
		acertadas = teclado.nextInt();
		
		int falladas;
		System.out.println("Introduce el número de preguntas falladas: ");
		falladas = teclado.nextInt();
		
		if (acertadas + falladas > 20) {
			System.out.println("Datos erróneos.");
		}
		else {
			double notaFinal;
			notaFinal = ( acertadas * 0.5 ) - (falladas * 0.25) ;
			System.out.println(" Tu nota final es: " + notaFinal);
			
		}
		
       }
	}


