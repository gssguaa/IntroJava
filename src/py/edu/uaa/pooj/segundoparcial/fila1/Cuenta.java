package py.edu.uaa.pooj.segundoparcial.fila1;

/*
 * Crea una clase abstracta llamada Cuenta que tenga como atributos un Cliente (con datos: nombre, apellido, nroCedula,
direccion, telefono), ademas de un nroCuenta de 9 digitos (validar en el constructor), y un saldo. En dicha clase se debe
implementar los metodos abstractos debitar(recibe un importe y resta del saldo) y acreditar(recibe un importe y suma al
saldo). Se debe en la clase Cuenta crear un constructor que reciba los atributos de cliente, nroCuenta y saldo.
 */

public abstract class Cuenta {
	
	private Cliente cliente;
	private int nroCuenta;
	private int saldo;
	
	//se definen los metodos abstractos que tienen que implementar las 
	//clases que hereden de cuenta.
	
	/**
	 * Metodo que recibe un importe y debita del saldo de la cuenta
	 * @param importe a ser debitado de la cuenta
	 * @return mensaje que determina el estado de la operacion
	 */
	
	public abstract String debitar(int importe);
	
	/**
	 * Metodo que recibe un importe y acredita a la cuenta
	 * @param importe a ser acreditado
	 * @return nuevo saldo de la cuenta
	 */
	public abstract String acreditar(int importe);
	
	//constructor vacio
	public Cuenta(){
		
	}
	
	//constructor con todos los parametros de la clase (cliente, nroCuenta, saldo)
	public Cuenta(Cliente cliente, int nroCuenta, int saldo ){
		this.cliente=cliente;		
		this.nroCuenta=nroCuenta;
		this.saldo=saldo;
				
		Integer nroCuentaL = new Integer(nroCuenta);
		if (nroCuentaL.toString().length() >= 9) {
			this.nroCuenta = nroCuenta;
		}
				
	}

	//getters y setters
	public Cliente getCliente() {
		return cliente;		
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;		
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
