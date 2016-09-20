package py.edu.uaa.pooj.operadores.test.soluciones;

public class OperacionesMatematicas {

	// PRACTICA
	public static int encontrarMinimo(int [] numeros) {
		// Encontrar el valor minimo de un array de enteros
		int minimo=numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < minimo ){
				minimo = numeros[i];
			}
		}
		return minimo;
	}

	// PRACTICA
	public int encontrarMaximo(int [] numeros) {
		// Encontrar el valor maximo de un array de enteros
		int maximo=numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo ){
				maximo = numeros[i];
			}
		}
		return maximo;	}

	// PRACTICA
	public int[] filtrarImpares(int [] numeros) {
		/**
		 * 
		 * En base a un array de enteros recibidos como parametros, 
		 * filtrar solamente los numeros impares
		 */
	
		int impares[] = new int[numeros.length];
		int indiceImpares=0;
		for (int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			if( (numero%2) != 0 ){
				impares[indiceImpares] = numero;
				indiceImpares++;
			}
		}
		
		return impares;
	}
	
	public static void main(String[] args) {
		
		int[] arrayEnteros = { 13, 20, 17, 40, 50 };
		
		OperacionesMatematicas op = new OperacionesMatematicas();
		System.out.println("Maximo " +  op.encontrarMaximo(arrayEnteros));
		System.out.println("Minimo " +  op.encontrarMinimo(arrayEnteros));
		
		int[] resultado = op.filtrarImpares(arrayEnteros);
		for (int i = 0; i < resultado.length; i++) {
			System.out.println("Impares = " + resultado[i]);
		}

	}

}
