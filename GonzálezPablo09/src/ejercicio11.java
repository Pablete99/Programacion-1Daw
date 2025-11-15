/*
 * Descripción: Crea un programa que cree dos arrays de enteros de tamaño 100.
 * Luego introducirá en el primer array todos los valores del 1 al 100.
 * Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso,
 * y mostrar ambos por pantalla.
 * Autor: Pablo González González
 * Fecha: 30/10/2025
 */

public class ejercicio11 {

	public static void main(String[] args) {
		
		int almacen1[] = new int[100];
		int almacen2[] = new int[100];
		
		for (int posicion = 0; posicion < 100; posicion++) {
			almacen1[posicion] = posicion + 1;
		}
		
		for (int posicion = 0; posicion < 100; posicion++) {
			almacen2[posicion] = almacen1[99 - posicion];
		}
		
		System.out.println("Primer array del 1 al 100");
		System.out.println("=================================================================================");
		for (int posicion = 0; posicion < 100; posicion++) {
			System.out.println("En la posición " + posicion + " se encuentra el número: " + almacen1[posicion]);
		}
		
		System.out.println("Segundo array del 100 al 1");
		System.out.println("=================================================================================");
		for (int posicion = 0; posicion < 100; posicion++) {
			System.out.println("En la posición " + posicion + " se encuentra el número: " + almacen2[posicion]);
		}
	}
}

