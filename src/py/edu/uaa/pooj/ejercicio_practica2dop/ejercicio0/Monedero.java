package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio0;
/**
 * Clase que implementa los metodos definidos en la interfaz Imonedero
 * @author gsoria
 * Defina una clase 'Monedero' que implemente esta interfaz y que permita gestionar la cantidad de dinero de que una persona dispone en un momento dado.
La clase deberá permitir crear un monedero con una cantidad de dinero inicial, y si no se indica ninguna, la cantidad inicial de dinero es cero.
Comportamiento de la clase:
meter dinero en el monedero
Sacar dinero del monedero
consultar el dinero disponible (solo podrá conocerse la cantidad de dinero del monedero a través de este último método). 
Controles:
No se podrá sacar más dinero del que haya en un momento dado en el monedero. Si se intenta hacer esto, emitir un mensaje de error.
Para probar el funcionamiento de la clase, escriba un método 'main' con una serie de instrucciones que hagan uso de los métodos definidos.
 *
 */
public class Monedero implements IMonedero{

	private int dineroDisponible = 0;

	@Override //<--- esto significa que se esta implementando el metodo que obliga la clase padre
	public void meterDinero(int dinero) {
		this.dineroDisponible=this.dineroDisponible+dinero;
	}

	@Override
	public void sacarDinero(int dinero) {
		//evalua si tiene suficiente dinero, con respecto al que quiere sacar, en caso afirmativo 
		//resta el dinero solicitado del dinero disponible, en caso contrario emite un mensaje chistoso 
		if(this.dineroDisponible>=dinero){
			this.dineroDisponible=this.dineroDisponible-dinero;
		}else{
			System.out.println("Sos un sogue ;) ");
		}	
	}

	@Override
	public String consultarDineroDisponible() {
		return "Dinero disponible= "+dineroDisponible;
	}
	
	//constructor
	public Monedero(int valorInicialDinero){
		//se crea el monedero con el valor inicial ingresado en el constructor
		this.dineroDisponible=valorInicialDinero;
	}
	public static void main(String[] args) {
		Monedero monederito = new Monedero(1000);
		monederito.meterDinero(500);
		monederito.sacarDinero(100);
		monederito.sacarDinero(150);
		System.out.println(monederito.consultarDineroDisponible());
	}
	


}
