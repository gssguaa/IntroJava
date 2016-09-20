package py.edu.uaa.pooj.primerparcial.fila2;

public class LlamadorBox {
	
	public void generarMensajeCartel(int [] numeros){
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>0 && numeros[i]<=9){
				System.out.println("<-- Box " + numeros[i] );
			}else if(numeros[i]>=10 && numeros[i]<=20){
				System.out.println("--> Box " + numeros[i]);
			}	
		}	
	}
	
	public static void main(String[] args) {
		LlamadorBox llamadorBox = new LlamadorBox();
		
		int [] numerosCartel = {3,15,4,20};
		llamadorBox.generarMensajeCartel(numerosCartel);
		
	}

}
