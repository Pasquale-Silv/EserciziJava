package it.begear.esercizi.lezione1;

/**
 * ESERCIZIO 4 - Inserire la parola "PrograMatoRRe" e correggerla in "Programmatore" usando i metodi di String.
 * @author Pasquale
 *
 */
public class Esercizio4 {
	
	public static String correggiProgrammatore(String prog) {
		prog = prog.charAt(0) + prog.substring(1).toLowerCase();
		prog = prog.replace("am", "amm");
		prog = prog.replace("rre", "re");
		return prog;
	}
	
	public static void main(String[] args) {
		String parola = "PrograMatoRRe";
		String soluzione = correggiProgrammatore(parola);
		
		System.out.println(parola);
		System.out.println(soluzione);
	}

}
