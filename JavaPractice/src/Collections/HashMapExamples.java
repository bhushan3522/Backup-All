package Collections;

import java.util.HashMap;

public class HashMapExamples {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Ajay",1);
		hm.put("Vishal",2);
		hm.put("Yash",3);
		hm.put("Bhushan",4);
		hm.put("Nikita",5);
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.containsKey("Neha"));
		
	}

}
