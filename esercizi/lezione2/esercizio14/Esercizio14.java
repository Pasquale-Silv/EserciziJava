package it.begear.esercizi.lezione2.esercizio14;

import java.util.ArrayList;

/**
 * ESERCIZIO 14 - Classe Persona con attributo orientamento alimentare (onnivoro, vegetariano). 
 *                Dati in ingresso 4 piatti (String) 
                  Usare il controllo ternario per determinare se consuma il pasto o no.
 * @author Pasquale
 *
 */
public class Esercizio14 {
	
	// L'operatore ternario sta nel metodo consumaPasti() della classe Persona !
	
	static ArrayList<String> piattiOnnivori = new ArrayList<String>();
	static ArrayList<String> piattiVegetariani = new ArrayList<String>();

	public static void main(String[] args) {
		piattiOnnivori.add("carne");
		piattiOnnivori.add("maiale");
		piattiOnnivori.add("vitello");
		
		piattiVegetariani.add("uova");
		piattiVegetariani.add("pesce");
		piattiVegetariani.add("tonno");
		
		String[] piattiServiti = {"tonno", "carne", "maiale", "uova"};
		
		Persona persona1 = new Persona("Mike", "Johnson", OrientamentoAlimentare.vegetariano);
		
		persona1.consumaPasti(piattiServiti, piattiVegetariani);
		
		System.out.println("-------");
		
		Persona persona2 = new Persona("Franco", "Svizzero", OrientamentoAlimentare.onnivoro);
		
		persona2.consumaPasti(piattiServiti, piattiOnnivori);
		
	}
}
