package cl.awakelab.camaraSecreta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
//<<<<<<< HEAD
//=======
//import java.util.InputMismatchException;
//>>>>>>> branch 'master' of https://github.com/margaetem/Oscurilandia
import java.util.Scanner;

import cl.awakelab.pks.*;
import cl.awakelab.firstLine.*;

public class Tablero {
    // constante
    public final static int CAPACIDAD_POR_DEFECTO = 18;
    public final static int CANTIDAD_KROMIS = 3;
    public final static int CANTIDAD_CAGUANOS = 5;
    public final static int CANTIDAD_TRUPALLAS = 10;
    public final static String LIMITE_VALIDO = "Ingresa un numero perkin";
    public final static String ENTERO_BETWEEN = "Ingresa un numero entre %d y %d";
    


    // atributos
    private ArrayList<Carro> carros = new ArrayList<Carro>();
    private ArrayList<Huevo> lanzamientos = new ArrayList<Huevo>();
    private String[][] tablero = new String[15][15];

    // constructores
    public Tablero() {

    }

    public Tablero(ArrayList Carro, ArrayList huevo) {
        this.carros = new ArrayList<Carro>();
        this.lanzamientos = new ArrayList<Huevo>();

    }

    // Getters and Setters
    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public ArrayList<Huevo> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(ArrayList<Huevo> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    // toString
    @Override
    public String toString() {
        return "Tablero [carros=" + carros + ", lanzamientos=" + lanzamientos + ", tablero=" + Arrays.toString(tablero)
        + "]";
    }

    // Metodos
    public void crearCarro() {
        for (int i = 0; i < CANTIDAD_KROMIS; i++) {
            crearKromi();
        }
        for (int i = 0; i < CANTIDAD_CAGUANOS; i++) {
            crearCaguano();
        }
        for (int i = 0; i < CANTIDAD_TRUPALLAS; i++) {
            crearTrupalla();
        }

    }

    public void crearKromi() {
        Carro c1;
        int fila;
        int columna;
        int flag;
        do {
            c1 = new Kromi();
            fila = c1.getUbicacionFila();
            columna = c1.getUbicacionColumna();

            flag = 0;
            if (fila > 12) {
                flag = 1;
            } else {
                for (int i = 0; i < 3; i++) {

                    // System.out.println(tablero[fila + i][columna]);
                    if (tablero[fila + i][columna] != null) {

                        flag++;
                        // System.out.println(flag);
                    }
                }

            }
        } while (flag > 0);

        tablero[fila][columna] = "K";
        tablero[fila + 1][columna] = "K";
        tablero[fila + 2][columna] = "K";
        carros.add(c1);

    }

    public void crearCaguano() {
        Carro c1;
        int fila;
        int columna;
        int flag;
        do {
            c1 = new Caguano();
            fila = c1.getUbicacionFila();
            columna = c1.getUbicacionColumna();
            flag = 0;
            if (columna > 13) {
                flag = 1;
            } else {
                for (int i = 0; i < 2; i++) {
                    if (tablero[fila][columna + i] != null) {
                        flag++;
                    }
                }

            }
        } while (flag > 0);

        tablero[fila][columna] = "C";
        tablero[fila][columna + 1] = "C";
        carros.add(c1);

    }

    public void crearTrupalla() {
        Carro c1;
        int fila;
        int columna;
        int flag;
        do {
            c1 = new Trupalla();
            fila = c1.getUbicacionFila();
            columna = c1.getUbicacionColumna();
            flag = 0;

            if (tablero[fila][columna] != null) {
                flag++;
            }
        } while (flag > 0);

        tablero[fila][columna] = "T";
        carros.add(c1);

    }

    public static int pedirEntero(Scanner entrada) {
    		
    	while (!entrada.hasNextInt()) {
			System.err.print(LIMITE_VALIDO + ": ");
			entrada.next();
		}
    	return entrada.nextInt();
	}
     
    public static int pedirEntero(Scanner scanner, int limiteInferior, int limiteSuperior) {
        int entero;
        do {
            entero = pedirEntero(scanner);
            if(scanner.hasNextLine())
                scanner.nextLine();
            if(entero < limiteInferior || entero > limiteSuperior)
                System.err.print(String.format(ENTERO_BETWEEN, limiteInferior, limiteSuperior));
        } while(entero < limiteInferior || entero > limiteSuperior);
        return entero;
    }
    	
    	public static void escribir (String mensaje) {
    		System.out.println(mensaje);
    	}
    
    	

    public void mostrarMatriz() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[" + tablero[i][j] + "]");
                }
            }

            System.out.println("");
        }
    }

    public void lanzarHuevo() {
    	
    		
        Huevo h1 = new Huevo();
        Scanner scanner = new Scanner(System.in);
        escribir("Ingrese la fila a la que desea apuntar (entero entre 0 y 14)");
        int filaObjetivo = pedirEntero(scanner, 0, 14);
        h1.setFilaObjetivo(filaObjetivo);
       escribir("Ingrese la columna a la que desea apuntar (entero entre 0 y 14)");
        int columnaObjetivo = pedirEntero(scanner, 0, 14);
        h1.setColumnaObjetivo(columnaObjetivo);
        lanzamientos.add(h1);

        if (tablero[filaObjetivo][columnaObjetivo] == null) {
            h1.setPuntajeObtenido(0);
            tablero[filaObjetivo][columnaObjetivo] = "H";
        } else {

            int ubicacionColumnaCarro;
            int ubicacionFilaCarro;

            switch (tablero[filaObjetivo][columnaObjetivo]) {
            case "K":
                h1.setPuntajeObtenido(3);
                tablero[filaObjetivo][columnaObjetivo] = "H";

                for (int i = 0; i < 3; i++) {

                    ubicacionColumnaCarro = carros.get(i).getUbicacionColumna();
                    ubicacionFilaCarro = carros.get(i).getUbicacionFila();
//                    System.out.println(" ");
//                    System.out.println(ubicacionColumnaCarro);
//                    System.out.println(ubicacionFilaCarro);
                    if (columnaObjetivo == ubicacionColumnaCarro) {
                        if (filaObjetivo == ubicacionFilaCarro || filaObjetivo == (ubicacionFilaCarro + 1)
                                || filaObjetivo == (ubicacionFilaCarro + 2)) {
                            if (tablero[ubicacionFilaCarro][ubicacionColumnaCarro] == "H"
                                    && tablero[ubicacionFilaCarro + 1][ubicacionColumnaCarro] == "H"
                                    && tablero[ubicacionFilaCarro + 2][ubicacionColumnaCarro] == "H") {
                                h1.setPuntajeObtenido(13);
                            }
                        }
                    }
                }
                break;
            case "C":
                h1.setPuntajeObtenido(2);
                tablero[filaObjetivo][columnaObjetivo] = "H";

                for (int i = 3; i < 8; i++) {

                    ubicacionColumnaCarro = carros.get(i).getUbicacionColumna();
                    ubicacionFilaCarro = carros.get(i).getUbicacionFila();

                    if (filaObjetivo == ubicacionFilaCarro) {
                        if (columnaObjetivo == ubicacionColumnaCarro || columnaObjetivo == ubicacionColumnaCarro + 1) {
                            if (tablero[ubicacionFilaCarro][ubicacionColumnaCarro] == "H"
                                    && tablero[ubicacionFilaCarro][ubicacionColumnaCarro + 1] == "H") {
                                h1.setPuntajeObtenido(9);
                            }
                        }
                    }
                }
                break;
            case "T":
                h1.setPuntajeObtenido(1);
                tablero[filaObjetivo][columnaObjetivo] = "H";
                break;
            case "H":
                h1.setPuntajeObtenido(0);
                tablero[filaObjetivo][columnaObjetivo] = "H";
                break;
            }
        }
//        System.out.println(h1.toString());
//        scanner.close();
    }

    public int calcularPuntaje() {
        
        int contador = 0;
        for (int i = 0; i < lanzamientos.size(); i++) {
        contador = contador + lanzamientos.get(i).getPuntajeObtenido();     
            
        }
        return contador;

    }

}
