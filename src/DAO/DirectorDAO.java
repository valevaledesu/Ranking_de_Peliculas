package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vale.jdbcExample.Conector;

import entidades.Director;

public class DirectorDAO extends Conector {

	public DirectorDAO(String urlConeccion) {
		super(urlConeccion);
		// TODO Auto-generated constructor stub
	}
	
	//Obtener a todos los directores
	public ArrayList<Director> getAllDirectores(){
		ArrayList<Director> directores = new ArrayList<Director>();
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("SELECT * FROM Directores");
			responseData = st.executeQuery();
			while(responseData.next()){
                Director temp = new Director(responseData.getInt(1), responseData.getString(2), responseData.getString(3));
                directores.add(temp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.desconectar();
		}
		return directores;
	}
	
	public Director getById(int id){
		Director director = null;
		ResultSet responseData;
		try {
			this.conectar();
			PreparedStatement st = this.conn.prepareStatement("SELECT * FROM Directores WHERE id_director = ?");
			st.setInt(1, id);
			responseData = st.executeQuery();
			responseData.next();
			
			director = new Director(responseData.getInt(1), responseData.getString(2), responseData.getString(3));
		} catch (Exception ex) {
			//ex.printStackTrace();
		} finally {
			this.desconectar();
		}
		return director;
	}
	
	
	public static void main(String[] args) {
		DirectorDAO directorDao = new DirectorDAO("jdbc:mariadb://127.0.0.1:3306/rankingpeliculasdb?user=root&password=");
		ArrayList<Director> directores = directorDao.getAllDirectores();
		
		for(Director director: directores){
			System.out.println(director.getNombre());
		}
		
		Director director = directorDao.getById(3);
		
		System.out.print(director.getNacionalidad());
	}

}
