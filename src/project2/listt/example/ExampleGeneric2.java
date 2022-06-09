package project2.listt.example;

import java.util.HashMap;
import java.util.Map;

public class ExampleGeneric2 {
	
	
	
public static void main(String[] args) {
		
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("Jean", 55);
		map1.put("Anais", 25);
		
		printMap(map1);

		
	}


	private static void printEntry(Map.Entry entry) {
		// TODO Auto-generated method stub
		System.out.println(entry.getKey() +" = " + entry.getValue());
		
	} // End printEntry()
	
	
	private static <K, V> void printMap(Map<K, V> map) {
		
		for(Map.Entry<K, V> entry : map.entrySet()) {
			
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
			
		
	} // end printMap()
	

}
