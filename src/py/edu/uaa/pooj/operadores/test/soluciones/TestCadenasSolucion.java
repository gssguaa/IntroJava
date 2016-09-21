package py.edu.uaa.pooj.operadores.test.soluciones;

import py.edu.uaa.pooj.operadores.test.TestCadenas;

public class TestCadenasSolucion {
	
	private TestCadenas testCadenas;
	
	public TestCadenasSolucion() { 
		//se crea una nueva instancia de test cadenas cada vez que se cree un objeto TestCadenasSolucion
		testCadenas = new TestCadenas();
	}
	
	public void probarMetodosTestCadenas(){
		String resultado;
		
		//concatenacion
		resultado = testCadenas.concatenar("Hola ", "Que tal?");
		System.out.println("concatenar = " + resultado);
		
		//convertir minusculas
		resultado= testCadenas.convertirMinusculas("ESTO DEBERIA SER UN GRITO");
		System.out.println("convertir minusculas = " + resultado );
		
		//convertir mayusculas
		resultado=testCadenas.convertirMayusculas("ESTO SI ES UN GRITO");
		System.out.println("convertir mayusculas = " + resultado );
		
		//palabras mas largas del idioma espanol
		//http://www.lainformacion.com/interes-humano/curiosidades/conozca-las-10-palabras-mas-largas-del-idioma-espanol_erutrOnUuHHtu90A11dsR1/
		int longitud=testCadenas.obtenerLongitudCadena("Electroencefalografista");
		System.out.println("longitud de cadena= " + longitud);
		
		//comparar diferenciando may y min
		boolean iguales = testCadenas.compararCadenaDiferenciandoMayusculas("Gabriela", "gabriela");
		System.out.println("DIF.cadenas iguales? 'Gabriela' 'gabriela' " + iguales);

		//comparar diferenciando may y min
		iguales = testCadenas.compararCadenaDiferenciandoMayusculas("Gabriela", "Gabriela");
		System.out.println("DIF.cadenas iguales? 'Gabriela' 'Gabriela' " + iguales);
		
		//comparar sin diferenciar may y min
		iguales = testCadenas.compararCadenaSinDiferenciarMayusculasYMinusculas("Gabriela", "gabriela");
		System.out.println("NO DIF. cadenas iguales? 'Gabriela' 'gabriela' " + iguales);
		
		//division de cadenas
		String [] componentes = testCadenas.divisionCadenas("Juan;Perez;85");
		for (int i = 0; i < componentes.length; i++) {
			System.out.println("Array en posicion " +i + " = " + componentes[i]);
		}
		
		//subcadena
		resultado = testCadenas.subcadena("Matias", 0, 3);
		System.out.println("Substring Matias 0,3 = " + resultado);
		
		char res = testCadenas.obtenerCaracterCadena("Perez", 0);
		System.out.println("Obtener primer caracter de apellido Perez = " + res);
		
		
		//verificacion si comienza con
		boolean verificacion;
		verificacion = testCadenas.verificarSiComienzaCon("Soria", "So");
		System.out.println("Verificar si comienza con 'Soria' 'So' = " + verificacion);
		
		//verificacion si termina con
		verificacion = testCadenas.verificarSiTerminaCon("Universidad", "ad");
		System.out.println("Verificar si termina con 'Universidad' 'ad' = " + verificacion);
		
		//verificacion si contiene
		verificacion = testCadenas.verificarSiContiene("Electroencefalografista", "enscefalo");
		System.out.println("Verificar si 'Electroencefalografista' contiene 'enscefalo' = " + verificacion);
		
		//obtencion de indice de subcadena
		int indiceSubCadena = testCadenas.obtenerIndiceSubcadena("Electroencefalografista", "encefalo");
		System.out.println("Indice subcadena 'Electroencefalografista' 'encefalo' = " + indiceSubCadena);
		
		
	}
	
	public static void main(String[] args) {
		TestCadenasSolucion tcs = new TestCadenasSolucion();
		tcs.probarMetodosTestCadenas();
	}

}
