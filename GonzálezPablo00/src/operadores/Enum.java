package operadores;

public class Enum {

	public static void main(String[] args) {
     
     enum Estacion {PRIMAVERA,VERANO,OTOÑO,INVIERNO}
    	 
    	  
    	 Estacion estacionActual = Estacion.OTOÑO;
    	 Estacion estacionSiguiente = Estacion.INVIERNO;
    	 
    	 System.out.println("Hoy es: " + estacionActual);
    	 System.out.println("En unos meses será : " + estacionSiguiente);
     }
	}


