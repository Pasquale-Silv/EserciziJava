package it.begear.esercizi.lezione1;

import java.util.Random;

/**
 * ESERCIZIO 1 – Dati in ingresso due numeri casuali stampa a video la somma e la sottrazione dei due numeri
 * @author Pasquale
 *
 */
public class Esercizio1 {
	
public static void main(String[] args) {
		
		Random r = new Random();
		int num1 = r.nextInt(30);
		int num2 = r.nextInt(100);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("Somma: " + (num1 + num2));
		System.out.println("Sottrazione: " + (num1 - num2));
		System.out.println("Moltiplicazione: " + (num1 * num2));
		System.out.println("Divisione: " + ((double)num1 / num2));
		
	}

}
