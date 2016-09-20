package py.edu.uaa.pooj.operadores.test.soluciones;

public class TestCadenasIteradores {

	/*
	 * metodo que concatena todas las palabras almacenadas en el array de String recibido
	 * como parametro, agregando un espacio en blanco despues de cada palabra
	 */
	
	public String concatenarCadenas(String[] arrayString){

		String resultado = "";
		for (int i = 0; i < arrayString.length; i++) {
			resultado = resultado + arrayString[i]; 
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		String [] palabrasAConcatenar = {"Este ", "texto ", "es ", "el ", "resultado ", "de ",
				"la ", "concatenacion ","de ", "palabras "};
		
		TestCadenasIteradores tci = new TestCadenasIteradores();
		String resultado = tci.concatenarCadenas(palabrasAConcatenar);
		
		System.out.println("Resultado de la concatenacion = " + resultado);
	}
}
