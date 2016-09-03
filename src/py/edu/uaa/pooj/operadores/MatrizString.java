package py.edu.uaa.pooj.operadores;

public class MatrizString {

	// Se declara una matriz de 10 * 10
	String arreglo[][] = new String[10][10];

	// IMPORTANTE: los arreglos en java comienzan en la posicion "0"
	public void cargarArray() {
		// para cargar se recorre la estructura con un for de 2 niveles
		// el primer for recorre filas
		for (int i = 0; i < 10; i++) {
			// el segundo for recorre columnas
			for (int j = 0; j < 10; j++) {
				arreglo[i][j] = "test";
				String s = new String();
				s.length();
			}
		}
	}

	public void mostrarArray() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("valor:" + arreglo[i][j] + i + j);
			}
		}

	}

	public static void main(String[] args) {
		MatrizString as = new MatrizString();
		as.cargarArray();
		as.mostrarArray();

	}
}