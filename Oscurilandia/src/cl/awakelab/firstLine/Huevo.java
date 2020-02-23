package cl.awakelab.firstLine;

public class Huevo {
	private int filaObjetivo;
	private int columnaObjetivo;
	private int puntajeObtenido;
	
	//constructores
	public Huevo ( ) {
	this.filaObjetivo = 0;
	this.columnaObjetivo = 0;
	this.puntajeObtenido = 0;
	}
	public Huevo (int filaObjetivo, int columnaObjetivo, int puntajeObtenido ) {
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
