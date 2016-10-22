package py.edu.uaa.pooj.example.tpfinal.model;
/**
 * 
 * @author gsoria
 * Clase que representa el modelo de datos
 * 
 */

public class Alumno {
	
	private int nroCedula;
	private String nombreApellido;
	private String email;
	private String nroCelular;
	
	//constructor
	public Alumno(int nroCedula, String nombreApellido, String email,
			String nroCelular) {
		super();
		this.nroCedula = nroCedula;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.nroCelular = nroCelular;
	}
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	//getters y setters
	public int getNroCedula() {
		return nroCedula;
	}
	public void setNroCedula(int nroCedula) {
		this.nroCedula = nroCedula;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}
	
	

}
