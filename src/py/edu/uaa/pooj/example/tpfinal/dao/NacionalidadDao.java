package py.edu.uaa.pooj.example.tpfinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import py.edu.uaa.pooj.example.tpfinal.model.Nacionalidad;

/**
 * 
 * @author gsoria
 * Clase que maneja el acceso a la base de datos
 * Referencia: https://es.wikipedia.org/wiki/Data_Access_Object
 * 
 */

public class NacionalidadDao {

	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/practica";
	private static final String DB_USER = "gsoria";
	private static final String DB_PASSWORD = "postgres";
	
	
	public Nacionalidad recuperarNacionalidadPorCodigo(String codigo) {
		Connection dbConnection = null;
		
		// Diferencia 1: PreparedStatement, con parámetros
		PreparedStatement statement = null;

		// Diferencia 2: Los parámetros se ponen en el query con ?
		String query = "SELECT * FROM nacionalidad where codigo = ?";
		
		// Diferencia 3: No se devuelve una lista! sólo un objeto
		//List<Nacionalidad> nacionalidades = new ArrayList<Nacionalidad>();
		
		try {
			dbConnection = getDBConnection();
			// Diferencia 4: método "prepareStatement"
			statement = dbConnection.prepareStatement(query);
			// Diferencia 5: asignar el parámetro por tipo e índice
			statement.setString(1, codigo);
			ResultSet rs = statement.executeQuery(query);
			
			// Diferencia 6: No iterar! sólo un registro
			if (rs.next()) {
				Nacionalidad nacionalidad = new Nacionalidad();
				
				nacionalidad.setCodigo(rs.getString(1));
				nacionalidad.setDescripcion(rs.getString(2));
				
				// Se devuelve el objeto nacionalidad obtenido (igual pasa por el finally)
				return nacionalidad;
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (dbConnection != null) {
					dbConnection.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		// Si no hay registros o dio error, se devuelve null
		return null;
	}
	
	public List<Nacionalidad> recuperarNacionalidades() {
		Connection dbConnection = null;
		Statement statement = null;

		String query = "SELECT * FROM nacionalidad";
		List<Nacionalidad> nacionalidades = new ArrayList<Nacionalidad>();
		
		try {
			dbConnection = getDBConnection();
			ResultSet rs = dbConnection.createStatement().executeQuery(query);
			while (rs.next()) {
				Nacionalidad nacionalidad = new Nacionalidad();
				
				nacionalidad.setCodigo(rs.getString(1));
				nacionalidad.setDescripcion(rs.getString(2));
				
				nacionalidades.add(nacionalidad);
			}			
		}

		catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
	 
				if (dbConnection != null) {
					dbConnection.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		return nacionalidades;

	}
 
	private static Connection getDBConnection() {
 
		Connection dbConnection = null;
 
		try {
 
			Class.forName(DB_DRIVER);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		try {
 
			dbConnection = DriverManager.getConnection(
                            DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}
	
	
	
}
