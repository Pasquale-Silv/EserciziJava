package it.begear.esercizi.lezione2;

/**
 * ESERCIZIO 6 - Inserire un giorno della settimana, 
 *               per ogni giorno stampare il numero del giorno della settimana corrente.
 * @author Pasquale
 *
 */
public class Esercizio6 {
	
	public static void main(String[] args) {
		String giorni[] = new String[7];
		giorni[0] = "lun";
		giorni[1] = "mar";
		giorni[2] = "mer";
		giorni[3] = "gio";
		giorni[4] = "ven";
		giorni[5] = "sab";
		giorni[6] = "dom";
		
		String giorno1 = "dom";
		String giorno2 = "mer";
		
		for (int i = 0; i < giorni.length; i++) {
			boolean flag1 = giorni[i].equals(giorno1);
			if(flag1) {
				System.out.println("Posizione del giorno '" + giorni[i] + "' nella settimana: " + (i + 1));
			}
			boolean flag2 = giorni[i].equals(giorno2);
			if(flag2) {
				System.out.println("Posizione del giorno '" + giorni[i] + "' nella settimana: " + (i + 1));
			}
		}
		
		System.out.println("\nOra stampa giorni e indici:");
		
		stampaGiorniIndici(giorni);
	}
	
	static void stampaGiorniIndici(String[] days) {
		for (int i = 0; i < days.length; i++) {
			System.out.println("Giorno della settimana: '" + days[i] + "' e rispettivo indice: " + (i + 1));
		}
	}

}
