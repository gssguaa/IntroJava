package py.edu.uaa.pooj.example.tpfinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import py.edu.uaa.pooj.example.tpfinal.model.Alumno;
import py.edu.uaa.pooj.example.tpfinal.model.Curso;
import py.edu.uaa.pooj.example.tpfinal.model.Nacionalidad;

/**
 * 
 * @author gsoria
 * Clase que maneja el acceso a la base de datos
 * Referencia: https://es.wikipedia.org/wiki/Data_Access_Object
 * 
 */

public class AlumnoDao {

	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/practica";
	private static final String DB_USER = "gsoria";
	private static final String DB_PASSWORD = "postgres";
	private NacionalidadDao nacionalidadDao = new NacionalidadDao();
	
	/**
	 * Metodo que permite validar si un alumno esta registrado en un determinado curso
	 * 
	 * @param alumno, alumno que quiere registrar su practica
	 * @param curso, curso sobre el que quiere registrar las horas de practica
	 * @return boolean, si es true es porque si esta registrado en el curso, si es false no está registrado en el curso
	 * @throws SQLException
	 */
	public static boolean validarSiAlumnoEstaEnCurso(Alumno alumno, Curso curso) throws SQLException{
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
 
		String selectSQL = "select * from alumno_curso where nro_cedula = ? and nro_curso = ? ";

		
		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(selectSQL);
 
			//se pasan como parametro los valores de nro de cedula (obtenido de alumno) y nro de curso (obtenido de curso), para
			//consultar en la tabla que tiene las relaciones de cuales son los cursos a los que esta inscripto un alumno
			
			preparedStatement.setInt(1, alumno.getNroCedula());
			preparedStatement.setInt(2, curso.getNroCurso());

			// execute insert SQL stetement
			ResultSet rs = 	preparedStatement.executeQuery();
			if (rs.next()) {
				System.out.println("Alumno está en matriculado en el curso");
				return true;
			} else {
				System.out.println("Alumno NO está en matriculado en el curso");
				return false;
			}
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
			return false;
			
 
		} finally {
 
			if (preparedStatement != null) {
				preparedStatement.close();
			}
 
			if (dbConnection != null) {
				dbConnection.close();
			}
 
		}
		
	}
 
	public boolean insertarAlumno(Alumno alumno) throws SQLException {
 
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		/*
		String insertTableSQL = "INSERT INTO alumno"
				+ "(nro_cedula, nombre_apellido, email, nro_celular) VALUES"
				+ "(?,?,?,?)";
		*/
		String insertTableSQL = "INSERT INTO alumno"
				+ "(nro_cedula, nombre_apellido, email, nro_celular, codigo_nacionalidad) VALUES"
				+ "(?,?,?,?,?)";
 
		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
 
			//del alumno que se recibe como parametro se obtienen 
			//las propiedades que se tienen que insertar en la base de datos
			
			preparedStatement.setInt(1, alumno.getNroCedula());
			preparedStatement.setString(2, alumno.getNombreApellido());
			preparedStatement.setString(3, alumno.getEmail());
			preparedStatement.setString(4, alumno.getNroCelular());
			
			if (alumno.getNacionalidad() != null) {
				// Grabar el c�digo de la nacionalidad del alumno
				preparedStatement.setString(5, alumno.getNacionalidad().getCodigo());
			} else {
				// Grabar null como nacionalidad
				preparedStatement.setNull(5, Types.CHAR);
			}
 
			// execute insert SQL stetement
			preparedStatement.executeUpdate();
		
			System.out.println("Record is inserted into ALUMNO table!");
			return true;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
			return false;
			
 
		} finally {
 
			if (preparedStatement != null) {
				preparedStatement.close();
			}
 
			if (dbConnection != null) {
				dbConnection.close();
			}
 
		}
 
	}

	public List<Alumno> recuperarAlumnos() {
		Connection dbConnection = null;
		Statement statement = null;

		String query = "SELECT * FROM alumno";
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			dbConnection = getDBConnection();
			ResultSet rs = dbConnection.createStatement().executeQuery(query);
			while (rs.next()) {
				Alumno alumno = new Alumno();
				
				alumno.setNroCedula(rs.getInt(1));
				alumno.setNombreApellido(rs.getString(2));
				alumno.setEmail(rs.getString(3));
				alumno.setNroCelular(rs.getString(4));
				
				// Agregado! obtener la nacionalidad, usando el NacionalidadDao
				String codigoNacionalidad = rs.getString(5);
				if (codigoNacionalidad != null) {
					Nacionalidad nacionalidad = this.nacionalidadDao.recuperarNacionalidadPorCodigo(codigoNacionalidad);
					alumno.setNacionalidad(nacionalidad);
				}
				
				alumnos.add(alumno);
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
		
		return alumnos;

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
