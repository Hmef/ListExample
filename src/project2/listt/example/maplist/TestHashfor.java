package project2.listt.example.maplist;

import java.util.HashMap;
import java.util.Map;

public class TestHashfor {

	public static void main(String args[]) {
		
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		// ajouter des éléments au HashMap
		map.put(1, "Alex");
		map.put(2, "Emily");
		map.put(3, "Thomas");
		map.put(4, "Yohan");
		
		
		// Parcourir le Hashmap avec la boucle For
		for (Map.Entry m : map.entrySet()) {
			System.out.println("ID: " + m.getKey() + ", Nom: " + m.getValue());
		}
	}

}
