package project2.listt.example.SetExample;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {

	
	public static void main(String args[]){
		
		
		Set<String> treeset = new TreeSet<String>();
		
		
		treeset.add("apple");
		treeset.add("orange");
		treeset.add("apple");
		treeset.add("mango");
		treeset.add("graphes");
		
		
		System.out.println(treeset);
		System.out.println(treeset.size());
		
		// affichage par ordre alphabétique
		
		/**
		 * Le treeset est un objet de type Set pouvant stocker des chaînes.
		 * La méthode add est utilisée pour insérer des éléments dans un jeu d’arbres. 
		 * Même s'il existe deux chaînes en tant que "pomme", il n'y a qu'une seule pomme dans la
		 * sortie. 
		 * Par conséquent, il affiche uniquement les éléments uniques. De plus,
		 * il imprime le jeu sous forme de liste ordonnée. La méthode de la taille donne
		 * le nombre d'éléments dans l'ensemble.
		 */
		
	}
	
	
}
