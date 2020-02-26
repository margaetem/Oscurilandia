package cl.awakelab.firstLine;
import cl.awakelab.camaraSecreta.*;
/**
 * En esta clase se definen los atributos de huevo.
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 */

public class Huevo {
    //atributos.
    private int filaObjetivo;
    private int columnaObjetivo;
    private int puntajeObtenido;

    //constructores.
    public Huevo ( ) {
        this.filaObjetivo = 0;
        this.columnaObjetivo = 0;
        this.puntajeObtenido = 0;
    }
    /**
     * En este constructor se instancian los atributos de huevo.
     * @param filaObjetivo setea la fila objetivo elegida por el usuario.
     * @param columnaObjetivo setea la columna objetivo elegido por el usuario.
     * @param puntajeObtenido setea el puntaje obtenido por el usuario.
     */
    public Huevo (int filaObjetivo, int columnaObjetivo, int puntajeObtenido ) {
        Tablero t1 = new Tablero();
        this.filaObjetivo = filaObjetivo;
        this.columnaObjetivo = columnaObjetivo;
        this.puntajeObtenido = puntajeObtenido;
    }

    // getters and setters
    public int getFilaObjetivo() {
        return filaObjetivo;
    }

    public void setFilaObjetivo(int filaObjetivo) {
        this.filaObjetivo = filaObjetivo;
    }

    public int getColumnaObjetivo() {
        return columnaObjetivo;
    }

    public void setColumnaObjetivo(int columnaObjetivo) {
        this.columnaObjetivo = columnaObjetivo;
    }



    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }
    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }
    // ToString
    @Override
    public String toString() {
        return "Huevo [filaObjetivo=" + filaObjetivo + ", columnaObjetivo=" + columnaObjetivo + ", puntajeObtenido="
                + puntajeObtenido + "]";
    }

}
