package project2.listt.example.maplist;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	
	public static void main(String[] args)
    {
        // Creating an empty Map
        Map<Integer, String> map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        map.put(10, "Geeks");
        map.put(15, "4");
        map.put(20, "Geeks");
        map.put(25, "Welcomes");
        map.put(30, "You");
  
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
  
        // Getting the value of 25
        System.out.println("The Value is: " + map.get(25));
  
        // Getting the value of 10
        System.out.println("The Value is: " + map.get(10));
    }

}
