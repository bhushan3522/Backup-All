package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FreqHashMap {

	public static void main(String[] args) {

		FreqHashMap f = new FreqHashMap();
		f.freq("This is bhushan");
		
	}
	
	public void freq(String s)
	{
		char sArr[] = s.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i = 0; i <sArr.length;i++)
		{
			if(hm.containsKey(sArr[i]))
			{
				hm.put(sArr[i], hm.get(sArr[i])+1);
			}
			else
				hm.put(sArr[i], 1);
		}
		for(Entry<Character, Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
