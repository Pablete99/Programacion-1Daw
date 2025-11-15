package buclefor;

import java.util.Scanner;

public class Buclefor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserte un número: ");
		int num = teclado.nextInt();
		
		for (int conta = 1; conta <= 10; conta ++) {
		System.out.println( num + " multiplicado por " + conta + " = " + num*conta);
		
		}
	}

}
