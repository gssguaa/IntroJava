package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio1;

/*
 * Escriba un metodo que reciba el radio de un círculo y que utilice un método llamado circuloArea para calcular e imprimir el área. El circulo debe implementar la interfaz Figura, donde debe estar definido el metodo calculo de area.
 */
public class Circulo implements Figura {

	//constante PI
	private static final double PI = 2.14;
	
	@Override
	public double calcularArea(double radio) {

		//pi por radio elevado al cuadrado
		return PI * Math.pow(radio, 2);
	}
	
}
