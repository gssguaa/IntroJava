package py.edu.uaa.pooj.segundoparcial.fila2;

import py.edu.uaa.pooj.segundoparcial.fila2.Cliente;

/*
Por ultimo crea una clase llamada Main (que tenga el método main) donde:
- Se debe crear un objeto del tipo CuentaAhorro e invocar al metodo debito, condición aprobado
- Se debe crear un objeto del tipo CuentaAhorro e invocar al metodo debito, condición rechazado
Observación: Solamente se pide getters y setters de la clase Cuenta
 */
public class Main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("gabriela", "soria", "777777", "jejui", "021495873");
		CuentaAhorro cuenta = new CuentaAhorro();
		cuenta.setCliente(cliente);	
		cuenta.setNroCuenta(8888);
		cuenta.setSaldo(2000000);
		
		//condicion aprobado
		System.out.println(	cuenta.debitar(100000));
		System.out.println(cuenta.getSaldo());
		
		//condicion reclazado
		System.out.println(	cuenta.debitar(2000000));
		System.out.println(cuenta.getSaldo());
	}


}
