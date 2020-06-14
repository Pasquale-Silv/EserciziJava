package it.begear.esercizi.lezione2.esercizio15;

/**
 * ESERCIZIO 15 - Basandosi sulla formula del montante M = C*(1+i)^n dove:
	C = capitale inziale
	i = tasso di interesse (float)
	n = numero di anni
	M = montante restituito dalla banca dopo n anni al tasso i
	Dato in ingresso un tasso di interesse e un capitale iniziale calcolare dopo quanti anni raddoppierà il 
	capitale iniziale.
 * @author Pasquale
 *
 */
public class Esercizio15 {
	
	public static void main(String[] args) {
		
		Investimento investimento1 = new Investimento(1000, 50, 2);
		
		System.out.println(investimento1.getMontante());
		
		int raddoppiaCap1 = investimento1.quandoRaddoppiaIlCapitale();
		
		System.out.println("Il capitale del primo investimento raddoppia dopo " + raddoppiaCap1 + " anni.");
		
		System.out.println("---------------");
		
		Investimento investimento2 = new Investimento(500, 10, 8);
		System.out.println(investimento2.getMontante());
		
		int raddoppiaCap2 = investimento2.quandoRaddoppiaIlCapitale();
		System.out.println("Il capitale del secondo investimento raddoppia dopo " + raddoppiaCap2 + " anni.");
		
	}

}
