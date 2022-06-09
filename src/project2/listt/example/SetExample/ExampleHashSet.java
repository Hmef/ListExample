package project2.listt.example.SetExample;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {

	public static void main(String args[]){
		
		
		Set<String> hashset = new HashSet<String>();
		
		
		hashset.add("apple");
		hashset.add("orange");
		hashset.add("apple");
		hashset.add("mango");
		hashset.add("graphes");
		
		
		System.out.println(hashset);
		System.out.println(hashset.size());
		
		
		/**
		 * Le HashSet est un objet de type Set. Il peut stocker des chaînes. La méthode
		 * add est utilisée pour insérer des éléments dans HashSet. Même s'il existe
		 * deux chaînes en tant que "pomme", il n'y a qu'une seule pomme dans la sortie.
		 * Par conséquent, il n'affiche pas les éléments qui existent déjà dans
		 * l'ensemble. De plus, il imprime l'ensemble en tant que liste non ordonnée. La
		 * méthode de la taille donne le nombre d'éléments dans l'ensemble.
		 */
		
		
		/**
		 * Set est une interface qui étend l’interface Collection. Il ne peut pas
		 * contenir de doublons. HashSet et TreeSet implémentent l'ensemble. L’interface
		 * Set fournit des méthodes telles que l’ajout, la taille, etc. pour effectuer
		 * des opérations sur la collection.
		 */
	}

}
