/*Descripción : realiza la nómina de un empleado
* Autor: Pablo González González
* Fecha: 29/10/202
*/
package González;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Inicalizamos variables ( peude que mas adelnmate se necesiten nuevas )
		int edad = 35;
		
		
		double salarioHora = 15.50f;
		
		
		boolean jornadaCompleta = true;
		 
		long numEmpleado = 2055;
		
		int horasTrabajadas;
		System.out.println("Inserte las horas totales tarbajadas en una semana: ");
		horasTrabajadas = teclado.nextInt();
		
		double irpf = 0.12;
		
		//Cálculos necesarios para ralizar la nómina
		
		//1. Salario bruto
		double salarioBruto = horasTrabajadas * salarioHora;
		
		//2. Cálculo del importe de IRPF Retenido:
		double irpfRetenido = salarioBruto * irpf;
		
		//3. Cálculo del Salario Neto
	    double salarioNeto = salarioBruto - irpfRetenido;
	    
	    // 4. Verificación de Elegibilidad para Bono:
	    boolean elegibilidaParaBono;
	    
	    if ( jornadaCompleta == true && horasTrabajadas >= 40) {
	    	elegibilidaParaBono = true;
	    } else {
	    	elegibilidaParaBono = false;
	    }
	    
	    // La salida de todos los datos 
	    
	    System.out.println("NÓMINA");
	    System.out.println("============================================================================");
	    System.out.println("El número del empleado es: " + numEmpleado + " y tiene " + edad + " años");
	    System.out.println("Su salario por cada hora trabajada es de: " + salarioHora);
	    System.out.println("El salario bruto semanal del que dispone es de: " + salarioBruto);
	    System.out.println("El importe de IRPF retenido es: " + irpfRetenido);
	    System.out.println("El salario neto que se le queda es igual a: " + salarioNeto);
	    System.out.println("El estado de elegibilidad para bono es: " + elegibilidaParaBono);
	    System.out.println("============================================================================");
 
	    
	    
	    
		
		
		
	


	}

}
