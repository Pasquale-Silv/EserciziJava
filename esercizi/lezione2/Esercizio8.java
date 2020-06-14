package it.begear.esercizi.lezione2;

import java.util.Arrays;

/**
 * ESERCIZIO 8 - Costruire un array di interi, ordinarlo e stampare tutti gli elementi
 * @author Pasquale
 *
 */
public class Esercizio8 {
	
	public static void main(String[] args) {
		int[] arrayInteri = {10, 100, 0, 2, 1, 89, 55, 76, 34, 12};
		Arrays.sort(arrayInteri);
		
		for (int i = 0; i < arrayInteri.length; i++) {
			System.out.println(arrayInteri[i]);
		}
		
		System.out.println(Arrays.toString(arrayInteri));
	}

}
