package formatoCadenas;

public class FormatoCadenas {

	public static void main(String[] args) {
		
		String nombre = "Juan";
		int edad = 34;
		double altura = 1.87;
		double peso = 75.4;
		double indiceMasaCoprporal = (peso)/ (altura * altura);
		
		
		String cadena = String.format("Nombre: %s ** Edad: %d ** Altura: %.2f ** Indice de masa corporal: %.3f", nombre,edad,altura,indiceMasaCoprporal);
		System.out.println(cadena);
		
		System.out.printf("Nombre: %s ** Edad: %d ** Altura: %.2f ** Indice de masa corporal: %.1f", nombre,edad,altura,indiceMasaCoprporal);

	}

}
