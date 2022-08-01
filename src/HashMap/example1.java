package HashMap;

import java.util.HashMap;
import java.util.Set;

public class example1 {

	public static void main(String args[])
	{
		
		String org="abbbccbe";
		
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			
			char s1=org.charAt(i);
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			
			else
			{
				mp.put(s1, 1);
			}
			
		}
			 Set<Character> allkeys = mp.keySet();
			
//			for(Character key:allkeys)
//			{
//				System.out.println(key+":  "+mp.get(key));
//			}
			 
		
			 // for printing duplicate value only
			for(Character key:allkeys)
			{
				if(mp.get(key)>1)
				{
					System.out.println(key+": "+mp.get(key));
				}
			}
			
			
	 }
		
}
