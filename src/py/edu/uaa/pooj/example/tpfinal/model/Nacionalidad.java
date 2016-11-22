package py.edu.uaa.pooj.example.tpfinal.model;

/**
 * 
 * @author gsoria
 * Clase que representa el modelo de datos
 * 
 */
public class Nacionalidad {
	
	private String codigo;
	private String descripcion;
	
	//constructor
	public Nacionalidad(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	public Nacionalidad() {
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Nacionalidad [codigo=" 
				+ codigo 
				+ ", descripcion=" 
				+ descripcion 
				+ "]";
	}
}
