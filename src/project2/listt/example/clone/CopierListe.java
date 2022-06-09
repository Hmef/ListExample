package project2.listt.example.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopierListe {
	
	public static void main(String[] args) 
    { 
        // Créer une liste
        List<String> maListe = Arrays.asList("A", "B", "C", "D", "E"); 
  
        // Clonez la liste
        List<String> clone_list = new ArrayList<String>(maListe); 
  
        System.out.println(clone_list); 
    } 

}
