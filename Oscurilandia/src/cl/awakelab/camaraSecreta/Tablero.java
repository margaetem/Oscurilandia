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
/**
 * En la clase tablero se crea la matriz y se ubican cada uno de los carros, los
 * lanzamientos y el puntaje obtenido.
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 */
public class Tablero {
    // Se crean las constantes de la clase.
    public final static int CAPACIDAD_POR_DEFECTO = 18;
    public final static int CANTIDAD_KROMIS = 3;
    public final static int CANTIDAD_CAGUANOS = 5;
    public final static int CANTIDAD_TRUPALLAS = 10;
    public final static String LIMITE_VALIDO = "Ingresa un numero perkin";
    public final static String ENTERO_BETWEEN = "Ingresa un numero entre %d y %d";
    


    // atributos
    private ArrayList<Carro> carros = new ArrayList<Carro>();
    private ArrayList<Huevo> lanzamientos = new ArrayList<Huevo>();
    protected String[][] tablero = new String[15][15];

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
    /** 
     * Se usa el metodo crearCarro para generar las 3 Kromis, 5 Caguanos y 10 Trupallas.
     */
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
    /**
     * Se crea Kromi y se posiciona de forma aleatoria dentro de la matriz
     * y se crea un margen para que la kromi siempre quede dentro del tablero.
     */
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
    /**
     * Se crea un caguano y se genera su ubicacion aleatoria dentro del tablero en una 
     * posicion nueva para evitar que quede sobre otro vehiculo.
     */
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
    /**
     * Se crea un trupalla y se genera su ubicacion aleatoria dentro del tablero en una 
     * posicion nueva para evitar que quede sobre otro vehiculo.
     */
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
    /**
     * Este metodo se utiliza para restringir la entrada de caracteres no permitidos
     * del usuario.
     * @param entrada lee el ingreso del usuario.
     * @return regresa un numero entero de la selecion del usuario.
     */
    public static int pedirEntero(Scanner entrada) {
    		
    	while (!entrada.hasNextInt()) {
			System.err.print(LIMITE_VALIDO + ": ");
			entrada.next();
		}
    	return entrada.nextInt();
	}
     /**
      * Este metodo se utiliza para verificar que el usuario ingrese un numero 
      * dentro del rango establecido.
      * @param scanner lee el ingreso del usuario.
      * @param limiteInferior  indica el limite inferior del numero.
      * @param limiteSuperior indica el limite superior del numero.
      * @return regresa un numero entero de la seleccion del usuario.
      */
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
    	/**
    	 * Este metodo se utiliza para acortar la escritura del codigo.
    	 * @param mensaje muestra un mensaje por consola.
    	 */
    	public static void escribir (String mensaje) {
    		System.out.println(mensaje);
    	}
    
    	/**
    	 * Este metodo se utiliza para mostrar el tablero.
    	 * @param completa si es true muestra la matriz completa tanto los 
    	 * vehiculos como los lanzamientos, si es false solo muestra los lanzamientos.
    	 */

    public void mostrarMatriz(boolean completa) {
    	if (completa) {
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
    	} else {
    		 for (int i = 0; i < tablero.length; i++) {
 	            for (int j = 0; j < tablero.length; j++) {
 	                if (tablero[i][j] == null) {
 	                    System.out.print("[ ]");
 	                } else if (tablero[i][j] == "H"){
 	                    System.out.print("[" + tablero[i][j] + "]");
 	                } else {
 	                	System.out.print("[ ]");
 	                }
 	            }

 	            System.out.println("");
 	        } 
    	}
       
    }
    /**
     * Este metodo se utiliza para crear un huevo e indicarle al usuario el 
     * limite de donde lanzar el huevo tanto de la fila como columna de la matriz.
     * 
     */
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
        calcularPuntaje(filaObjetivo, columnaObjetivo, h1);
    }
    /**
     * Calcula el puntaje por cada lanzamiento, segun la posicion y asigna el puntaje
     * segun donde cayo el lanzamiento, y pone una H en el tablero.
     * tambien revisa si el usuario destruyo por completo el carro y le asigna 
     * el puntaje segun que carro destruyo.
     * @param filaObjetivo fila a la que apunto el usuario.
     * @param columnaObjetivo columna a la que apunto el usuario.
     * @param h1 es un objeto de la clase huevo que guarda los datos del 
     * lanzamiento correspondiente.
     */
    private void calcularPuntaje(int filaObjetivo, int columnaObjetivo, Huevo h1) {
    	
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
    }
    /**
     * Suma todos los puntajes obtenidos de los lanzamientos.
     * @return muestra la suma de los puntajes obtenidos.
     */
    public int mostrarPuntajeTotal() {
        
        int contador = 0;
        for (int i = 0; i < lanzamientos.size(); i++) {
        contador = contador + lanzamientos.get(i).getPuntajeObtenido();     
            
        }
        return contador;

    }
    /**
     * 
     * @param posicion muestra el puntaje individual del lanzamiento segun su posicion.
     * @return regresa el puntaje del lanzamiento por pantalla.
     */
   public int mostrarPuntaje(int posicion) {
        
	   int puntaje;
        puntaje = lanzamientos.get(posicion).getPuntajeObtenido();     
        return puntaje;

    }

}
