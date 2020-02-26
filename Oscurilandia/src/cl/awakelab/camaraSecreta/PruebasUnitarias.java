package cl.awakelab.camaraSecreta;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cl.awakelab.pks.*;
import cl.awakelab.firstLine.*;

public class PruebasUnitarias {
	/**
	 * se genera una nueva instancion de tablero y una variable para almacenar el
	 * valor de las hijas de carro
	 * 
	 */
	Tablero t1 = new Tablero();
	Carro c1;

	@Test
	public void TestCrearKromi() {
		// se genera una kromi nueva y se guardan sus datos en c1
		t1.crearKromi();
		c1 = t1.getCarros().get(0);
		// se valida que el largo de la lista carros en donde se guardan los carros
		// nuevos creados sea 1 (el recien creado).
		assertEquals(1, t1.getCarros().size());
		// como la kromi creada se genera aleatoriamente solo podemos corroborar que el
		// primer objeto que ingreso a lista no sea null.
		assertNotNull(t1.getCarros().get(0));

		// se analiza que el tablero de posiciones solo contenga una Kromi
		int contador = 0;
		for (int i = 0; i < t1.tablero.length; i++) {
			for (int j = 0; j < t1.tablero.length; j++) {
				if (t1.tablero[i][j] == "K" && t1.tablero[i + 1][j] == "K" && t1.tablero[i + 2][j] == "K") {
					contador++;
				}
			}
		}
		assertEquals(1, contador);
	}

	@Test
	public void TestCrearCaguano() {
		// se genera un Caguano nuevo y se guardan sus datos en c1
		t1.crearCaguano();
		c1 = t1.getCarros().get(0);
		// se valida que el largo de la lista carros en donde se guardan los carros
		// nuevos creados sea 1 (el recien creado).
		assertEquals(1, t1.getCarros().size());
		// como el Caguano creado se genera aleatoriamente solo podemos corroborar que
		// el
		// primer objeto que ingreso a lista no sea null.
		assertNotNull(t1.getCarros().get(0));

		// se analiza que el tablero de posiciones solo contenga un Caguano
		int contador = 0;
		for (int i = 0; i < t1.tablero.length; i++) {
			for (int j = 0; j < t1.tablero.length; j++) {
				if (t1.tablero[i][j] == "C" && t1.tablero[i][j + 1] == "C") {
					contador++;
				}
			}
		}
		assertEquals(1, contador);
	}

	@Test
	public void TestCrearTrupalla() {
		// se genera un Trupalla nuevo y se guardan sus datos en c1
		t1.crearTrupalla();
		c1 = t1.getCarros().get(0);
		// se valida que el largo de la lista carros en donde se guardan los carros
		// nuevos creados sea 1 (el recien creado).
		assertEquals(1, t1.getCarros().size());
		// como el Trupalla creado se genera aleatoriamente solo podemos corroborar que
		// el
		// primer objeto que ingreso a lista no sea null.
		assertNotNull(t1.getCarros().get(0));

		// se analiza que el tablero de posiciones solo contenga un Trupalla
		int contador = 0;
		for (int i = 0; i < t1.tablero.length; i++) {
			for (int j = 0; j < t1.tablero.length; j++) {
				if (t1.tablero[i][j] == "T") {
					contador++;
				}
			}
		}
		assertEquals(1, contador);
	}

	@Test
	public void TestMostrarMatriz() {

		// mostrar matriz muestra las celdas vacias si tienen null, "K" para Kromi, "C"
		// para Caguano, "T" para Trupalla y "H" para Huevo
		// por ende comprobamos que existan null y que solo exista un trupalla un
		// caguano y una kromi (que creamos a continuacion) y ningun huevo dado que no
		// se ha hecho ningun lanzamiento

		t1.crearKromi();
		t1.crearCaguano();
		t1.crearTrupalla();

		int contador = 0;
		boolean existenNull;
		int contadorTrupalla = 0;
		int contadorCaguano = 0;
		int contadorKromi = 0;
		int contadorHuevo = 0;
		for (int i = 0; i < t1.tablero.length; i++) {
			for (int j = 0; j < t1.tablero.length; j++) {
				if (t1.tablero[i][j] == null) {
					contador++;
				}
				if (t1.tablero[i][j] == "T") {
					contadorTrupalla++;
				}
				if (t1.tablero[i][j] == "C" && t1.tablero[i][j + 1] == "C") {
					contadorCaguano++;
				}
				if (t1.tablero[i][j] == "K" && t1.tablero[i + 1][j] == "K" && t1.tablero[i + 2][j] == "K") {
					contadorKromi++;
				}
				if (t1.tablero[i][j] == "H") {
					contadorHuevo++;
				}
			}
		}

		if (contador > 0) {
			existenNull = true;
		} else {
			existenNull = false;

		}

		assertTrue(existenNull);
		assertEquals(1, contadorTrupalla);
		assertEquals(1, contadorCaguano);
		assertEquals(1, contadorKromi);
		assertEquals(0, contadorHuevo);

	}

	@Test
	public void TestLanzarHuevo() {

		// lanzar Huevo define una fila y columna a la cual se le lanza el huevo, le
		// setea los valores a la lista Huevos de Tablero
		// y llama a la funcion calcular puntaje.

		// se genera una kromi, un caguano, una trupalla y se lanza un huevo
		t1.crearKromi();
		t1.crearCaguano();
		t1.crearTrupalla();
		// como el ingreso es por pantalla se ingresa la coordenada (0.0) para probar.
		System.out.println("Ingrese 0 en fila y 0 en columna");
		t1.lanzarHuevo();

		boolean lanzamientoExitoso = false;
		if (t1.tablero[0][0] == "H") {
			lanzamientoExitoso = true;
		}
		// se evalua que en el tablero exista la H en la celda definida y que en la
		// lista lanzamientos en el primer objeto se encuentro la coordenada (0,0)
		assertTrue(lanzamientoExitoso);
		assertEquals(0, t1.getLanzamientos().get(0).getColumnaObjetivo());
		assertEquals(0, t1.getLanzamientos().get(0).getFilaObjetivo());

	}

	@Test
	public void TestCalcularPuntaje() {

		// lanzar Huevo define una fila y columna a la cual se le lanza el huevo, le
		// setea los valores a la lista Huevos de Tablero
		// y llama a la funcion calcular puntaje.

		// se generan todos los carros de pks
		t1.crearCarro();
		Huevo h1;
		// t1.crearCaguano();
		// t1.crearTrupalla();
		// como la generacion es aleatoria se obtienen las coordenadas de la primera kromi y se
		// muestran por pantalla para setearlas
			
		System.out.println("ingrese la siguiente fila a continuacion:" + t1.getCarros().get(0).getUbicacionFila());
		System.out
				.println("ingrese la siguiente columna a continuacion:" + t1.getCarros().get(0).getUbicacionColumna());
		t1.lanzarHuevo();
		// se evalua que el puntaje por darle a la kromi sea efectivamente 3.
		assertEquals(3, t1.getLanzamientos().get(0).getPuntajeObtenido());

		// como la generacion es aleatoria se obtienen las coordenadas del primer caguano y se
		// muestran por pantalla para setearlas
		System.out.println("ingrese la siguiente fila a continuacion:" + t1.getCarros().get(3).getUbicacionFila());
		System.out
				.println("ingrese la siguiente columna a continuacion:" + t1.getCarros().get(3).getUbicacionColumna());
		t1.lanzarHuevo();
		// se evalua que el puntaje por darle al caguano sea efectivamente 2.
		assertEquals(2, t1.getLanzamientos().get(1).getPuntajeObtenido());

		// como la generacion es aleatoria se obtienen las coordenadas del primera trupalla y se
		// muestran por pantalla para setearlas
		System.out.println("ingrese la siguiente fila a continuacion:" + t1.getCarros().get(8).getUbicacionFila());
		System.out
				.println("ingrese la siguiente columna a continuacion:" + t1.getCarros().get(8).getUbicacionColumna());
		t1.lanzarHuevo();
		// se evalua que el puntaje por darle al trupalla sea efectivamente 1.
		assertEquals(1, t1.getLanzamientos().get(2).getPuntajeObtenido());
		
		// se valida que al darle a una kromi completa asigne 13 puntos, se buscan las dos coordenadas restantes de la primera kromi
		System.out.println("ingrese la siguiente fila a continuacion:" + (t1.getCarros().get(0).getUbicacionFila()+1));
		System.out.println("ingrese la siguiente columna a continuacion:" + t1.getCarros().get(0).getUbicacionColumna());
		t1.lanzarHuevo();
		System.out.println("ingrese la siguiente fila a continuacion:" + (t1.getCarros().get(0).getUbicacionFila()+2));
		System.out.println("ingrese la siguiente columna a continuacion:" + t1.getCarros().get(0).getUbicacionColumna());
		t1.lanzarHuevo();
		// al darle a la tercera celda de la kromi el resultado debe ser 13
		assertEquals(13, t1.getLanzamientos().get(4).getPuntajeObtenido());
		
		// se valida que al darle a un caguano complet asigne 10 puntos, se busca la coordenada restantes del primer caguano
		System.out.println("ingrese la siguiente fila a continuacion:" + t1.getCarros().get(3).getUbicacionFila());
		System.out.println("ingrese la siguiente columna a continuacion:" + (t1.getCarros().get(3).getUbicacionColumna()+1));
		t1.lanzarHuevo();
		// al darle a la segunda celda del caguano el resultado debe ser 9
		assertEquals(9, t1.getLanzamientos().get(5).getPuntajeObtenido());
	}

}