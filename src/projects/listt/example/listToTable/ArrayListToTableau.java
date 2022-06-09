package projects.listt.example.listToTable;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToTableau {
	
	
	public static void main(String[] args) {
	    //Créer une Arraylist
	    List<String> languages = new ArrayList<String>();
	    
	    //ajouter des objets string à l'ArrayList
	    languages.add("JAVA");
	    languages.add("PHP");
	    languages.add("PYTHON");
	    languages.add("C++");
	    
	    System.out.println(" Transformer ArrayList en tableau ");
	    
	    
	    String[] arr = languages.toArray(new String[languages.size()]);
	   
	    //afficher le tableau
	    for(String i : arr){
	      System.out.println(i);
	    }
	  }

}
