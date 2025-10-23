package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		
		
		String nombre;
		System.out.println("Inserte su nombre: ");
		
		
		
		String apellidos;
		System.out.println("Inserte su apellido: ");
		apellidos= teclado.nextLine();
		
		
		int añoNacimiento;
		System.out.println("Inserte su año de nacimiento: ");
		añoNacimiento = teclado.nextInt();
		
		double salario;
		System.out.println("Inserte el salaio que cobra mensaulmente: ");
        salario = teclado.nextDouble();
        
        int años;
        System.out.println(" Inserte los años trabajos en tu puesto actual en la empresa: ");
        años = teclado.nextInt();
        
        double salariobruto;
        salariobruto = salario - ((salario * 15)%100);
        
        
        System.out.println("Estimad@ " + nombre + apellidos + ", su salario bruto es (salario bruto), teniendo en\r\n"
        		+ "cuenta un IRPF del 15% su salario neto es (salario neto).\r\n"
        		+ "Debido a sus (número de años trabajando en la empresa) años trabajando en la\r\n"
        		+ "empresa su salario se incrementará en un 2% por cada año. El aumento es de\r\n"
        		+ "(aumento) y el salario total es (salario total).")
        
	}

}
