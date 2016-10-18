package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio2;

/*
 * Crear la interfaz TrabajaElementos que especifica los métodos para:
-añadir un elemento
-retirar que saca un elemento
-esVacio  que verifica si la estructura esta vacía o no
 */
public interface TrabajaElementos {
	void agregarElemento(Elemento elemento);
	void retirarElemento(Elemento elemento);
	boolean esVacio(Elemento elemento);

}
