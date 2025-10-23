package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Inserte su nombre: ");
		nombre = teclado.nextLine();
		
		int edad;
		System.out.println("Inserte su edad: ");
		edad = teclado.nextInt();
		
		double nota;
		System.out.println("Inserte su nota: ");
	    nota = teclado.nextDouble();
	    
	    if ( edad >= 18 & nota >= 7) {
	    	System.out.println( nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
	    }
	    if ( edad < 18 || nota < 7) {
	    	System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
	    }
	    }

}
