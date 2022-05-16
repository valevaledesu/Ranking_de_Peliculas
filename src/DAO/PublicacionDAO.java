package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vale.jdbcExample.Conector;

import entidades.Publicacion;
import entidades.Usuario;

public class PublicacionDAO extends Conector {

	public PublicacionDAO(String urlConeccion) {
		super(urlConeccion);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Publicacion> getAllPublicaciones() {
		ArrayList<Publicacion> publicacion = new ArrayList<Publicacion>();
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement(
					"SELECT Publicaciones.id_post, Publicaciones.fecha, Publicaciones.publicacion, Publicaciones.estrellas, Publicaciones.id_pelicula, Usuarios.id_usuario, Usuarios.username, Usuarios.contrasena FROM (Publicaciones INNER JOIN Usuarios ON Publicaciones.id_usuario = Usuarios.id_usuario)");
			responseData = st.executeQuery();
			while (responseData.next()) {
				Usuario user = new Usuario(responseData.getInt(6), responseData.getString(7), responseData.getString(8));
				Publicacion publitemp = new Publicacion(responseData.getInt(1), responseData.getString(2),
						responseData.getString(3), responseData.getInt(4), responseData.getInt(5), user);
				publicacion.add(publitemp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.desconectar();
		}
		return publicacion;
	}
	
	public static void main(String[] args) {
		PublicacionDAO publicacionDao = new PublicacionDAO("jdbc:mariadb://127.0.0.1:3306/rankingpeliculasdb?user=root&password=");
		ArrayList<Publicacion> publicaciones = publicacionDao.getAllPublicaciones();
		
		for(Publicacion publicacion: publicaciones) {
			System.out.println(publicacion.getUsuario().getUsername()+  ": "+ publicacion.getPublicacion() +  " *:" + publicacion.getEstrellas() );
			
		}
	}
	
}
