package it.begear.esercizi.lezione2;


/**
 * ESERCIZIO 2 – Dati in ingresso quattro numeri double.
	Un metodo prende i due più piccoli e ne fa il modulo.
	Un altro  prende i due più piccoli e li somma, ma restituisce un intero.
	Un terzo prende i risultati dei due metodi precedenti e li mostra entrambi.
 * @author Pasquale
 *
 */
public class Esercizio2 {
	// Potevi anche utilizzare Arrays.sort(numeri) e ordinare e operare sui primi due.
	
	static double moduloDue(double...numeri) {
		double num1 = numeri[0];
		double num2 = numeri[1];
		double appoggio;
		
		for (int i = 2; i < numeri.length; i++) {
			double current = numeri[i];
			if(current < num2 && current > num1) {
				num2 = current;
			} else if(current < num2 && current < num1) {
				appoggio = num1;
				num1 = current;
				num2 = appoggio;
			}
		}
		return num1 % num2;
		
	}
	
	static int sommaDue(double...numeri) {
		double num1 = numeri[0];
		double num2 = numeri[1];
		double appoggio;
		
		for (int i = 2; i < numeri.length; i++) {
			double current = numeri[i];
			if(current < num2 && current > num1) {
				num2 = current;
			} else if(current < num2 && current < num1) {
				appoggio = num1;
				num1 = current;
				num2 = appoggio;
			}
		}
		return (int)(num1 + num2);		
	}
	
	static void mostraRisultatiPrecedenti(double...numeri) {
		double modulo = moduloDue(numeri);
		double somma = sommaDue(numeri);
		
		System.out.println("Risultato metodo moduloDue: " + modulo);
		System.out.println("Risultato metodo sommaDue: " + somma);
	}
	
	public static void main(String[] args) {
		mostraRisultatiPrecedenti(3, 5, 8, 1);
		mostraRisultatiPrecedenti(10, 80, 1, 3);
		mostraRisultatiPrecedenti(89, 78, 1, 12, 6, 7, 11, 67, 56, 3);
	}

}
