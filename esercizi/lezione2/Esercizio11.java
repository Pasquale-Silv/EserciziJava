package it.begear.esercizi.lezione2;

/**
 * ESERCIZIO 11 - Date in ingresso tre stringhe determina la più lunga e la più breve
 * @author Pasquale
 *
 */
public class Esercizio11 {
	
	public static void main(String[] args) {
		String stringa1 = "Lunghissima";
		String stringa2 = "mediaaaa";
		String stringa3 = "breve";
		
		controllaStringheLung(stringa1, stringa2, stringa3);
		
		System.out.println("--------");
		
		controllaStringheLung("Pasquale", "The dark Knight", "ciao");

	}
	
	static void controllaStringheLung(String s1, String s2, String s3) {
		int lungS1 = s1.length();
		int lungS2 = s2.length();
		int lungS3 = s3.length();
		
		if(lungS1 > lungS2 && lungS1 > lungS2) {
			System.out.println("Stringa più lunga: " + s1);
		} else if(lungS2 > lungS1 && lungS2 > lungS3) {
			System.out.println("Stringa più lunga: " + s2);
		} else if(lungS3 > lungS2 && lungS3 > lungS1) {
			System.out.println("Stringa più lunga: " + s3);
		}
		
		if(lungS1 < lungS2 && lungS1 < lungS3) {
			System.out.println("Stringa più breve: " + s1);
		} else if(lungS2 < lungS1 && lungS2 < lungS3) {
			System.out.println("Stringa più breve: " + s2);
		} else if(lungS3 < lungS2 && lungS3 < lungS1) {
			System.out.println("Stringa più breve: " + s3);
		}
		
	}

}
