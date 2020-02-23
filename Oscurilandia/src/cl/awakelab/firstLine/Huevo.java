package cl.awakelab.firstLine;

public class Huevo {
	private int filaObjetivo;
	private int columnaObjetivo;
	private int puntajeObtenido;

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
