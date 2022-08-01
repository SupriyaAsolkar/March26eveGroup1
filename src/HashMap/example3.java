package HashMap;

import java.util.HashMap;
import java.util.Set;

public class example3 {
	public static void main(String[] args) {
//		
//		String s1="abc aabbcc abc aabbc aabbc abc aabbcc abbcc";
//		
//		HashMap<String , Integer> mp= new HashMap<String , Integer>();
//		
//		String[] org=s1.split(" ");
//		for(int i=0 ; i<=org.length-1; i++)
//		{
//			String Str=org[i];
//			if(mp.containsKey(Str))
//			{
//				System.out.println(Str+"; "+mp.get(Str)+1);
//			}
//		}
		
		String str = "abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab";

		String ar[] = str.split(" "); // {abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab}

		HashMap<String, Integer> mp = new HashMap<String, Integer>();

		
		for (int i = 0; i <= ar.length - 1; i++)
		{                                                                                                                                
							//0
			String s1 = ar[i];  //abc
			 
			if (mp.containsKey(s1)) 
			{
				mp.put(s1, mp.get(s1) + 1);
			} 
			else 
			{
				mp.put(s1, 1);
			}
		}

		Set<String> allkeys = mp.keySet();
		
		for(String key:allkeys)
		{
			System.out.println(key+": "+mp.get(key));
			
		}
		//only to print duplicates value
		for(String key:allkeys)
		{
			if(mp.get(key)>1)
			{
			System.out.println(key+": "+mp.get(key));
			}
			
		}
		
		
		
		
	}

}
