package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio2;
/**
 * 
 * @author gsoria
 * Bolsa: Colección de Elementos no ordenados que pueden estar repetidos.
 */

/*
 * Ejercicio 2.1
Bolsa: Colección de elementos no ordenados que pueden estar repetidos.
Crear una clase abstracta para representar una Bolsa, y crear las siguientes operaciones: CrearBolsa( Constructor)
dentro que verifica si un elemento pertenece a la bolsa
cuantos que determina el numero de veces que un elemento se encuentra en la Bolsa
unión  que a partir de 2 bolsas devuelve una bolsa con los elementos de las dos bolsas 
total que devuelve el numero de elementos en la bolsa
 */
public abstract class Bolsa {
	private int cantidadElementos;
	private Elemento[] ve;
	
	//constructor vacio
	Bolsa() {

	}

	//constructor con un array de Elementos
	Bolsa(Elemento[] vectorEntrada) {
		this.ve=vectorEntrada;
	}
	
	public int contarElementoEnBolsa(){
		return this.ve.length;
	}
	
	public abstract Bolsa unirBolsas(Bolsa b1, Bolsa b2);
	
	public int contarElementosBolsa(){
		return this.getCantidadElementos();
	}

	public int getCantidadElementos() {
		return cantidadElementos;
	}

	public void setCantidadElementos(int cantidadElementos) {
		this.cantidadElementos = cantidadElementos;
	}

	public Elemento[] getVe() {
		return ve;
	}

	public void setVe(Elemento[] ve) {
		this.ve = ve;
	}
	
}
