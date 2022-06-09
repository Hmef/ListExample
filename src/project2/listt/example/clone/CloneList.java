package project2.listt.example.clone;

import java.util.ArrayList;

public class CloneList {
	
	
	public static void main(String[] args) 
    { 
        // Créer une liste
        ArrayList<String> maListe = new ArrayList<String>(); 
        
        // Ajouter des valeurs dans l'ArrayList
        maListe.add("A");
        maListe.add("B");
        maListe.add("C");
        maListe.add("D");
        maListe.add("E");
        
        // Clonez la liste
        Object clone_list = maListe.clone();
        System.out.println(clone_list); 
    } 

}
