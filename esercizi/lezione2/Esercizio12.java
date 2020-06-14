package it.begear.esercizi.lezione2;

import java.util.Arrays;
import java.util.Random;

/**
 * ESERCIZIO 12 - Dati in ingresso 4 numeri casuali da 0 a 10 determina se ce ne sono di uguali, 
 *                poi restituisce prima il più grande poi il più piccolo.
 * @author Pasquale
 *
 */
public class Esercizio12 {
	
	public static void main(String[] args) {
		
		int[] numeriCasuali = generaNumeriCasuali(4);
		
		System.out.println(Arrays.toString(numeriCasuali));
		
		controllaUguali(numeriCasuali);
		
		scopriMaxEmin(numeriCasuali);
	}
	
	static int[] generaNumeriCasuali(int quantiNumeri) {
		Random r = new Random();
		int[] numeriCasuali = new int[quantiNumeri];
		for (int i = 0; i < numeriCasuali.length; i++) {
			numeriCasuali[i] = r.nextInt(11);
		}
		return numeriCasuali;
	}
	
	static void controllaUguali(int[] numeriCas) {
		int numeriUguali = 0;
		for (int i = 0; i < numeriCas.length; i++) {
			for (int j = 0; j < numeriCas.length; j++) {
				if(i == j) {
					continue;
				} else {
					if(numeriCas[i] == numeriCas[j]) {
						numeriUguali++;
					}
				}
			}
		}
		if(numeriUguali != 0) {
			System.out.println("Ci sono numeri uguali!");
		} else {
			System.out.println("Tutti i numeri sono diversi!");
		}
	}
	
	static int trovaMax(int[] numCasuali) {
		int max = numCasuali[0];
		for (int i = 1; i < numCasuali.length; i++) {
			if(numCasuali[i] > max) {
				max = numCasuali[i];
			}
		}
		return max;
	}
	
	static int trovaMin(int[] numCasuali) {
		int min = numCasuali[0];
		for (int i = 1; i < numCasuali.length; i++) {
			if(numCasuali[i] < min) {
				min = numCasuali[i];
			}
		}
		return min;
	}
	
	static void scopriMaxEmin(int[] numeri) {
		int max = trovaMax(numeri);
		int min = trovaMin(numeri);
		
		System.out.println("Numero più grande: " + max);
		System.out.println("Numero più piccolo: " + min);
	}

}
