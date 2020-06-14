package it.begear.esercizi.lezione2;

import java.util.Arrays;

/**
 * ESERCIZIO 9 - Inserire delle stringhe in un array e restituire quelle che cominciano con una maiuscola.
 * @author Pasquale
 *
 */
public class Esercizio9 {

	static String[] arrayStringhe = {"Pasquale", "giammarco", "luca", "James", "tony", "Zelda", "Antimo", 
			"Cinzia", "mike", "Gioacchino", "giacomo", "dino", "alfonso"};
	
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(arrayStringhe));
		// int uno = 'A';
		// int due = 'Z';
		// System.out.println("char A " + uno);
		// System.out.println("char Z " + due);
		
		String[] arrayStringheMaiu = restituisciMaiuscole(arrayStringhe);
		
		// System.out.println(Arrays.deepToString(arrayStringheMaiu));
		
		System.out.println("\nSolo nomi che iniziano con la lettera maiuscola:");
		for (String nomeMaiu : arrayStringheMaiu) {
			if(nomeMaiu != null) {
			System.out.println(nomeMaiu);
			}
		}
		
	}
	
	static String[] restituisciMaiuscole(String[] names) {
		String[] namesMaiu = new String[names.length];
		int indice = 0;
		for (int i = 0; i < names.length; i++) {
			if(isMaiuscola(names[i])) {
				namesMaiu[indice] = names[i];
				indice++;
			}
		}
		return namesMaiu;
	}
	
	static boolean isMaiuscola(String nome) {
		boolean esito = false;
		char c = nome.charAt(0);
		if(c >= 65 && c <= 90) {
			esito = true;
		} else {
			esito = false;
		}
		return esito;
	}
}
