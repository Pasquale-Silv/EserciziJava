package it.begear.esercizi.lezione1;

/**
 * ESERCIZIO 6 - Inseriti due punti su un asse cartesiano determinarne la distanza
 * @author Pasquale
 *
 */
public class Esercizio6 {
	
	static double calcolaDistanza(Punto punto1, Punto punto2) {
		double distanza;
		double d1 = punto2.getX() - punto1.getX();
		d1 = Math.pow(d1, 2);
		double d2 = punto2.getX() - punto1.getX();
		d2 = Math.pow(d2, 2);
		distanza = Math.sqrt(d1 + d2);
		return distanza;
		
		
	}
	
	public static void main(String[] args) {
		
		Punto p1 = new Punto(1, 2);
		Punto p2 = new Punto(3, 4);
		
		double dist = calcolaDistanza(p1, p2);
		
		System.out.println(dist);
		
	}

}

/**
 * Classe esterna per facilitare il programma(Sarebbe stato meglio creare un'altra classe, ma vabbè)
 * @author Pasquale
 *
 */
class Punto {
	private double x;
	private double y;
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	
}