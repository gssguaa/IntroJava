package py.edu.uaa.pooj.segundoparcial.fila1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrrienteTest {

	//TODO debitarAprobado
	@Test
	public void debitarAprobado() {
		fail("Not yet implemented");
	}

	//TODO debitarRechazado
	@Test
	public void debitarRechazado() {
		fail("Not yet implemented");
	}

	//TODO acreditar
	@Test
	public void acreditar() {
		//Se crea el cliente
		Cliente cliente = new Cliente("gabriela", "soria", "777777", "jejui", "021495873");
		//se crea la cuenta
		CuentaCorriente c = new CuentaCorriente(cliente, 7777, 1000000);
		c.setMontoMaximoSobregiro(1500000);
		c.acreditar(100000);
		
		Assert.assertEquals(1100000, c.getSaldo());
	}
}
