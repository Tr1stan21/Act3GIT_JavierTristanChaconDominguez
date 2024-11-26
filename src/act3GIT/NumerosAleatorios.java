package act3GIT;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {


    public static void main(String[] args) {
    	System.out.println("Números aleatorios: ");
        mostrarNumerosAleatorios();
        
        System.out.println("Incremento de 7 en 7: ");
        incremento();
    }

	public static void mostrarNumerosAleatorios() {
	    Random random = new Random();
	    
	    int valor;
	    
	    for (int i = 0; i < 20; i++) {
	   	 valor = random.nextInt(11);
	   	 System.out.println(valor);
	   }
	}
	
	public static void incremento() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca un número límite: ");
		int numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Introduzca el segundo número límite: ");
		int numero2 = Integer.parseInt(scanner.nextLine());
		System.out.println("Introduzca un tercer número: ");
		int numero3 = Integer.parseInt(scanner.nextLine());
		
		if (numero1 > numero2) {
			for (int i = numero2; i <= numero1; i+=7) {
				System.out.println(i);
			}
		}
		else if (numero2 > numero1) {
			for (int i = numero1; i <= numero2; i+=7) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("Los numeros límite introducidos son iguales");
		}
		if (((numero3 > numero1) && (numero3 < numero2)) || ((numero3 < numero1) && (numero3 > numero2))) {
			System.out.println(numero3);
		}
		
		scanner.close();
	}
	
}
