package py.edu.uaa.pooj.actividad1;

import java.util.Date;
import java.util.List;

public class Suscripcion {
	private Integer numero;
	private Date fechaVencimiento;
	private Integer precio;
	private List<Revista> revistas;
	private Persona cliente;
	private Persona destinatario;

	public Suscripcion() {

	}
	
	public void agregarSuscripcion(){
		
	}
	public void cambiarPrecio(){
		
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public List<Revista> getRevistas() {
		return revistas;
	}

	public void setRevistas(List<Revista> revistas) {
		this.revistas = revistas;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Persona getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

}
