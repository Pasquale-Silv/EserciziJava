package it.begear.esercizi.lezione1;

import java.util.Random;

/**
 * ESERCIZIO 5 - Creare due variabili, alla prima si assegna un numero random da 0 a 100, alla seconda da 50 a 100
 * @author Pasquale
 *
 */
public class Esercizio5 {
	
	static Random r = new Random();
	
    public static void main(String[] args) {
    	int var1 = r.nextInt(101);
    	int var2 = r.nextInt(51) + 50;
		System.out.println(var1);
		System.out.println(var2);
	}

}
