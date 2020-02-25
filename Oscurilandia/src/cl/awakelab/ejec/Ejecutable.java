package cl.awakelab.ejec;
import java.util.Scanner;

import cl.awakelab.camaraSecreta.*;

public class Ejecutable {
	
	static void menu() {
		Tablero.escribir("***Bienvenido a la simulación Oscurilandia***");
		
		Tablero.escribir("¡FirstLine necesita de tu ayuda!");
		Tablero.escribir("1.- Crear Matriz");
		Tablero.escribir("2.- Lanzar Huevo");
		Tablero.escribir("3.- Calcular puntaje");
		Tablero.escribir("4.- Mostrar matriz");
		Tablero.escribir("5.- Mostrar datos PKS");
		Tablero.escribir("6.- Salir");
		
	}

	public static void main(String[] args) {
			
	Scanner scanner = new Scanner (System.in);
	Tablero app = new Tablero(); 
		
		while(true) {
			menu();
			int op = Tablero.pedirEntero(scanner, 1, 6);
			System.out.println();
			if (op == 1)
				app.crearCarro();
			else if (op == 2)
				app.lanzarHuevo();
			else if (op == 3)
				Tablero.escribir("Su puntaje es: " + app.calcularPuntaje());
			else if (op == 4)
				app.mostrarMatriz();
			else if (op == 5)
				Tablero.escribir("Los datos de los carros son: " + app.getCarros());
			else
				break;
		}
	}
}

