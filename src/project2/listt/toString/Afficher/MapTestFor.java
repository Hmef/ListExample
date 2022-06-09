package project2.listt.toString.Afficher;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTestFor {
	
public static void main(String[] args) {
		
		
		
		Map<String, Integer> ages = new HashMap<>();
		
		ages.put("Name1", 20);
		ages.put("name2", 30);
		ages.put("name3", 40);
		ages.put("Name5", 22);
		ages.put("Name6", 46);
		
		
		System.out.println(" toString ");
		
		// afficher le contenu de la map
		System.out.println(ages.toString());
		
		System.out.println(" ============== ");
		
		System.out.println(" boucle for pour parcourir la map ");
		System.out.println(" récupérer les key: keyset()");
		
		for(String string : ages.keySet()) {
			
			System.out.println(string);
		}
		
		System.out.println(" ");
		System.out.println("Récupérer les clés et les valeurs de la Map ");
		
		for(Entry <String,Integer> element : ages.entrySet()) {
			
			System.out.println(" La clé : " + element.getKey() + ", La valeur : " + element.getValue());
			
		}
	}


}
