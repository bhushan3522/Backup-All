package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Colors {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
		colors.add("Black");
		
		colors.add(0, "Pink");
		
		System.out.println(colors.get(5));
		
		//using for each loop
		/*
		 * for(String s : colors) { System.out.println(s); }
		 * System.out.println("divider=====================");
		 * 
		 * //using iterator Iterator<String> it = colors.iterator(); while(it.hasNext())
		 * { System.out.println(it.next()); }
		 */
		
//		System.out.println(colors);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(3);
		numbers.add(8);
		Collections.sort(numbers);
		System.out.println(numbers);
		
	}

}
