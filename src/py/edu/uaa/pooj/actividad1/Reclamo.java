package py.edu.uaa.pooj.actividad1;

import java.util.Date;

public class Reclamo {
	private Persona cliente;
	private Date fechaHora;
	private String nota;
	private Reclamo reclamoAnterior;
	private Suscripcion suscripcion;

	public Reclamo() {

	}

	public void realizarReclamo(){
		
	}
	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Reclamo getReclamoAnterior() {
		return reclamoAnterior;
	}

	public void setReclamoAnterior(Reclamo reclamoAnterior) {
		this.reclamoAnterior = reclamoAnterior;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

}
