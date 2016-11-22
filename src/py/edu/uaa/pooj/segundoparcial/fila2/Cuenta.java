package py.edu.uaa.pooj.segundoparcial.fila2;
/*
 * Crea una clase llamada Cuenta que implemente la interfaz ICuenta y que tenga como atributos un Cliente (con datos:
nombre, apellido, nroCedula, direccion, telefono), ademas de un nroCuenta de 9 digitos (validar en el setter), y un saldo.
Se deben implementar todos los métodos que obliga la interfaz, con la lógica que se describe mas arriba.
En el metodo debitar, se debe validar si se tiene suficiente saldo para realizar la operación, en caso afirmativo resta del saldo de
la cuenta el importe a debitar y retona “APROBADO”. En caso de que no disponga del correspondiente saldo retona
“RECHAZADO”.
En el metodo acreditar, se debe sumar el importe recibido como parámetro al saldo de la cuenta, y retornar el String “Nuevo
saldo + <Valor Saldo>”
 */
 
public class Cuenta implements ICuenta {

	private Cliente cliente;
	private int nroCuenta;
	private int saldo;

	@Override
	public String debitar(int importe) {

		if (importe > saldo) {
			return "RECHAZADO";
		}else{
			saldo = saldo - importe;
			return "APROBADO";
		}
	}

	@Override
	public String acreditar(int importe) {
		int nuevoSaldo = this.getSaldo() + importe;
		this.setSaldo(nuevoSaldo);
		return "Nuevo saldo = " + nuevoSaldo; 	}

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
		Integer nroCuentaL = new Integer(nroCuenta);
		if (nroCuentaL.toString().length() != 9){
			this.nroCuenta = nroCuenta;			
		} else {
			System.out.println("El nro de cuenta debe tener 9 digitos");
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	

	
}
