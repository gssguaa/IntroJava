package py.edu.uaa.pooj.primerparcial.fila1;

public class CalculoUtil {
	
	public int calcularPromedio(int [] numeros){
		int sumatoria=0;
		int promedio=0;
		for (int i = 0; i < numeros.length; i++) {
			sumatoria = sumatoria + numeros[i];
		}
		
		promedio = sumatoria /numeros.length;
		return promedio;
		
	}
	
	public static void main(String[] args) {
		CalculoUtil cu = new CalculoUtil();
		int[] numerosACalcularPromedio = {80, 60, 100};
		int resultado = cu.calcularPromedio(numerosACalcularPromedio);
		
		System.out.println("Calculo del promedio de 80,60,100 = " + resultado);
	}

}
