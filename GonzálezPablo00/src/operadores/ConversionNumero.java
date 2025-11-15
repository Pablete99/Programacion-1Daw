package operadores;

import java.util.Scanner;

public class ConversionNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        double metros;

        
        double decimetros,centimetros, milimetros;
        double pulgadas, pies, yardas;
        
        
        System.out.print("Introduzca la longitud en metros que desea transformar: ");
        metros = teclado.nextDouble();

        
        decimetros = metros * 10;
        centimetros = metros * 100;
        milimetros = metros * 1000;
        pulgadas = metros * 100 / 2.54;
        pies = pulgadas / 12;
        yardas = pies / 3;
        
        
        System.out.println("SISTEMA ANGLOSAJÓN");
        System.out.println("La media que has introducido en decimetros es: " + decimetros );
        System.out.println("La media que has introducido en centimetros es: " + centimetros);
        System.out.println("La media que has introducido en milimetros es: " + milimetros);
        System.out.println("SISTEMA ANGLOSAJÓN");
        System.out.println("La medida que has introducido en pulgadas son:  " + pulgadas );
        System.out.println("La media que has introducido en pies es: " + pies);
        System.out.println("La medida que has introducido en yardas son: " + yardas);
        

        System.out.println();
        System.out.println("Fin del programa. Bye!");
    }

	        
	        

		
		
		
	}


