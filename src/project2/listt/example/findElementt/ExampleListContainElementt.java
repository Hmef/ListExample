package project2.listt.example.findElementt;

import java.util.ArrayList;
import java.util.List;

public class ExampleListContainElementt {

	public static void main(String[] args) {
		
		
		
		List<String> lang = new ArrayList<>();
		lang.add("Java");
		lang.add("PHP");
		lang.add("Python");
		lang.add("C++");
		
		
		List<String> res = new ArrayList<>();
		for (String i : lang) {
			if (i.contains("Python")) {
				res.add(i);
			}
		}
		System.out.println(res);
	}
}
