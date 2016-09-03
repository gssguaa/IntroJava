//Esto es un comentario de una sola linea, comienza con "//", se usa para documentar dentro de codigo, esto
//no se incluye cuando se genera el javadoc

/**
 * Esto es un comentario de javadoc, comienza con "/**"
 */

/* Comentario multilinea, comienza con "/*"
 * se declara el paquete, es coincidente con la estructura de directorios generados 
 * dentro de la carpeta de proyecto en el workspace que hayamos seleccionado
 */

package py.edu.uaa.pooj.operadores.test;

//Declaracion de la clase
public class TestOperadores {

	/*
	 * metodo sumar, de modificador de acceso publico, retorna un entero y
	 * recibe como parametros dos numeros enteros
	 */
	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public int dividir(int dividendo, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		} else {
			return dividendo / divisor;
		}
	}

	/*
	 * Metodo main, metodo de entrada de toda aplicacion java Cuando queremos
	 * ejecutar un programa JAVA, la JVM buscara el metodo main sobre la clase
	 * que nosotros le pedimos ejecutar
	 */

	public static void main(String[] args) {
		// Se crea un nuevo OBJETO de la clase TestOperadores
		TestOperadores testOperadores = new TestOperadores();

		// Se imprime por consola el resultado de la invocacion del metodo sumar
		System.out.println("Sumar: " + testOperadores.sumar(7, 3));

		// Se imprime por consola el resultado de la invocacion del metodo
		// restar
		System.out.println("Restar: " + testOperadores.restar(25, 5));

		// Que pasa si restamos 5-25?
		System.out.println("Restar: " + testOperadores.restar(5, 25));

		// Se imprime por consola el resultado de la invocacion del metodo
		// multiplicar
		System.out.println("Multiplicar: " + testOperadores.multiplicar(5, 3));

		// Se imprime por consola el resultado de la invocacion del metodo
		// dividir
		System.out.println("Dividir: " + testOperadores.dividir(15, 3));

		// Que pasa si intentamos dividir por "0"?
		System.out.println("Dividir: " + testOperadores.dividir(15, 0));

	}

}
