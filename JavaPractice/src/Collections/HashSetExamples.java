package Collections;

import java.util.HashSet;

public class HashSetExamples {

	public static void main(String args[]) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("red");
		hs.add("red");
		hs.add("blue");
		
		hs.add("pink");
		
		//hs.clear();
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1 = (HashSet<String>) hs.clone();
		
		System.out.println(hs);
		System.out.println("number of elements in hashset "+hs.size());
		System.out.println("is hashset empty"+hs.isEmpty());
		
		System.out.println("===================");
		System.out.println(hs1);
		
		String s[] = new String[hs1.size()];
		
		s= (String[]) hs1.toArray();
	}
}
