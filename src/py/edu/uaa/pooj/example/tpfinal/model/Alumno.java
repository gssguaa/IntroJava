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
	private Nacionalidad nacionalidad;
	
	//constructor
	public Alumno(int nroCedula, String nombreApellido, String email,
			String nroCelular, Nacionalidad nacionalidad) {
		super();
		this.nroCedula = nroCedula;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.nroCelular = nroCelular;
		this.nacionalidad = nacionalidad;
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
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	

	@Override
	public String toString() {
		return "Alumno [nroCedula=" + nroCedula + ", nombreApellido="
				+ nombreApellido + ", email=" + email + ", nroCelular="
				+ nroCelular + "]";
	}
}
