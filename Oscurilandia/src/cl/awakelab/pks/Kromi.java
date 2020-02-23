package cl.awakelab.pks;

public class Kromi extends Carro {
	
	//Atributos de la clase hija Kromi
	
	private String añoFabricacion;
	private String marca;

	//Constructores
	
	public Kromi() {
		this.añoFabricacion = "";
		this.marca = "";
	}
	
	public Kromi(String añoFabricacion, String marca) {
		super();
		this.añoFabricacion = añoFabricacion;
		this.marca = marca;
	}
	
	//Getters and Setters

	public String getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//toString

	@Override
	public String toString() {
		return "Kromi [añoFabricacion=" + añoFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
