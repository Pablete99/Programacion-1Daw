package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		System.out.println("Inserte su edad: ");
		edad = teclado.nextInt();
		 teclado.nextLine();
		
		if ( edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios. ");
		}
		if ( edad >= 18) {
			
			String nombre;
				System.out.println("Inserte su nombre: ");
				nombre = teclado.nextLine();
			
			String apellidos;
			System.out.println("Inserte sus apellidos: ");
			apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println("Usted ha sido admitido.");
			
			
		}
    

	}

}
