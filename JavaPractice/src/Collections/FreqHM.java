package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class FreqHM {

	public static void main(String[] args) {

		String name = "My Name is Bhushan";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i =0; i < name.length();i++) {
			if(!hm.containsKey(name.charAt(i))) {
				hm.put(name.charAt(i), 1);
			}
			else {
				hm.put(name.charAt(i), hm.get(name.charAt(i))+1);
			}
		}
		
		for(Entry<Character,Integer> e : hm.entrySet()) {
			if(!e.getKey().equals(' ')) {
				System.out.println(e.getKey()+"  "+e.getValue());
			}
		}
	}

}
