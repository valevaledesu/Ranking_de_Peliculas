package entidades;

public class Usuario {

	public int id;
	public String username;
	public String contrasena;

	public Usuario(int id, String username, String contrasena) {
		super();
		this.id = id;
		this.username = username;
		this.contrasena = contrasena;
	}

	public Usuario(String username, String contrasena) {
		super();
		this.username = username;
		this.contrasena = contrasena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}