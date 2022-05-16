package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vale.jdbcExample.Conector;

import entidades.Director;
import entidades.Pelicula;

public class PeliculaDAO extends Conector {

	public PeliculaDAO(String urlConeccion) {
		super(urlConeccion);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Pelicula> getAllPeliculas() {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement(
					"SELECT Peliculas.id_pelicula, Peliculas.nombre as nombrePelicula, Peliculas.genero, Peliculas.duracion, Peliculas.descripcion, Peliculas.clasificacion, Peliculas.productora, Peliculas.ano_estreno, Directores.id_director, Directores.nombre as nombreDirector, Directores.nacionalidad FROM (Peliculas INNER JOIN Directores ON Peliculas.id_director = Directores.id_director)");
			responseData = st.executeQuery();

			while (responseData.next()) {
				Director directorPelicula = new Director(responseData.getInt(9), responseData.getString(10),
						responseData.getString(11));
				Pelicula peliTemp = new Pelicula(responseData.getInt(1), responseData.getString(2),
						responseData.getString(3), responseData.getInt(4), responseData.getString(5),
						responseData.getString(6), responseData.getString(7), responseData.getString(8),
						directorPelicula, 0.0);
				peliculas.add(peliTemp);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.desconectar();
		}
		return peliculas;
	}

	public ArrayList<Pelicula> getAllPeliculasDirector(Director director) {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement(
					"SELECT Peliculas.id_pelicula, Peliculas.nombre as nombrePelicula, Peliculas.genero, Peliculas.duracion, Peliculas.descripcion, Peliculas.clasificacion, Peliculas.productora, Peliculas.ano_estreno, Directores.id_director, Directores.nombre as nombreDirector, Directores.nacionalidad FROM (Peliculas INNER JOIN Directores ON Peliculas.id_director = Directores.id_director) WHERE Directores.id_director = ?");
			st.setInt(1, director.getId());
			responseData = st.executeQuery();

			while (responseData.next()) {
				Director directorPelicula = new Director(responseData.getInt(9), responseData.getString(10),
						responseData.getString(11));
				Pelicula peliTemp = new Pelicula(responseData.getInt(1), responseData.getString(2),
						responseData.getString(3), responseData.getInt(4), responseData.getString(5),
						responseData.getString(6), responseData.getString(7), responseData.getString(8),
						directorPelicula, 0.0);
				peliculas.add(peliTemp);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.desconectar();
		}
		return peliculas;
	}

	public static void main(String[] args) {

		PeliculaDAO peliculaDao = new PeliculaDAO(
				"jdbc:mariadb://127.0.0.1:3306/rankingpeliculasdb?user=root&password=");
		ArrayList<Pelicula> peliculas;
		peliculas = peliculaDao.getAllPeliculas();

		for (Pelicula peli : peliculas) {
			System.out.println(peli.getNombre());
		}

		ArrayList<Pelicula> peliculasDirec = peliculaDao.getAllPeliculasDirector(new Director(1, "", ""));

		for (Pelicula peli : peliculasDirec) {
			System.out.println(peli.getDirector().getNombre());
		}
	}

}
