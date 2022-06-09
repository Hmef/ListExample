package project2.map.example.sortAscendingDescending;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyExample2 {

	public static void main(String[] args) {

		Map<Integer, String> unsortMap = new HashMap<Integer, String>();

		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(6, "a");
		unsortMap.put(20, "c");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(8, "y");
		unsortMap.put(99, "n");
		unsortMap.put(50, "j");
		unsortMap.put(2, "m");
		unsortMap.put(9, "f");
		
		System.out.println(" Unsorted Map ..... ");
		printMap(unsortMap);
		
		System.out.println("  ");
		
		System.out.println(" Sorted Map ..... ");
		Map<Integer, String> sortedMap = new TreeMap<Integer, String>(unsortMap);
		printMap(sortedMap);
		

	}
	
	
	private static <K, V> void printMap(Map<K, V> map) {
		
		for(Map.Entry<K, V> entry : map.entrySet()) {
			
			System.out.println(" Key : " + entry.getKey() + ", Value : " + entry.getValue() );
			
		}
	}

}
