package it.begear.esercizi.lezione2;

/**
 * ESERCIZIO 16 - Dati in ingresso tre numeri, determinare se sono tutti uguali, uno diverso o tutti diversi.
 * @author Pasquale
 *
 */
public class Esercizio16 {
	
	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 3;
		int n3 = 5;
		
		controllaNum(n1, n2, n3);
		
	}

	public static void controllaNum(int num1, int num2, int num3) {
		if(num1 != num2 && num1 != num3) {
			System.out.println("I numeri sono tutti diversi!");
		} else if(num1 == num2 && num1 == num3) {
			System.out.println("I numeri sono tutti uguali!");
		} else {
			System.out.println("Almeno un numero è diverso dagli altri!");
		}
	}
}
