package py.edu.uaa.pooj.operadores;

public class IteracionFor {

	public void testIteracionFor(){
		// Iteracion con for
		System.out.println("Iteracion de dos niveles");
		
		/*
		 * Desde {valor inicial};{condición de termino};{factor de incremento del valor inicial}
		 */
		for (int i=0; i<10;i++) {
			for (int j=0; j<5; j++) {
				System.out.print(i);
				System.out.print(":");
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		IteracionFor it = new IteracionFor();
		it.testIteracionFor();
	}
}
