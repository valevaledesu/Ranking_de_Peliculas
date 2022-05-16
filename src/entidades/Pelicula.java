package entidades;

public class Pelicula {

	private int id;
	private String nombre;
	private String genero;
	private int duracion;
	private String descripcion;
	private String clasificacion;
	private String productora;
	private String ano_estreno;
	private Director director;
	private double estrellas;

	public Pelicula(String nombre, String genero, int duracion, String descripcion, String clasificacion,
			String productora, String ano_estreno, Director director) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.descripcion = descripcion;
		this.clasificacion = clasificacion;
		this.productora = productora;
		this.ano_estreno = ano_estreno;
		this.director = director;
	}

	public Pelicula(int id, String nombre, String genero, int duracion, String descripcion, String clasificacion,
			String productora, String ano_estreno, Director director, double estrellas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.descripcion = descripcion;
		this.clasificacion = clasificacion;
		this.productora = productora;
		this.ano_estreno = ano_estreno;
		this.director = director;
		this.estrellas = estrellas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getAno_estreno() {
		return ano_estreno;
	}

	public void setAno_estreno(String ano_estreno) {
		this.ano_estreno = ano_estreno;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public double getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(double estrellas) {
		this.estrellas = estrellas;
	}

	public int getId() {
		return id;
	}

}
