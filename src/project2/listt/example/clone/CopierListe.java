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
        
        clone_list.add("NewA");
        
        System.out.println(clone_list); 
        
        //maListe.add("LLL");   // Error: UnsupportedOperationException
        
        //System.out.println(maListe); 
        
        //maListe.add(3, "LL");
        
        boolean test = clone_list.contains("A");
        
        System.out.println(" clone_list.contains(\"A\")  : " + test);
        
       System.out.println(" get(int Index) :  " + clone_list.get(2));
       
       System.out.println(" clone_list.hashCode() : " + clone_list.hashCode());
    } 

}
