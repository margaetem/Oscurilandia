package cl.awakelab.ejec;

import java.util.ArrayList;
import java.util.Scanner;

import cl.awakelab.camaraSecreta.*;
import cl.awakelab.pks.Carro;
/**
 * Esta clase se utiliza para ejecutar el promgrama.
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 *
 */
public class Ejecutable {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		menu();
		while (true) {
			Tablero.escribir("¿QUIERES PEGARTE LA MISION?(1 para aceptar, 2 para huir)");
			int siono = Tablero.pedirEntero(scanner, 1, 2);
			if (siono == 1) {
				Tablero.escribir("\nEste es el desafío:");
				pegateLaMision();
			} else
				Tablero.escribir("\nTe vai' a poner la capa?");
			break;
		}
	}
	/**
	 * Este metodo se utiliza para darle la bienvenida al jugador y lo intruduce al juego	 
	 * 
	 */
	static void menu() {
		Tablero.escribir("*** BIENVENIDO A  O S C U R I L A N D I A *** \n");
		Tablero.escribir("¡FirstLine necesita de tu ayuda! \n");
		Tablero.escribir("Los villanos de la Camara Secreta tienen un plan para apodarse \n"
				+ "de la ciudad… para llevarlo a cabo cuentan con la ayuda \nde sus secuaces los PKS,"
				+ " los que protegen la entrada del lugar. \n");
		Tablero.escribir("Debemos evitar que se salgan con la suya!!! \n");
	}
	/**
	 * Da una explicacion de la mision y le pregunta al usuario si acepta la mision.
	 */
	static void pegateLaMision() {
		Scanner scanner = new Scanner(System.in);
		Tablero.escribir("Tu misión es lanzar huevos a los vehículos \n"
				+ "de las fuerzas de acción de los PKS para poder inhabilitarlos. \n"
				+ "Tienes a tu disposición una cantidad infinita de huevos, \n"
				+ "lánzalos y cruza los dedos para achuntarle!! \n");

		while (true) {
			Tablero.escribir("¿ACEPTAS EL DESAFIO? (1 para aceptar, 2 para huir)");
			int siono = Tablero.pedirEntero(scanner, 1, 2);
			if (siono == 1) {
				Tablero.escribir("\nVamos adelante!!");
				crearMatriz();
			} else
				Tablero.escribir("\nChao Perkin!!");
			break;
		}
	}
	/**
	 * instancia la clase tablero, crea todos los carros 
	 * tambien explica los puntajes y ejecuta el menu.
	 */
	static void crearMatriz() {
            Tablero app = new Tablero();
            app.crearCarro();
            Scanner scanner = new Scanner(System.in);
            int contadorLanzamientos = 0;
            Tablero.escribir("\nEstás en el campo de batalla junto a los FirstLine\n");
            Tablero.escribir("El puntaje se asigna así:\n" + 
                            "Si le achuntas a una Kromi(K) tienes 3pts por casilla.\n" + 
                            "Tendrás 10pts adicionales si te la piteas entera(Ocupa 3 casillas verticales)\n" + 
                            "Si le achuntas a un Caguano(C) tienes 2pts por casilla.\n" + 
                            "Tendrás 7pts adicionales si te la piteas (Ocupa 2 casillas horizontales)\n" + 
                            "Si le achuntas a una Trupalla(T) tienes 1pt.\n");
            while (true) {
                    repeatMenu();
                    Tablero.escribir("Escoge lo que quieres hacer.");
                    int op = Tablero.pedirEntero(scanner, 1, 4);
                    System.out.println();
                    if (op == 1) {
                            app.lanzarHuevo();
                            app.mostrarMatriz(false);
                            Tablero.escribir("Su puntaje es: " + app.mostrarPuntaje(contadorLanzamientos));
                            contadorLanzamientos++;
                    } else if (op == 2) {
                            app.mostrarMatriz(true);
                            Tablero.escribir("Su puntaje es: " + app.mostrarPuntajeTotal());
                    } else if (op == 3) {
                            ArrayList<Carro> carros = app.getCarros();
                            for (Carro carro : carros) {
                                    Tablero.escribir(carro.toString());
                            }
                    } else
                            break;
            }
    }

	/**
	 * muestra el menu al usuario.
	 */
	static void repeatMenu() {
		Tablero.escribir("Opciones:");
		Tablero.escribir("1.- Lanzar Huevo");
		Tablero.escribir("2.- Calcular puntaje y Mostrar matriz completa");
		Tablero.escribir("3.- Mostrar datos PKS");
		Tablero.escribir("4.- Salir\n");
	}
}
