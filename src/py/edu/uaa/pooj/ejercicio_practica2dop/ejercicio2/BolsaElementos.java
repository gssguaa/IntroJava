package py.edu.uaa.pooj.ejercicio_practica2dop.ejercicio2;

public class BolsaElementos extends Bolsa implements TrabajaElementos{


	public BolsaElementos(Elemento[] arrayTemp) {
		super(arrayTemp);
	}

	@Override
	public void agregarElemento(Elemento elemento) {
		//se obtiene el vector de elementos
		Elemento[] ve = this.getVe();
		
		//se obtiene la cantidad
		int cant = this.getVe().length;
		cant++;
		
		Elemento[] newVE = new Elemento[cant];
		
		for (int i = 0; i < ve.length; i++) {
			Elemento e = ve[i];
			newVE[i] = e;
		}
		newVE[cant] = elemento;
		this.setVe(newVE);
	}
	
	@Override
	public void retirarElemento(Elemento elemento) {
		// TODO 
		// Recorrer el vector de elementos de la bolsa y si elemento.esIgual al
		//ingresado como parametro, borrar
		//se puede optimizar haciendo que 
		
	}
	@Override
	public boolean esVacio(Elemento elemento) {
		if (this.getCantidadElementos()==0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Bolsa unirBolsas(Bolsa b1, Bolsa b2) {
		//saber de cuantas posiciones tenemos que crear el array
		int i = b1.getCantidadElementos()+ b2.getCantidadElementos();
		Elemento[] arrayTemp = new Elemento[i];
		Elemento[] e1 = b1.getVe();
		Elemento[] e2 = b2.getVe();
		int posicion = -1;
		
		//se recorre la primera bolsa, y se carga en el array temporal
		for (int j = 0; j < e1.length; j++) {
			arrayTemp[j] = e1[j];
			posicion++;
		} 
			
		//se recorre la segunda bolsa, y se carga en el array temporal
		for (int j = 0; j < e2.length; j++) {
			arrayTemp[posicion] = e2[j];
			posicion++;
		} 
		
		Bolsa b3 = new BolsaElementos(arrayTemp);
		return b3;
	}
	
	
}
