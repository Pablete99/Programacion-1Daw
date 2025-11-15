/*Descripción: Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
las tres primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 *Autor: Pablo González González
 *Fecha: 05/11/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String cadena1;
		System.out.println("Inserte el nombre: ");
		cadena1 = teclado.nextLine();
		
		String cadena2;
		System.out.println("Inserte el apellido: ");
		cadena2 = teclado.nextLine();
		
		String cadena3;
		System.out.println("Inserte el segundo apellido: ");
		cadena3 = teclado.nextLine();
		
		
		System.out.println("Su código de usuario será: ");	
        String parteNombre = cadena1.substring(0, 3);
        String parteApellido1 = cadena2.substring(0, 3);
        String parteApellido2 = cadena3.substring(0, 3);

        String codigo = (parteNombre + parteApellido1 + parteApellido2).toUpperCase();
        System.out.println(codigo);
	}

}
