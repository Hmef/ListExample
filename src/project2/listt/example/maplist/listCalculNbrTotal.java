package project2.listt.example.maplist;

import java.util.ArrayList;

public class listCalculNbrTotal {
	
	
	public static void main(String[] args) {
	    
	    int somme = 0;
	    
	    ArrayList<Integer> liste = new ArrayList<Integer>();  
	    liste.add(1);
	    liste.add(2);
	    liste.add(3);
	    liste.add(4);
	    liste.add(5);
	  
	    for(int i = 0; i < liste.size(); i++)
	        somme += liste.get(i);
	    
	    System.out.println("La somme est: " + somme);
	    
	    
	    System.out.println("Taille de la Liste : " + liste.size());
	  }

}
