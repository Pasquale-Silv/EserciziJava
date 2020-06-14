package it.begear.esercizi.lezione2;

import java.util.Scanner;

/**
 * ESERCIZIO 7 - Inserire un intero diverso da zero che diventa il numero di volte che viene eseguito un ciclo, 
 * ogni volta il ciclo stampa "BLA" seguito dal
   numero dell'iterazione
 * @author Pasquale
 *
 */
public class Esercizio7 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire un intero diverso da zero che sarà "
				         + "il numero di volte che viene eseguito un ciclo:\n");
		int numCiclo = in.nextInt();
		
		ciclaBla(numCiclo);
	}
	
	static void ciclaBla(int num) {
		int i = 0;
		if(num > 0) {
			while (i < num) {
				System.out.println("BLA - Iterazione numero " + (i + 1));
				i++;
			}
		} else {
			System.out.println("Ho detto un numero diverso da zero!");
		}
	}

}
