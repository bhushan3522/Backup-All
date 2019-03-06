package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		//al.add(2, 100);
		//al.set(2, 100);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(100);
		al2.add(90);
		
		al.addAll(1, al2);
		System.out.println(al);
		
		//System.out.println(al);
		
		/*
		 * System.out.println("Printing using advance for loop");
		 
		for(int a : al)
		{
			System.out.println(a);
		}
		System.out.println("=====================================");
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("first element is : "+al.get(2));
		System.out.println("size is : "+al.size());
		*/
				
	}

}
