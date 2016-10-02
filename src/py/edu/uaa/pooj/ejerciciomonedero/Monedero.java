package py.edu.uaa.pooj.ejerciciomonedero;
/**
 * Clase que implementa los metodos definidos en la interfaz Imonedero
 * @author gsoria
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
