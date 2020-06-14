package it.begear.esercizi.lezione2;

/**
 * ESERCIZIO 3 - Inserire un intero 'dimensione array'. 
 * Creare un array e riempirlo di numeri incrementali da 0 in poi fino al dimensione array.
 * @author Pasquale
 *
 */
public class Esercizio3 {
	
	public static void main(String[] args) {
		int[] arr1 = new int[20];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		
		for (int elemento : arr1) {
			System.out.println(elemento);
		}
	}

}
