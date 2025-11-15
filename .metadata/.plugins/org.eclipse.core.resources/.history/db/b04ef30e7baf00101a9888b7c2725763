/*Descripción: temperatura
 *Autor: Pablo González González
 *Fecha: 22/10/2025
 */
package arrayBidimensional;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		final int TOTAL_MESES = 12;
		final int TOTAL_DIAS = 30;
		
		int [] [] temperatura ; // Declaración de un array bidimensional
		temperatura = new int[TOTAL_MESES] [TOTAL_DIAS];
		int diaMasCaluroso = 0;
		int TemCalurosa,diaTem10;
		
		for ( int mes = 0; mes < temperatura.length; mes++) {         // Inicialización a valores aleatores entre 0 y 40
			for ( int dia = 0; dia < temperatura[mes].length; dia++ ) {
			 temperatura [ mes][dia] = (int)(Math.random()*40);
				
			}
		}
		for ( int mes = 0; mes < temperatura.length; mes++) {         // Mostramos las temperaturas
			for ( int dia = 0; dia < temperatura[mes].length; dia++ ) {
			System.out.print ( temperatura [ mes][dia] + " \t" );
			}
			System.out.println();
		}
		
	// Para cada mes, calcular que dia fue el mas caluroso y que temperatura fue
	for ( int mes = 0; mes < temperatura.length; mes++) {
		TemCalurosa = temperatura [mes][0]; // cada mes incializo la temperatura más alta a la temperatura del primer dia 
		for ( int dia = 1; dia < temperatura[mes].length; dia++ ) {      // empiezop a comparar temperaturas a partid el segundo dia
		if ( diaMasCaluroso < temperatura [mes][dia] ) {
			TemCalurosa = temperatura [mes][dia];
			diaMasCaluroso = dia;
			}
		
		
		
		} System.out.println(" El día " + diaMasCaluroso + " hubo " + TemCalurosa);   
	
}
       // para cada mes, mostrar el primer dia con temperatura inferior a 10 grados
	for ( int mes = 0; mes < temperatura.length; mes++) {
		diaTem10 = 0;
		do {
			diaTem10++;
		} while(temperatura[mes][diaTem10]>10);
		System.out.println(" Para el mes " + mes + " el primer dia con menos de 10 grados es: " + diaTem10);
		
		
		
	}
	}
	
}