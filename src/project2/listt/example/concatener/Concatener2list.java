package project2.listt.example.concatener;

import java.util.ArrayList;
import java.util.Arrays;

public class Concatener2list {
	
	
	public static void main(String[] args) throws Exception 
    {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
       
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("4", "5", "6"));
        
        l1.addAll(l2); 
        System.out.println(l1);
    }

}
