package Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharWithHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hellobaby";
		
		Set<Character> seen = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray())
		{
			if(!seen.contains(ch))
			{
				seen.add(ch);
				result.append(ch);
			}
		}
		
		System.out.println(result.toString());
		

	}

}
