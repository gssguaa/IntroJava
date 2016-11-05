package py.edu.uaa.pooj.example.tpfinal.dao;

import java.util.List;

import py.edu.uaa.pooj.example.tpfinal.model.Alumno;

public class Main {
	
	
	public static void main(String[] args) {
		AlumnoDao alumnoDao = new AlumnoDao();
		List<Alumno> alumnos = alumnoDao.recuperarAlumnos();
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}
		
	}

}
