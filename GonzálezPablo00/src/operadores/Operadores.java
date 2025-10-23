package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dato1;
		System.out.println("Dame un número entero: ");
		dato1 = teclado.nextInt();
		
		double dato2;
		System.out.println("Dame un número decimal: ");
		dato2 = teclado.nextDouble();
		
		double suma;
		suma = dato1+dato2;
		System.out.println("La suma es: " + suma);
		
		double resta;
		resta = dato1-dato2;
		System.out.println("La recta es: " + resta);
		
		double multiplicacion;
		multiplicacion = dato1*dato2;
		System.out.println("La multiplicación es: " + multiplicacion);
		
		double division; // AL METER DIVISIÓN SE PUEDE COMPLICAR Y TENEMOS QUE METER EN TODO DOUBLE !!!!
		division = dato1/dato2;
		System.out.println("La división es: " + division ); 
		
		double modulo;
		modulo = dato1%dato2;
		System.out.println("El módulo de la división es: " + modulo );
		
		
		int dato1mas, dato1menos;
		dato1mas = dato1 ++; // ES LO MISMO QUE --> dato1mas = dato1 + 1 IMPORTANTE EN UN FUTURO !!!!
		dato1menos = dato1 --; // ES LO MISMO QUE --> dato1mas = dato1 - 1 IMPORTANTE EN UN FUTURO !!!!
		
		System.out.println(" Incremental posterior " + ++dato1);
		
		

	}

}
