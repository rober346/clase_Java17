package Ejercicios17;

public class Suma100 {
	
	public static void main (String [] args) {
		
		int numero = 100;
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		System.out.println("La suma de los primeros " + numero + " numeros naturales es: " + suma);
	}
}
