package it.begear.esercizi.lezione1;

/**
 * ESERCIZIO 2 – Classe Persona con nome e cognome. Metodo che restituisce nome e cognome maiuscoli
 * @author Pasquale
 *
 */
public class Persona {
	
	private String nome;
	private String cognome;
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String nomeCognomeMaiuscoli() {
		return this.getNome().toUpperCase() + " " + this.getCognome().toUpperCase();
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Pasquale", "Silvestre");
		String nomeMaiu = p1.nomeCognomeMaiuscoli();
		System.out.println(nomeMaiu);
	}

}
