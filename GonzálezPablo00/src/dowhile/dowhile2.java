package dowhile;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		int num1;
		System.out.println("Introduzca el inicio: ");
		num1 = teclado.nextInt();

		int num2;
		System.out.println("Introduzca el fin: ");
		num2 = teclado.nextInt();
		
		System.out.println("Secuencia de número desde " + num1 + " hasta " + num2);
		System.out.print(num1);


		do {
			
			if (num1 < num2) {
				num1 = num1 + 1;
				System.out.print( num1 );
			} 
			if (num1 > num2) {
				num1 = num1 - 1;
				System.out.print( num1 );
				
			}
			
			
		
		} while (num1 != num2);


		
			
		
	}
	


	}


