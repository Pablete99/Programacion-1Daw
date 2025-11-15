package entradaDatos;

import java.util.Scanner;

public class PeticionDeDatos {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);// PEDIR DATOS ASI !!!!!
	
	int edadAlumno;
	System.out.println ("Dame tu edad:");
	edadAlumno = teclado.nextInt();
	System.out.println("La edad es: " + edadAlumno);
	
    teclado.nextLine(); //Después de pedir valor numérico y antes de pedir cadena de caracteres IMPORTANTE RECUERDALO
	String nombreAlumno;
	System.out.println("Dame tu nombre:");
	nombreAlumno = teclado.nextLine();
	System.out.println(" Tu nombre es: " + nombreAlumno);
	
	Double pesoAlumno;
	System.out.println("Dame tu peso:");
	pesoAlumno = teclado.nextDouble();
	System.out.print(" Tu peso es: " + pesoAlumno);
	
	

	}

}