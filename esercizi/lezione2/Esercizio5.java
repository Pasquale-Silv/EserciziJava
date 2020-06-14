package it.begear.esercizi.lezione2;

/**
 * ESERCIZIO 5 - Immettere 4 ingredienti come stringhe. Creare due array, uno vuoto e uno con dentro le 4 stringhe. 
 * Creare un metodo che controlla
   se nell'array ci sono "pomodoro", "mozzarella", "lattuga" e "spezie" e li mette nel secondo array. 
   Nel caso in cui il primo array sia vuoto o diversamente costruito segnalarlo a console.
 * @author Pasquale
 *
 */
public class Esercizio5 {
	
	public static void main(String[] args) {
		String[] ingredienti = {"uva", "uova", "lattuga", "mozzarella"};
		String[] ingredienti1 = new String[4];
		
		ingredienti1 = controllaIngredienti(ingredienti);
		
		for (String ingredienteSingolo : ingredienti1) {
			System.out.println(ingredienteSingolo);
		}
		
		System.out.println("\nProva due: ");
		
		String[] ingredienti2 = new String[10];
		String[] ingredienti3 = new String[4];
		
		ingredienti3 = controllaIngredienti(ingredienti2);
		
	}
	
	public static String[] controllaIngredienti(String[] ingr) {
		String[] nuovaIngr = new String[ingr.length];
		if(isEmpty(ingr)) {
			System.out.println("L'array è vuota!");
			return nuovaIngr;
		} else {
			int indice = 0;
			for (int i = 0; i < ingr.length; i++) {
				String current = ingr[i];
				if(current == "mozzarella" || current == "pomodoro" || current == "lattuga" || current == "spezie" ) {
					nuovaIngr[indice] = current;
					indice++;
				}
			}
		}
		return nuovaIngr;
	}
	
	public static boolean isEmpty(String[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
