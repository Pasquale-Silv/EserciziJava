package it.begear.esercizi.lezione2;

/**
 * ESERCIZIO 1 – Dati due rettangoli, calcolarne l’area e mandare in uscita da un metodo qual è il più grande.
 * @author Pasquale
 *
 */
public class Rettangolo {
	
	private double base;
	private double altezza;
	private double area;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
		this.area = base * altezza;
	}
	
	public double calcolaArea() {
		double areaCalcolata = base * altezza;
		this.area = areaCalcolata;
		return areaCalcolata;
	}
	
	public void areaMaggiore(Rettangolo rett) {
		if(this.area > rett.area) {
			System.out.println("Area dell'oggetto chiamante più grande: " + this.area);
		} else if (this.area < rett.area) {
			System.out.println("Area dell'oggetto in parametro più grande: " + rett.area);
		} else {
			System.out.println("Le aree sono uguali: " + this.area);
		}
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	
	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(3, 4);
		Rettangolo r2 = new Rettangolo(5, 10);
		
		r1.areaMaggiore(r2);
		System.out.println("\n");
		r2.areaMaggiore(r1);
	}
	
}
