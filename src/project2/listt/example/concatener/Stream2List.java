package project2.listt.example.concatener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2List {
	
	
	public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("4", "5", "6"));
       
        
       // List<String> res =  Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        System.out.println("Liste 1: " + l1);
        System.out.println("Liste 2: " + l2);
        //System.out.println("Résultat: " + res);
    }

}
