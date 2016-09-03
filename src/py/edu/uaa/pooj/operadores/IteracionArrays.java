package py.edu.uaa.pooj.operadores;

public class IteracionArrays {

	public void testIteracionArraysEnteros() {
		// Iteracion de un array (coleccion de enteros)
		System.out.println("\nIteracion de un array (coleccion de enteros)\n");

		// se declara el array, indicando el tipo de dato, los simbolos "[]" y
		// el nombre del array

		int[] vNumeros = { 10, 20, 30, 40, 50 };

		/*
		 * otra forma de escribir el bucle for: Para cada elemento del tipo int
		 * que se encuentre dentro de la colección vNumeros ejecuta las
		 * instrucciones que se indican
		 */

		for (int num : vNumeros) {
			System.out.print(num);
			System.out.print("\t");
		}
		System.out.print("\n");

	}

	public void testIteracionArraysString() {
		// Iteracion de un array (coleccion de String)
		System.out.println("\nIteracion de un array (coleccion de String)\n");
		String[] vNombres = { "Juan", "Lorena", "Jose", "Patricia" };
		for (String nombre : vNombres) {
			System.out.print(nombre);
			System.out.print("\n");
		}

	}
	
	public static void main(String[] args) {
		IteracionArrays it = new IteracionArrays();
		//Prueba de Iteracion de Array de Enteros
		it.testIteracionArraysEnteros();
		
		//Prueba de Iteracion de Array de Enteros
		it.testIteracionArraysString();
	}

}
