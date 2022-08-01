package HashMap;

import java.util.HashMap;
import java.util.Set;

public class example2 {
	public static void main(String[] args) {
		
		HashMap< Integer, String> mp=new HashMap<Integer , String>();
		mp.put(101, "RAhul");
		mp.put(103, "Anuj");
	    mp.put(102, "Sima");

		System.out.println(mp.containsKey(103));
		System.out.println(mp.containsKey(109));
		System.out.println(mp.containsKey(101));
		
		// printing all keys and values in hashmap
		
		Set<Integer> allKeys = mp.keySet();
		 for(Integer key:allKeys)
		 {
			 System.out.println(key+":  "+mp.get(key));
		 }
		
		
		
	}

}
