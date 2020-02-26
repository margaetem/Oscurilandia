package cl.awakelab.ejec;

import java.util.ArrayList;
import java.util.Scanner;

import cl.awakelab.camaraSecreta.*;
import cl.awakelab.pks.Carro;

public class Ejecutable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		menu();
		while (true) {
			Tablero.escribir("¿Aceptas el desafio? (1 para aceptar, 2 para huir)");
			int siono = Tablero.pedirEntero(scanner, 1, 2);
			if (siono == 1) {
				Tablero.escribir("Vamos adelante!!");
				juego();
			} else
				Tablero.escribir("Chao Perkin!!");
			break;
		}

	}

	static void menu() {
		Tablero.escribir("*** BIENVENIDO A  O S C U R I L A N D I A *** \n");
		Tablero.escribir("¡FirstLine necesita de tu ayuda! \n");
		Tablero.escribir("Los villanos de la Camara Secreta tienen un plan para apodarse \n"
				+ "de la ciudad… para llevarlo a cabo cuentan con la ayuda \nde sus secuaces los PKS,"
				+ " los que protegen la entrada del lugar. \n");
		Tablero.escribir("Debemos evitar que se salgan con la suya!!! \n");

	}

	static void repeatMenu() {
		Tablero.escribir("1.- Crear Matriz");
		Tablero.escribir("2.- Lanzar Huevo");
		Tablero.escribir("3.- Calcular puntaje y Mostrar matriz completa");
		Tablero.escribir("4.- Mostrar datos PKS");
		Tablero.escribir("5.- Salir");
	}

	public static void juego() {
		Scanner scanner = new Scanner(System.in);
		Tablero app = new Tablero();
		int contadorLanzamientos = 0;
		while (true) {
			repeatMenu();
			int op = Tablero.pedirEntero(scanner, 1, 6);
			System.out.println();
			if (op == 1) {
				app.crearCarro();
				Tablero.escribir("La matriz ha sido creada. puedes comenzar a lanzar huevos.");
			} else if (op == 2) {

				app.lanzarHuevo();
				app.mostrarMatriz(false);
				Tablero.escribir("Su puntaje es: " + app.mostrarPuntaje(contadorLanzamientos));
				contadorLanzamientos++;
			} else if (op == 3) {
				app.mostrarMatriz(true);
				Tablero.escribir("Su puntaje es: " + app.mostrarPuntajeTotal());
			} else if (op == 4) {
				ArrayList<Carro> carros = app.getCarros();
				for (Carro carro : carros) {
					Tablero.escribir(carro.toString());
				}

			}

			else
				break;
		}
	}
}
