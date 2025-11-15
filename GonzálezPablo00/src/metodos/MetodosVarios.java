package metodos;

public class MetodosVarios {

	public static void main(String[] args) {
		boolean par;
		par = esPar(7);
		System.out.println(par);

	}
	//Dice si un numero es par o no devolviendo booleano
	public static boolean esPar ( int numero) {
		boolean par;
		
		if ( numero % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;
	}
	
	public static boolean esImpar ( int numero) {
		return !esPar(numero);
	}
}
