/* Descripción: Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones: double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro double areaRectangulo(double ancho, double alto) // Devuelve el área
 * Autor: Pablo González González
 * Fecha: 14/11/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ancho;
        System.out.println("Inserte el ancho: ");
        ancho = teclado.nextDouble();
        
        double alto;
        System.out.println("Inserte el ancho: ");
        alto = teclado.nextDouble();
        
        double perimetro = 0;
        perimetro = perimetroRectangulo(ancho, alto);
        System.out.println("El perímetro del rectángulo es: " + perimetro );
        
        double area = 0;
        area = areaRectangulo(ancho, alto);
        System.out.println("El área del rectángulo es: " + area);
        

	}
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro = 0;
        
		perimetro = 2*(ancho+alto);
		
		return perimetro;
	}
	public static double areaRectangulo(double ancho, double alto) {
        double area = 0;

        area = alto * ancho;
        
        return area;
	}

}
