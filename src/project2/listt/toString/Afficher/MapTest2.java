package project2.listt.toString.Afficher;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	
	
	public static void main(String[] args) {
		
		
		
		Map<String, Integer> ages = new HashMap<>();
		
		ages.put("Name1", 20);
		ages.put("name2", 30);
		ages.put("name3", 40);
		
		// afficher le contenu de la Map ages 
		System.out.println(" ages.toString() --> " + ages.toString());
		
		System.out.println(" ages.get(\"Name1\") --> " + ages.get("Name1")); //Output: 20
		
		ages.remove("name3");
		
		System.out.println(ages.toString());
		
		// Nettoyer le HashMap
		ages.clear();
		
		System.out.println("  ");
		System.out.println(" Contenu de la Map ages après ages.clear() -->  " + ages.toString());
		
		ages.put("Name1", 20);
		ages.put("Name5", 22);
		ages.put("Name6", 46);
		
		ages.remove("Name1");
		if(ages.containsKey("Name5")) {
			
			System.out.println(" La clé existe bien ");
		}
		else{
			
			System.out.println(" La clé n'existe pas ");
			
		}
		
		if(ages.containsValue(20)) {
			
			System.out.println(" La valeur existe bien ");
		}
		
		else {
			System.out.println(" La valeur n'existe pas ");
		}

		System.out.println(ages.toString());
		
	}

}
