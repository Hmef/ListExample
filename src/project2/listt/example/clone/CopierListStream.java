package project2.listt.example.clone;

import java.util.Arrays;
import java.util.List;

public class CopierListStream {
	
	
	 public static void main(String[] args) 
	    { 
	        // Créer une liste
	        List<String> maListe = Arrays.asList("A", "B", "C", "D", "E"); 
	        // Clonez la liste
	       //List<String> clone_list = maListe.stream().collect(Collectors.toList()); 
	       //System.out.println(clone_list); 
	        
	        System.out.println(maListe);
	    } 

}
