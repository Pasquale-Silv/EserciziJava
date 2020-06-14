package it.begear.esercizi.lezione2.esercizio14;

import java.util.ArrayList;

public class Persona {
	
	private String nome;
	private String cognome;
	private OrientamentoAlimentare orientamentoAlimentare;
	
	public Persona(String nome, String cognome, OrientamentoAlimentare orientamentoAlimentare) {
		this.nome = nome;
		this.cognome = cognome;
		this.orientamentoAlimentare = orientamentoAlimentare;
	}
	
	public void consumaPasti(String[] piatti, ArrayList<String> preferenze) {
		String esito;
		if (this.orientamentoAlimentare == orientamentoAlimentare.vegetariano) {
			System.out.println(this.toString() + " è un individuo vegetariano, quindi...");
			for (int i = 0; i < piatti.length; i++) {
				esito = (preferenze.contains(piatti[i])) ? this.nome + " " + this.cognome + " mangia il pasto " + piatti[i] : this.nome + " " + this.cognome + " non mangia il pasto " + piatti[i] + " poichè è vegetariano!";
				System.out.println(esito);
			}
		} else {
			esito = "L'individuo " + this.toString() + " mangia di tutto poichè è onnivoro, dacci dentro!";
			System.out.println(esito);
		}
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

	public OrientamentoAlimentare getOrientamentoAlimentare() {
		return orientamentoAlimentare;
	}

	public void setOrientamentoAlimentare(OrientamentoAlimentare orientamentoAlimentare) {
		this.orientamentoAlimentare = orientamentoAlimentare;
	}

	@Override
	public String toString() {
		return this.getNome() + " " + this.getCognome();
	}
	
	
	
}
