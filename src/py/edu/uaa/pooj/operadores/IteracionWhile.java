package py.edu.uaa.pooj.operadores;

public class IteracionWhile {

	public void testWhile(){
		//Se inicializa la variable contador
		int contador = 0;
		
		//Imprimimos en consola que estamos iterando con while
		System.out.println("Iterando con while");

		//mientras el contador sea menor a 20
		while (contador<20) {
			//imprimimos el valor de la iteracion
			System.out.println("Iteracion: " + contador);			
			//Aqui hariamos lo que necesitaramos hacer 
			//incrementamos contador
			contador++;

		}
	}
	
	public static void main(String[] args) {
		IteracionWhile it = new IteracionWhile();
		it.testWhile();
	}//fin de main
}//fin de clase
