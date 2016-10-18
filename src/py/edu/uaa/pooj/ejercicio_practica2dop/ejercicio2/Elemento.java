package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio2;
/*
 * Ejercicio 2
Crear la clase Elemento que tiene un atributo (valor) de tipo entero. 
Tiene un método esIgual que recibe como parámetro otro elemento y retorna 
true si es que los valores son iguales.
 */
public class Elemento {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public boolean esIgual(Elemento elemento){
		if (this.valor == elemento.valor){
			return true;
		}else{
			return false;
		}
	}
}
