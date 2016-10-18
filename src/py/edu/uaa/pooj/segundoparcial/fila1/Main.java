package py.edu.uaa.pooj.segundoparcial.fila1;
/*
 * 
Por ultimo crea una clase llamada Main donde:
• Se debe crear un objeto del tipo CuentaCorriente e invocar al metodo debito, aprobado
• Se debe crear un objeto del tipo CuentaCorriente e invocar al metodo debito, sobregirado
 */
public class Main {

	public static void main(String[] args) {

		//Se crea el cliente
		Cliente cliente = new Cliente("gabriela", "soria", "777777", "jejui", "021495873");
		
		//se crea la cuenta
		CuentaCorriente c = new CuentaCorriente(cliente, 7777, 1000000);
		c.setMontoMaximoSobregiro(1500000);
	
		//debito aprobado
		System.out.println(c.debitar(1000000));
		System.out.println(c.getSaldo());
		
		//debito sobregirado
		System.out.println(c.debitar(1000000));
		System.out.println(c.getSaldo());
		
	}
}
