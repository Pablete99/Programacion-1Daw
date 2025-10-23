package operadores;

public class Conversiontipos {

	public static void main(String[] args) {
        byte monederoPequenyo = 10;
        int monederoMediano = 10000;
        long monederoGrande = 1000000000000l;
        
        monederoGrande = monederoMediano;  // conversión automática
        monederoMediano = monederoPequenyo;
        
        monederoPequenyo = ( byte ) monederoMediano; // cast !! conversión
        
        System.out.println("MOnedero pequeño: " + monederoPequenyo);
        System.out.println("MOnedero medianno: " + monederoMediano);
        System.out.println("MOnedero grande: " + monederoGrande);


        
	}

}
