package Ejercicios17;

public class NumerosPares30 {
	
	public static void main (String [] args) {

	int numero = 30;
	System.out.println("LOS NUMEROS PARES DEL 1 AL 30 SON: ");
	for (int i = 1; i <= numero; i++) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
	}
	}
}
