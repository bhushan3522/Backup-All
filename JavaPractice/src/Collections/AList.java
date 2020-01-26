package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		
		List <String> arrList = new ArrayList<String>();
		String testString = "This is a test string to verify the working of Arraylist in Java";
		
		String testStringArr[] = testString.split(" ");
		
		for(int i=0; i < testStringArr.length;i++)
		{
			arrList.add(testStringArr[i]);
		}
		
		arrList.remove("working");
		
		
		Iterator<String> it = arrList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
