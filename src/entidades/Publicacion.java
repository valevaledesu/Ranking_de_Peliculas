package entidades;

public class Publicacion {
	
	private int id;
	private String fecha;
	private String publicacion;
	private int estrellas;
	private int id_pelicula;
	private Usuario usuario;
	
	public Publicacion(String fecha, String publicacion, int estrellas, int id_pelicula, Usuario usuario) {
		super();
		this.fecha = fecha;
		this.publicacion = publicacion;
		this.estrellas = estrellas;
		this.usuario = usuario;
		this.id_pelicula = id_pelicula;
	}

	public Publicacion(int id, String fecha, String publicacion, int estrellas, int id_pelicula, Usuario usuario) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.publicacion = publicacion;
		this.estrellas = estrellas;
		this.usuario = usuario;
		this.id_pelicula = id_pelicula;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public int getId() {
		return id;
	}
	
	
}
