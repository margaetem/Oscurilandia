package cl.awakelab.pks;

public class Caguano extends Carro {
	
	//Atributos de la clase hija Caguano
	
	private int alcanceDeTiro;
	private String colorConfeti;
	
	//Constructores
	
	public Caguano() {
		this.alcanceDeTiro = 0;
		this.colorConfeti = "";
	}
	

	public Caguano(int alcanceDeTiro, String colorConfeti) {
		super();
		this.alcanceDeTiro = alcanceDeTiro;
		this.colorConfeti = colorConfeti;
	}

	//Getters and Setters

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

	//toString

	@Override
	public String toString() {
		return "Caguano [alcanceDeTiro=" + alcanceDeTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
	
}
