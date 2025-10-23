package operadores;

import java.util.Scanner;

public class ejercicioResueltoNotaExamen {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		double nota;
		System.out.println("Introduce tu nota del examen: ");
		nota = teclado.nextDouble();
		
		if ( nota >= 0  &&  nota <= 10) 
		if ( nota >= 5) {
			System.out.println(" Has aprobado el examen. ");
		}
		else {
			System.out.println(" Has suspendido el examen. ");
		
		} else {
			System.out.println("La nota no es válida ");
		}
		
	}
	
}

	


