package project2.listt.example.maplist;

import java.util.HashMap;
import java.util.Map;

public class TestListCountString {
	
	
	
public static void main(String[] args) {
		
		
		
		// Tableau à compter
		final String[] tab = { "Fever", "Headache", "tremor", "dry mouth", "tremor"};

		// Comptage
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String item : tab) {
			Integer nombre = map.get(item);
			if (nombre == null) {
				nombre = 0;
			}
			nombre++;
			map.put(item, nombre);
		}

		// Affichage
		for (String key : map.keySet()) {
			Integer nombre = map.get(key);
			System.out.println("[" + key + "] --> " + nombre);
		}
	}

}
