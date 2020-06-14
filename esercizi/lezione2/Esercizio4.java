package it.begear.esercizi.lezione2;

import java.util.Arrays;

/**
 * ESERCIZIO 4 - Dai in ingresso 3 nomi, metterli in un array, 
 *               aggiungere il cognome "Torretti" a tutti e stamparli in ordine alfabetico.
 * @author Pasquale
 *
 */
public class Esercizio4 {
	
	public static void main(String[] args) {
		String nome1 = "Pasquale";
		String nome2 = "Laura";
		String nome3 = "Lara";
		
		String[] nomi = {nome1, nome2, nome3};
		
		for (int i = 0; i < nomi.length; i++) {
			nomi[i] = nomi[i] + " Torretti";
		}
		
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		Arrays.sort(nomi);
		System.out.println("\nOrdiniamo:\n");
		
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
	}

}
