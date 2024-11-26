package act3GIT;

import java.util.Random;

public class NumerosAleatorios {
	
    public static void main(String[] args) {
    	System.out.println("Números aleatorios: ");
        mostrarNumerosAleatorios();
        
    }

	public static void mostrarNumerosAleatorios() {
	    Random random = new Random();
	    
	    int valor;
	    
	    for (int i = 0; i < 30; i++) {
	   	 valor = random.nextInt(11);
	   	 System.out.println(valor);
	   }
	}
	
}
