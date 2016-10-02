package py.edu.uaa.pooj.ejerciciomonedero;

public interface IMonedero {
	
	//la interfaz solamente define comportamiento
	//los metodos que estan en la interfaz no tienen cuerpo
	
	public void meterDinero(int dinero);
	public void sacarDinero(int dinero);
	public String consultarDineroDisponible();
	

}
