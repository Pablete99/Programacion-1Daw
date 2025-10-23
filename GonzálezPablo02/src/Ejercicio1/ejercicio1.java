

package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Pido los datos
		
		String nombre;
		System.out.println("Inserte su nombre: ");
		nombre = teclado.next();
		
		String apellidos;
		System.out.println("Inserte su apellidos: ");
		apellidos = teclado.next();
		
		int edad;
		System.out.println("Inserte su edad: ");
		edad = teclado.nextInt();
		
	    teclado.nextLine();
		String direccion;
		System.out.println("Inserte su dirección: ");
		direccion = teclado.nextLine();
		
	    int peso;
	    System.out.println("Inserte su peso en números enteros:  ");
	    peso = teclado.nextInt();
	    
	    double altura;
	    System.out.println("Inserte su altura: ");
	    altura = teclado.nextDouble();
	    
	    
		 
        System.out.println( "Nombre: "  + nombre);
        System.out.println( "Apellidos: "  + apellidos);
        System.out.println( "Edad: "  + edad);
        System.out.println(  "Dirección: "  + direccion);
        System.out.println( "Peso: "   + peso);
        System.out.println( "Altura: "   + altura);


		
		
		
		
		
		
	

	}

}
