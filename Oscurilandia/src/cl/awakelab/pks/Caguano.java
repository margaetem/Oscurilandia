package cl.awakelab.pks;

import cl.awakelab.funciones.RandomPksQls;

/**
 * En esta clase se definen los atributos de Caguano
 * 
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 *
 */
public class Caguano extends Carro {

	// Atributos de la clase hija Caguano

	private int alcanceDeTiro;
	private String colorConfeti;
	RandomPksQls rnd = new RandomPksQls();
	// Constructores

	public Caguano() {
		super();
		this.alcanceDeTiro = (int) (Math.random() * 15);
		this.colorConfeti = rnd.getColor();
	}

	public Caguano(int alcanceDeTiro, String colorConfeti) {
		super();
		this.alcanceDeTiro = alcanceDeTiro;
		this.colorConfeti = colorConfeti;
	}

	// Getters and Setters

	public int getAlcanceDeTiro() {
		return alcanceDeTiro;
	}

	public void setAlcanceDeTiro(int alcanceDeTiro) {
		this.alcanceDeTiro = alcanceDeTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	// toString

	@Override
	public String toString() {
		return "Caguano [cantidadOcupantes:" + super.getCantidadOcupantes() + ", fechaIngreso:"
				+ super.getFechaIngreso() + ", ubicacionFila:" + super.getUbicacionFila() + ", ubicacionColumna:"
				+ super.getUbicacionColumna() + ", alcandeDeTiro: " + alcanceDeTiro + ", colorConfeti: " + colorConfeti
				+ "]";
	}

}
