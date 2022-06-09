package project2.listt.example.maplist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashIteratorWhile {

	public static void main(String args[]) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// ajouter des éléments au HashMap
		map.put(1, "Alex");
		map.put(2, "Emily");
		map.put(3, "Thomas");
		map.put(4, "Yohan");
		
		
		// Parcourir le Hashmap avec la boucle While + Iterator
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			System.out.println("ID: " + m.getKey() + ", Nom: " + m.getValue());
		}
	}

}
