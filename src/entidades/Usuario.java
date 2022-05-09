package entidades;

public class Usuario {

	public int id;
	public String nombre;
	public String email;
	public String contraseña;
	public String nacimiento;
	
	
	
	public Usuario(String nombre, String email, String contraseña, String nacimiento) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contraseña = contraseña;
		this.nacimiento = nacimiento;
	}
	
	public Usuario(int id, String nombre, String email, String contraseña, String nacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.contraseña = contraseña;
		this.nacimiento = nacimiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	
}
