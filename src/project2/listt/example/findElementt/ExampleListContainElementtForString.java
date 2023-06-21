package project2.listt.example.findElementt;

import java.util.ArrayList;
import java.util.List;

public class ExampleListContainElementtForString {

	public static void main(String[] args) {

		List<String> langlist = new ArrayList<>();    
		langlist.add("Java");
		langlist.add("PHP");
		langlist.add("Python");
		langlist.add("C++");
		langlist.add("A");
		langlist.add("B");
		langlist.add("C");

		System.out.println(" Before Modification --> " + langlist);
		/*
		 * If we remove an item from an ArrayList while iterating it, the list.remove(s) 
		 * will throws java.util.ConcurrentModificationException. 
		 * 
		 * 
		 * for (String s : langlist) {
		 * 
		 * if ("A".equals(s)) {
		 * 
		 * langlist.remove(s); }
		 * 
		 * } // End for
		 * System.out.println("List after removing JAVA "+ langlist);
		 */

		List<String> reslist = new ArrayList<>();
		for (String i : langlist) {
			if (i.contains("Python")) {
				reslist.add(i);
			}
		}        
		
		System.out.println(reslist);       

		
		  // Java 8 Collection#removeIf
		 // remove if item is "A"
		langlist.removeIf("A"::equals);

	      System.out.println(" After removing \"A\" --> " + langlist);
		
		
	      //Another removeIf example
	      
	      // remove if item is 1 or 3
	      //langlist.removeIf(x -> x == 1 || x == 3);
	      langlist.removeIf(x -> x.equals("B") || x.equals("CC"));

	      System.out.println(langlist);
		
		
	}
}
