package py.edu.uaa.pooj.segundoparcial.fila1;
/*
 * Crea una clase CuentaCorriente que herede de Cuenta, que implemente todos los metodos abstractos que su clase padre
obligue. La clase CuentaCorriente tambien agrega un atributo que es montoMaximoSobregiro.
En el metodo debitar, se debe validar si se tiene suficiente saldo para realizar la operación, en caso afirmativo resta del saldo de
la cuenta el importe a debitar y retona “APROBADO”. En caso de que el monto a debitar sea superior al monto disponible en
cuenta, el debito se puede realizar igual, siempre que este dentro de los limites de montoMaximoSobregiro. En este caso se
devolvería un String “SOBREGIRADO”, y el saldo de la cuenta quedaría en negativo. En caso de que sea superior a
montoMaximoSobregiro se retornaría “RECHAZADO”.
En el metodo acreditar, se debe sumar el importe recibido como parámetro al saldo de la cuenta, y retornar el String “Nuevo
saldo + <Valor Saldo>”
 */

public class CuentaCorriente extends Cuenta {

	private int montoMaximoSobregiro;
	
	//constructor vacio
	public CuentaCorriente() {
	}
	
	//constructor
	public CuentaCorriente(Cliente cliente, int nroCuenta, int saldo) {
		//super = constructor de la clase padre, osea Cuenta
		super(cliente, nroCuenta, saldo);
	}

	@Override
	public String debitar(int importe) {
		//variable auxiliar saldoActual
		int saldoActual = this.getSaldo();
		if(importe > saldoActual){
			if (importe > montoMaximoSobregiro){
				return "REPROBADO";
			}else{
				this.setSaldo(saldoActual - importe);
				return "SOBREGIRADO";
			}
		}
		this.setSaldo(saldoActual - importe);
		return "APROBADO";
	}

	@Override
	public String acreditar(int importe) {
		int nuevoSaldo = this.getSaldo() + importe;
		this.setSaldo(nuevoSaldo);
		return "Nuevo saldo = " + nuevoSaldo; 
	}

	//getters and setters de atributos de CuentaCorriente
	public int getMontoMaximoSobregiro() {
		return montoMaximoSobregiro;
	}

	public void setMontoMaximoSobregiro(int montoMaximoSobregiro) {
		this.montoMaximoSobregiro = montoMaximoSobregiro;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [montoMaximoSobregiro=" + montoMaximoSobregiro
				+ ", getCliente()=" + getCliente() + ", getNroCuenta()="
				+ getNroCuenta() + ", getSaldo()=" + getSaldo() + "]";
	}	
	
	

}
