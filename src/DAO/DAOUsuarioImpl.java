package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.vale.jdbcExample.Conector;

import entidades.Usuario;
import interfaces.DAOUsuario;

public class DAOUsuarioImpl /*extends Conector implements DAOUsuario */{

	/*
	public DAOUsuarioImpl(String urlConeccion) {
		super(urlConeccion);

	}

	public void registrar(Usuario us) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("INSERT INTO Usuarios(nombre, email, contrasena, nacimiento) VALUES(?, ?, ?, ?)");

			//Ponemos los datos
			st.setString(1, us.getNombre());
			st.setString(2, us.getEmail());
			st.setString(3, us.getContraseña());
			
			//Del string us.getNacimiento convertir a date
			//POr ahora metemos una constante
			st.setDate(4, new Date(622790105000L));
			
			st.executeUpdate();
		} catch (Exception ex) {
			throw ex;
		} finally {
			this.desconectar();
		}

	}

	public void modificar(Usuario us) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("UPDATE Usuarios set nombre where id = ?");
			st.setInt(1, us.getId());
			st.executeUpdate();
		} catch (Exception ex) {
			throw ex;
		} finally {
			this.desconectar();
		}
	}

	public void eliminar(Usuario us) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("delete from Usuarios where id = ?");
			st.setInt(1, us.getId());
			st.executeUpdate();
		} catch (Exception ex) {
			throw ex;
		} finally {
			this.desconectar();
		}

	}
	public Usuario buscar(int id) throws Exception {
		
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("SELECT * from Usuarios where id_usuario = ?");
			st.setInt(1, id);
			responseData = st.executeQuery();
			responseData.next();
		} catch (Exception ex) {
			throw ex;
		} finally {
			this.desconectar();
		}
		
		return new Usuario(responseData.getInt(1),responseData.getString(2),responseData.getString(3),responseData.getString(4),responseData.getString(5));

	}

	public List<Usuario> listar() throws Exception {
		
		
		
		
		return null;
	}
//clase implementación de interfaces 
	
	public static void main(String[] args){
		
		DAOUsuarioImpl daoUsuario = new DAOUsuarioImpl("jdbc:mariadb://127.0.0.1:3306/PeliculasDB?user=root&password=");
		//Usuario nuevoUsuario = new Usuario("Tony", "tony@example.com", "12345", "no se va ingresar");
		
		try {
			//daoUsuario.registrar(nuevoUsuario);
			Usuario miUsuario = daoUsuario.buscar(1);
			System.out.print(miUsuario.getEmail() + " " + miUsuario.getNacimiento());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se encontró.");
		}
	}

	public void buscar(Usuario us) throws Exception {
		
		
	}*/

}
