package py.edu.uaa.pooj.actividad1;

public class Persona {

	//atributos
	private String direccion;
	private String email;
	private String ruc;
	private String telefono;
	
	//constructor vacio
	public Persona(){
		
	}
	
	//metodo que implementa logica de negocio
	public void registrarPersona(){
		
	}
	
	//metodos de acceso getters y setters
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
