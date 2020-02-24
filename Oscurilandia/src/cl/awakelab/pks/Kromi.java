package cl.awakelab.pks;

public class Kromi extends Carro {
	
	//Atributos de la clase hija Kromi
	
	private String anoFabricacion;
	private String marca;

	//Constructores
	
	public Kromi() {
		super();
		this.anoFabricacion = "";
		this.marca = "";
	}
	
	public Kromi(String anoFabricacion, String marca) {
		super();
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
	}
	
	//Getters and Setters

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
	
	//toString

	@Override
	public String toString() {
		return "Kromi [anoFabricacion=" + anoFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
