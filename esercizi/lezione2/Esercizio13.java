package it.begear.esercizi.lezione2;

import java.util.Scanner;

/**
 * ESERCIZIO 13 - Dato in ingresso un numero tra 1 e 7 restituisce il giorno della settimana relativo. Usare switch
 * @author Pasquale
 *
 */
public class Esercizio13 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Associa un numero da uno a sette a un giorno della settimana:");
		int numeroGiornoSett = in.nextInt();
		String giornoAssociato;
		
		switch (numeroGiornoSett) {
		case 1:
			giornoAssociato = "Lunedi";
			break;
		case 2:
			giornoAssociato = "Martedi";
			break;
		case 3:
			giornoAssociato = "Mercoledi";
			break;
		case 4:
			giornoAssociato = "Giovedi";
			break;
		case 5:
			giornoAssociato = "Venerdi";
			break;
		case 6:
			giornoAssociato = "Sabato";
			break;
		case 7:
			giornoAssociato = "Domenica";
			break;
		default:
			giornoAssociato = "Nessuna corrispondenza trovata!";
			break;
		}
		
		System.out.println(giornoAssociato);
	}

}
