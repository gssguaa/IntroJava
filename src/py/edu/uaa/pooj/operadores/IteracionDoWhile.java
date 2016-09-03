package py.edu.uaa.pooj.operadores;

public class IteracionDoWhile {

	public void testDoWhile() {

		/*
		 * Iterando con "do ... while" a diferencia de "while", la evaluacion de
		 * la condicion ocurre al final, con lo que al menos se realizara una
		 * iteracion
		 */
		int contador = 0;
		System.out.println("Iterando con do... while");
		do {
			System.out.println("iterando: " + contador);
			contador++;

			// podemos necesitar realizar alguna evaluacion en la iteracion que
			// se esta realizando
			if (contador == 15) {
				System.out.println("continuando en: " + contador);
				continue; // salta al while para evaluar
			}
			if (contador == 39) {
				System.out.println("abandonando en: " + contador);
				break; // sale abruptamente del bucle.
			}
		} while (contador < 40);
	}
	
	public static void main(String[] args) {
		IteracionDoWhile it = new IteracionDoWhile();
		it.testDoWhile();
	}
}
