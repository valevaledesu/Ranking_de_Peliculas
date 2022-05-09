package com.vale.jdbcExample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	Conector miConector = new Conector("jdbc:mariadb://127.0.0.1:3306/PeliculasDB?user=root&password=");
    	
    	ResultSet responseData;
    	miConector.conectar();
        try {
            Statement myStatement =  miConector.getConeccion().createStatement();
            String myQuery = "SELECT * FROM Usuarios";
            responseData  = myStatement.executeQuery(myQuery);

            while(responseData.next()){
                System.out.println("id_usuario: " + responseData.getString(1));
                System.out.println("nombre: " + responseData.getString(2));
                System.out.println("email: " + responseData.getString(3));
                System.out.println("contraseña: " + responseData.getString(4));
                System.out.println("nacimiento: " + responseData.getString(5));
                System.out.println("");
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        

    	ResultSet responseData2;
    	//miConector.conectar();
        try {
            Statement myStatement =  miConector.getConeccion().createStatement();
            String myQuery = "SELECT * FROM Directores";
            responseData2  = myStatement.executeQuery(myQuery);

            while(responseData2.next()){
                System.out.println("id_director: " + responseData2.getString(1));
                System.out.println("nombre: " + responseData2.getString(2));
                System.out.println("edad: " + responseData2.getString(3));
                System.out.println("nacionalidad: " + responseData2.getString(4));
                System.out.println("");
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        





        miConector.desconectar();
    	
    	
        //System.out.println( "Hello World!" );
    }
}

