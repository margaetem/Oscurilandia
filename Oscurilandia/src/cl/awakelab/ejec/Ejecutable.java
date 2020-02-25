package cl.awakelab.ejec;
import cl.awakelab.pks.*;
import cl.awakelab.camaraSecreta.*;

public class Ejecutable {

	public static void main(String[] args) {
		Tablero c1 = new Tablero(); 
		
//		c1.crearKromi();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		c1.crearKromi();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		c1.crearKromi();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		
//		c1.crearCaguano();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		c1.crearCaguano();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		c1.crearCaguano();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		c1.crearCaguano();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		c1.crearCaguano();
//		c1.mostrarMatriz();
//		
//		System.out.println("");
//		
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
//		
//		c1.crearTrupalla();
//		c1.mostrarMatriz();
//		System.out.println("");
		
		c1.crearCarro();
		c1.mostrarMatriz();
//		System.out.println(c1.getCarros());		
		c1.lanzarHuevo();
		c1.mostrarMatriz();
		c1.lanzarHuevo();
		c1.mostrarMatriz();
		c1.lanzarHuevo();
		c1.mostrarMatriz();
		System.out.println("Tu puntaje total es de: " + c1.calcularPuntaje());
	}

}

