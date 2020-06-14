package it.begear.esercizi.lezione2.esercizio15;

public class Investimento {
	
	private double capitale;
	private float tassoInteresse;
	private int numeroAnni;
	private double montante;
	
	public Investimento(double capitaleIniziale, float tassoInteresse, int numeroAnni) {
		this.capitale = capitaleIniziale;
		this.tassoInteresse = tassoInteresse / 100;
		this.numeroAnni = numeroAnni;
		this.montante = this.capitale * (Math.pow((1 + this.tassoInteresse), numeroAnni));
	}
	
	public int quandoRaddoppiaIlCapitale() {
		double capitaleDoppio = this.capitale * 2;
		int anniPerRaddoppio = 1;
		double fattoreMontante;
		double montante = 0;
		
		while(montante < capitaleDoppio) {
			fattoreMontante = Math.pow((1 + this.tassoInteresse), anniPerRaddoppio);
			montante = this.capitale * fattoreMontante;
			if(montante >= capitaleDoppio) {
				break;
			} else {
				anniPerRaddoppio++;
			}
		}
		return anniPerRaddoppio;
	}

	public double getCapitale() {
		return capitale;
	}

	public void setCapitale(double capitale) {
		this.capitale = capitale;
	}

	public float getTassoInteresse() {
		return tassoInteresse;
	}

	public void setTassoInteresse(float tassoInteresse) {
		this.tassoInteresse = tassoInteresse;
	}

	public int getNumeroAnni() {
		return numeroAnni;
	}

	public void setNumeroAnni(int numeroAnni) {
		this.numeroAnni = numeroAnni;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}
	
	

}
