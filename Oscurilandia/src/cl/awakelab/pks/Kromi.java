package cl.awakelab.pks;

import cl.awakelab.funciones.*;

/**
 * En esta clase se definen los atributos de Kromi
 * 
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 *
 */
public class Kromi extends Carro {

	// Atributos de la clase hija Kromi

	private String anoFabricacion;
	private String marca;

	RandomPksQls rnd = new RandomPksQls();

	// Constructores

	public Kromi() {
		super();
		this.anoFabricacion = rnd.getAno();
		this.marca = rnd.getMarca();
	}

	public Kromi(String anoFabricacion, String marca) {
		super();
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
	}

	// Getters and Setters

	public String getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(String anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [cantidadOcupantes: " + super.getCantidadOcupantes() + ", fechaIngreso: "
				+ super.getFechaIngreso() + ", ubicacionFila: " + super.getUbicacionFila() + ", ubicacionColumna:"
				+ super.getUbicacionColumna() + ", añoFabricacion: " + anoFabricacion + ", Marca: " + marca + "]";
	}

	// toString

}
