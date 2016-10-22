package py.edu.uaa.pooj.segundoparcial.fila1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrrienteTest {

	//TODO debitarAprobado
	//crear en este metodo el cliente, la cuenta corriente con los datos correspondientes
	//de manera a que retorne el String "APROBADO"
	//Validar que el string de retorno sea como se espera (Assert)
	@Test
	public void debitarAprobado() {
	}

	//TODO debitarRechazado
	//crear en este metodo el cliente, la cuenta corriente con los datos correspondientes
	//de manera a que retorne el String "RECHAZADO"
	//Validar que el string de retorno sea como se espera (Assert)
	@Test
	public void debitarRechazado() {
	}

	//TODO debitarSobregirado
	//crear en este metodo el cliente, la cuenta corriente con los datos correspondientes
	//de manera a que retorne el String "SOBREGIRADO"
	//Validar que el string de retorno sea como se espera (Assert)
	@Test
	public void debitarSobregirado() {
	}

	
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
