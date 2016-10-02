package py.edu.uaa.pooj.ejerciciomonedero;

public class Main {
	public static void main(String[] args) {
		Monedero monederito = new Monedero(10000);
		monederito.meterDinero(1000);
		System.out.println(monederito.consultarDineroDisponible());
	}
}
