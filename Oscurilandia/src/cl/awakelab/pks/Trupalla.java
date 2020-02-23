package cl.awakelab.pks;

public class Trupalla extends Carro {

	//Atributos de la clase hija Trupalla
	
	//El valor de nivelArmadura era entre 1 y 5.
	//nombrePks es para saber quien es el conductor del carro
	
	private int nivelArmadura;
	private String nombrePks;
	
	//Constructores
	
	public Trupalla() {
		super();
		this.nivelArmadura = 0;
		this.nombrePks = "";
	}
	public Trupalla(int nivelArmadura, String nombrePks) {
		super();
		this.nivelArmadura = nivelArmadura;
		this.nombrePks = nombrePks;
	}
	
	//Getters and Setters
	
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public String getNombrePks() {
		return nombrePks;
	}
	public void setNombrePks(String nombrePks) {
		this.nombrePks = nombrePks;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombrePks=" + nombrePks + "]";
	}
	
	
	
}
