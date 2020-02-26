package cl.awakelab.funciones;

/**
 * Esta clase se utiliza para generar datos aleatorios para las clases
 * kromi,carro, trupalla y caguano.
 * 
 * @author Trinidad Gaete, Manuel Lillo, Alexis Ruiz.
 *
 */
public class RandomPksQls {

	/**
	 * se genera una lista de anos.
	 */
	// constantes
	private final String[] ANOS = { "1973", "1574", "1934", "1810", "2020", "1983", "1987", "1984", "1928", "1523",
			"1532", "1536", "1895", "1990", "1995", "1823", "1993", "1298", "1874", "0001", "1235", "1500AC", "1300",
			"1253", "2362", "1245", "1944", "2006", "2005", "1981", "1700", "2141", "1256", "1796", "1249", "1985",
			"1698", "1563", "1999", "9999" };
	/**
	 * se genera una lista de marcas.
	 */
	private final String[] MARCAS = { "Prro", "Adidas", "YutaQL", "Nissan", "CAT", "Mercedes Benz", "Fruna", "Nestle",
			"Awakelab", "Waffle", "Abarth", "Alfa Romeo", "Aston Martin", "Honda", "Konami", "EA", "Rockstar", "Valve",
			"Lotus", "Maserati", "Lada", "Skoda", "SsangYong", "Geely", "Chery", "Ghangan", "GAC", "ZX", "Lifan",
			"Great Wall", "JMC", "Kenbo", "ZNA" };
	/**
	 * se genera una lista de colores.
	 */
	private final String[] COLORES = { "Purpura", "Magenta", "Verde", "Naranja", "Calipso", "Negro", "Rojo", "Beige",
			"Celeste", "Amarillo", "KK", "Marron", "Azul", "Ocre", "Burdeo", "Cafe", "Gris", "Violeta", "Blanco",
			"Morado", "Limon", "Salmon", "Damasco", "Amazul", "Rosado", "VerdePaco", "Esmeralda", "Carmesi", "Lila",
			"Fucia", "Lavanda", "Amatista", "Marfil" };
	/**
	 * se genera una lista de nombres.
	 */
	private final String[] NOMBRES = { "PussyDestroyer", "CaboFreire", "CaboSalinas", "SuperDick", "Raptor", "Pinocho",
			"Chadwick", "Yeta", "Cavieres", "Cifuentes", "Belencita" };

	// atributos

	private String ano;
	private String marca;
	private String color;
	private String nombre;

	// constructores
	public RandomPksQls() {
		this.generarAno();
		this.generarMarca();
		this.generarColor();
		this.generarNombre();

	}

	// Metodos
	/**
	 * Este metodo se utiliza para elegir de forma aleatoria un ano de la lista
	 * anos.
	 */
	private void generarAno() {
		this.ano = ANOS[(int) (Math.random() * ANOS.length)];
	}

	/**
	 * Este metodo se utiliza para elegir de forma aleatoria una marca de la lista
	 * marcas.
	 */
	private void generarMarca() {
		this.marca = MARCAS[(int) (Math.random() * MARCAS.length)];
	}

	/**
	 * Este metodo se utiliza para elegir de forma aleatoria un color de la lista
	 * colores
	 */
	private void generarColor() {
		this.color = COLORES[(int) (Math.random() * COLORES.length)];
	}

	/**
	 * Este metodo se utiliza para elegir de forma aleatoria un nombre de la lista
	 * nombres.
	 */
	private void generarNombre() {
		this.nombre = NOMBRES[(int) (Math.random() * NOMBRES.length)];
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
