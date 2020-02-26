package cl.awakelab.pks;

import cl.awakelab.funciones.RandomPksQls;
/**
 * En esta clase se definen los atributos de Trupalla.
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 *
 */
public class Trupalla extends Carro {

	//Atributos de la clase hija Trupalla
	
	//El valor de nivelArmadura era entre 1 y 5.
	//nombrePks es para saber quien es el conductor del carro
	
	private int nivelArmadura;
	private String nombrePks;
	RandomPksQls rnd = new RandomPksQls();
	//Constructores
	
	public Trupalla() {
		super();
		this.nivelArmadura =(int)(Math.random() * 5 + 1); ;
		this.nombrePks = rnd.getNombre();
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
		return "Trupalla [cantidadOcupantes: " + super.getCantidadOcupantes() + ", fechaIngreso: " + super.getFechaIngreso() + ", ubicacionFila: "
				+ super.getUbicacionFila() + ", ubicacionColumna: " + super.getUbicacionColumna()+ ", nivelArmadura: " + nivelArmadura
				+ ", nombrePks: " + nombrePks + "]";
	}
	
	
}
