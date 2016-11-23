package py.edu.uaa.pooj.example.tpfinal.test;

import java.sql.SQLException;

import py.edu.uaa.pooj.example.tpfinal.dao.AlumnoDao;
import py.edu.uaa.pooj.example.tpfinal.model.Alumno;
import py.edu.uaa.pooj.example.tpfinal.model.Nacionalidad;

public class TestJDBC {

	public static void main(String[] args) {

		// Esto es lo que se tendria que hacer en la interfaz.
		// Tomar de ejemplo lo que se hace con el insert

		// Prueba de eliminar
		Alumno alumno = new Alumno();
		alumno.setEmail("soria.gaby@gmail.com");
		alumno.setNombreApellido("Gabriela S. Soria");
		alumno.setNroCedula(7713114);

		AlumnoDao dao = new AlumnoDao();
		//dao.eliminarAlumno(alumno);

		// Esto es lo que se tendria que hacer en la interfaz.
		// Tomar de ejemplo lo que se hace con el insert

		// Prueba de actualizar
		Alumno alumno2 = new Alumno();
		alumno2.setEmail("soria.gaby@gmail.com");
		alumno2.setNroCelular("099999999999");
		alumno2.setNroCedula(7713114);

		AlumnoDao dao2 = new AlumnoDao();
		dao2.actualizarAlumno(alumno2);
		
		//Prueba de insert con FK
		Nacionalidad nac = new Nacionalidad();
		nac.setCodigo("ch");
		nac.setDescripcion("chinese");
		
		Alumno alumno3 = new Alumno();
		alumno3.setNombreApellido("Jackie Chan");
		alumno3.setEmail("jc@gmail.com");
		alumno3.setNroCelular("0981234567");
		alumno3.setNroCedula(918411);
		alumno3.setNacionalidad(nac);
		
		AlumnoDao dao3 = new AlumnoDao();
		try { 
			dao3.insertarAlumno(alumno3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
