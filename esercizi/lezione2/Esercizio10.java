package it.begear.esercizi.lezione2;

import java.util.Random;

/**
 * ESERCIZIO 10 - Dati in ingresso 4 numeri casuali, determinare se sono pari o dispari o lo zero
 * @author Pasquale
 *
 */
public class Esercizio10 {
	
	public static void main(String[] args) {
		
		int[] numCasuali = generaNumeriCasuali(4);
		
		for (int i = 0; i < numCasuali.length; i++) {
			System.out.println(controllaNumero(numCasuali[i]));
		}
		
	}
	
	static int[] generaNumeriCasuali(int quantiNumeri) {
		Random r = new Random();
		int[] numeriCasuali = new int[quantiNumeri];
		for (int i = 0; i < numeriCasuali.length; i++) {
			numeriCasuali[i] = r.nextInt(11);
		}
		return numeriCasuali;
	}
	
	static String controllaNumero(int num) {
		String esito;
		if(num % 2 == 0 && num != 0) {
			esito = "Il numero " + num + " è pari!";
		} else if (num % 2 != 0){
			esito = "Il numero " + num + " è dispari!";
		} else if (num == 0) {
			esito = "Il numero " + num + " è zero!";
		} else {
			esito = "Caso non trattato, ritenta!";
		}
		return esito;
	}

}
