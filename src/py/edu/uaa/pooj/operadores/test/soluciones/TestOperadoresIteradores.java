package py.edu.uaa.pooj.operadores.test.soluciones;

public class TestOperadoresIteradores {
	/*
	 * Metodo que suma un array de enteros que recibe como parametro
	 * Retorna el resultado de la suma
	 */
	public int sumar(int[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado + numeros[i];
		}
		return resultado;
	}

	/*
	 * PRACTICA: implementar la resta recibiendo un array de enteros
	 */
	public int restar(int[] numeros) {
		int resultado = 0;
		
		if (numeros[0] >0){
			resultado = numeros[0];
		}

		//los arrays en java comienzan en cero (0)
		for (int i = 1; i < numeros.length; i++) {
			resultado = resultado - numeros[i];
		}
		return resultado;

	}

	/*
	 * PRACTICA: implementar la multiplicacion recibiendo un array de enteros
	 */
	public int multiplicar(int[] numeros) {
		//se inicializa en 1 porque cualquier numero multiplicado por cero es cero
		int resultado = 1;
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado * numeros[i];
		}
		return resultado;
	}


	public static void main(String[] args) {
		//Se crea un objeto de la clase TestOperadoresIteradores, llamado testOpIt
		TestOperadoresIteradores testOpIt = new TestOperadoresIteradores();
		
		//Se crea un array de enteros a ser sumados
		int[] numerosASumar = { 10, 20, 30, 40, 50 };
		
		/*Se imprime el resultado de la invocacion al metodo sumar de testOpIt habiendole
		 * pasado como parametro el array numerosASumar
		 */
		
		//Se crea un arreglo de enteros (array) 
		int[] numerosAMultiplicar = {10, 10, 10};

		//Se crea un arreglo de enteros (array) 
		int[] numerosARestar = {100, 10, 5};
		
		System.out.println("Resultado de la multiplicacion = " + testOpIt.sumar(numerosASumar));
		
		//Resolucion de los ejercicios de practica para primer parcial
		System.out.println("Resultado de la multiplicacion = " + testOpIt.multiplicar(numerosAMultiplicar));

		System.out.println("Resultado de la resta = " + testOpIt.restar(numerosARestar));

		
	}
}
