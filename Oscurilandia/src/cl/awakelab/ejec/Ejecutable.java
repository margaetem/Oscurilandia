package cl.awakelab.ejec;
import java.util.ArrayList;
import java.util.Scanner;

import cl.awakelab.camaraSecreta.*;
import cl.awakelab.pks.Carro;

public class Ejecutable {
	
	static void menu() {
		Tablero.escribir("***Bienvenido a la simulación Oscurilandia***");
		
		Tablero.escribir("¡FirstLine necesita de tu ayuda!");
		Tablero.escribir("1.- Crear Matriz");
		Tablero.escribir("2.- Lanzar Huevo");
		Tablero.escribir("3.- Calcular puntaje y Mostrar matriz completa");
		Tablero.escribir("4.- Mostrar datos PKS");
		Tablero.escribir("5.- Salir");
		
	}

	public static void main(String[] args) {
			
	Scanner scanner = new Scanner (System.in);
	Tablero app = new Tablero(); 
		int contadorLanzamientos = 0;
		while(true) {
			menu();
			int op = Tablero.pedirEntero(scanner, 1, 6);
			System.out.println();
			if (op == 1)
				app.crearCarro();
			else if (op == 2) {
				
				app.lanzarHuevo();
			   app.mostrarMatriz(false);
			   Tablero.escribir("Su puntaje es: " + app.calcularPuntaje(contadorLanzamientos));
			   contadorLanzamientos++;
			}
			else if (op == 3) {
				app.mostrarMatriz(true);
				Tablero.escribir("Su puntaje es: " + app.calcularPuntajeTotal());
			}	
			else if (op == 4) {
				ArrayList <Carro> carros = app.getCarros();
				for (Carro carro : carros) {
					Tablero.escribir(carro.toString());
				}
				
			}
				
			else 
				break;
		}
	}
}

