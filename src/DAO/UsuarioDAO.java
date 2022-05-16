package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vale.jdbcExample.Conector;

import entidades.Director;
import entidades.Usuario;

public class UsuarioDAO extends Conector {

	public UsuarioDAO(String urlConeccion) {
		super(urlConeccion);
		// TODO Auto-generated constructor stub
	}

	// Obtener a todos los directores
	public ArrayList<Usuario> getAllUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("SELECT * FROM Usuarios");
			responseData = st.executeQuery();
			while (responseData.next()) {
				Usuario temp = new Usuario(responseData.getInt(1), responseData.getString(2),
						responseData.getString(3));
				usuarios.add(temp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.desconectar();
		}
		return usuarios;
	}
	
	public static void main(String[] args) {
		UsuarioDAO usuarioDao = new UsuarioDAO("jdbc:mariadb://127.0.0.1:3306/rankingpeliculasdb?user=root&password=");
		ArrayList<Usuario> usuarios = usuarioDao.getAllUsuarios();
		
		for(Usuario user: usuarios) {
			System.out.println(user.getId());
			System.out.println(user.getUsername());
		}
	}

}
