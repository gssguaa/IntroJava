package py.edu.uaa.pooj.segundoparcial.fila2;

public class Cliente {

	//atributos de cliente
	private String nombre;
	private String apellido;
	private String nroCedula;
	private String direccion;
	private String telefono;
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNroCedula() {
		return nroCedula;
	}
	public void setNroCedula(String nroCedula) {
		this.nroCedula = nroCedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//constructor con todos los atributos de la clase
	public Cliente(String nombre, String apellido, String nroCedula,
			String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroCedula = nroCedula;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
}
