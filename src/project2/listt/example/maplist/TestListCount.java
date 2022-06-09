package project2.listt.example.maplist;

import java.util.HashMap;
import java.util.Map;

public class TestListCount {

	public static void main(String[] args) {
		
		
		
		// Tableau à compter
		final int[] tab = { 12, 14, 15, 12, 22, 30, 12, 22 };

		// Comptage
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer item : tab) {
			Integer nombre = map.get(item);
			if (nombre == null) {
				nombre = 0;
			}
			nombre++;
			map.put(item, nombre);
		}

		// Affichage
		for (Integer key : map.keySet()) {
			Integer nombre = map.get(key);
			System.out.println("[" + key + "] --> " + nombre);
		}
	}

}
