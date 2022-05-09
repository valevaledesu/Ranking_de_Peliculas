package com.vale.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	private String urlConeccion;
	private Connection conn = null;
	
	public Conector (String urlConeccion) {
		
		this.urlConeccion = urlConeccion;
		
	}
	public Connection getConeccion() {
		
		return this.conn;
		
	}
	
	public void conectar() {
		
		try {
			this.conn = DriverManager.getConnection(this.urlConeccion);
			System.out.println("La base de datos ha sido conectada");
		} catch (SQLException e) {
			System.out.println("Error al conectar la base de datos");
			e.printStackTrace();
		}
		
	}
	
	public void desconectar() {
		
		try {
			this.conn.close();
			System.out.println("Base de datos desconectada");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
