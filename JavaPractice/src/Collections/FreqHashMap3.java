package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FreqHashMap3 {

	public static void main(String[] args) {

		String s = "abbbasanfksdhskbvksvbajgvs";
		char ch[] = s.toCharArray();
		
		Map<Character,Integer>  hm = new HashMap<>();
		for(int i = 0; i< ch.length;i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i], 1);
			}
		}
		
		
		System.out.println("Character\tOccurances");
		for(Entry<Character,Integer> e : hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
	}

}
