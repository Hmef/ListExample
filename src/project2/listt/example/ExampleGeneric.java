package project2.listt.example;

import java.util.HashMap;
import java.util.Map;

public class ExampleGeneric {

	
	public static void main(String args[]){
		
		Map<Integer,String> map=new HashMap<Integer,String>(); 
		map.put(100,"Amit");
		map.put(101,"Vijay");
		map.put(102,"Rahul");
		
		//Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  //Pour accéder à une valeur, utilisez simplement la méthode get() avec la clé en argument
		  
		  System.out.println("  ");
		  
		  System.out.println(map);
		  
		  
		  
			/**
			 * Quelle est la carte Map est une interface qui représente un mappage entre une
			 * clé et une valeur. Cela n'allonge pas l'interface Collection. Par conséquent,
			 * le comportement de Map est différent des types de collection habituels. Une
			 * carte ne peut pas contenir de clés en double et chaque clé peut correspondre
			 * à au plus une valeur. HashMap implémente l'interface Map alors que SortedMap
			 * étend l'interface Map et TreeMap implémente l'interface SortedMap.
			 */

	}
	
	
	
 
}
