package py.edu.uaa.pooj.actividad1;

import java.util.Date;

public class Factura {
	
	//atributos
	private Integer nroFactura;
	private Date fechaEmision;
	private Persona cliente;
	private Integer precioTotal;
	private String timbrado;

	//constructor vacio
	public Factura() {

	}
	//metodo que implementa logica de negocio
	public void emitirFactura(){
		
	}
	//metodos de acceso getters y setters
	public Integer getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(Integer nroFactura) {
		this.nroFactura = nroFactura;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Integer getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Integer precioTotal) {
		this.precioTotal = precioTotal;
	}

	public String getTimbrado() {
		return timbrado;
	}

	public void setTimbrado(String timbrado) {
		this.timbrado = timbrado;
	}

}
