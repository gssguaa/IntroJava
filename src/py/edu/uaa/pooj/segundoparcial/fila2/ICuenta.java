package py.edu.uaa.pooj.segundoparcial.fila2;

/*
 * Crea una interfaz ICuenta que defina el siguiente comportamiento común para todas las cuentas:
//recibe un importe y resta del saldo de la cuenta
debitar(int importe)
//recibe un importe y suma al saldo de la cuenta
acreditar(int importe)
*/


public interface ICuenta {

	public String debitar(int importe);
	public String acreditar(int importe);
	
}
