package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class FreqHashMap2 {

	public static void main(String[] args) {

		String s = "aaaassssffffvvv";
		char chArr[] = s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		for(int i = 0; i<chArr.length;i++)
		{
			if(!hm.containsKey(chArr[i]))
			{
				hm.put(chArr[i], 1);
			}
			else
			{
				hm.put(chArr[i], hm.get(chArr[i])+1);
			}
		}
		for(Entry e : hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
