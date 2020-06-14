package it.begear.esercizi.lezione1;

/**
 * ESERCIZIO 3 – Classe portafoglio con attributo un valore in denaro euro,centesimi. 
   Calcolarne una percentuale a piacere usando valore e percentuale come dati di ingresso di un metodo.
 * @author Pasquale
 *
 */
public class Portafoglio {
	
	double valoreInEuro;
	
	
	
	public Portafoglio(double valoreInEuro) {
		this.valoreInEuro = valoreInEuro;
	}
	
	

	public double getValoreInEuro() {
		return valoreInEuro;
	}



	public void setValoreInEuro(double valoreInEuro) {
		this.valoreInEuro = valoreInEuro;
	}



	public double calcolaPercentuale(double percentuale) {
		return this.valoreInEuro * (percentuale / 100);
	}
	
	public static void main(String[] args) {
		Portafoglio p1 = new Portafoglio(40);
		Portafoglio p2 = new Portafoglio(100);
		Portafoglio p3 = new Portafoglio(1000.82);
		
		System.out.println("Prove:");
		
	    double prova1 = p1.calcolaPercentuale(10);
	    System.out.println(prova1);
	    
	    double prova2 = p2.calcolaPercentuale(50);
	    System.out.println(prova2);
	    
	    double prova3 = p3.calcolaPercentuale(20);
	    System.out.println(prova3);
	}

}
