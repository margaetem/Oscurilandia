package cl.awakelab.ejec;
import cl.awakelab.pks.*;

public class Ejecutable {

	public static void main(String[] args) {
		Carro c1 = new Kromi(); 
		c1.getUbicacionColumna();
		c1.getUbicacionFila();
		//System.out.println(c1.getUbicacionColumna() + "," + c1.getUbicacionFila());
		System.out.println(c1);
		
	}

}

