package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio0;

public class Main {
	public static void main(String[] args) {
		Monedero monederito = new Monedero(10000);
		monederito.meterDinero(1000);
		System.out.println(monederito.consultarDineroDisponible());
	}
}
