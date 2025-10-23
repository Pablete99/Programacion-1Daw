package operadores;

import java.util.Scanner;

public class condicionalmixto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
	    System.out.println("Introduce un número: ");
	    numero = teclado.nextInt();
	    
	    if ( numero > 0) {
	    	System.out.println("El número es positivo");
	    	if ( numero > 50) {
	    		System.out.println("El número es mayor de 50");
	    	}
	    }
	    
	    if ( numero == 0) {
	    	System.out.println("El número no es ni positivo, ni negativo. Es cero");
	    }
	    if ( numero < 0) {
	    	System.out.println("El número es negativo");
	    }
	    	
	    

	}

}
