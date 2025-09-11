package Test;

import java.util.HashMap;
import java.util.Map;

public class Occurrences_Char {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "cuttck";
		
		Map<Character , Integer> charcount = new HashMap<>();
		
		for(char ch : str.toCharArray())
		{
			
			charcount.put(ch , charcount.getOrDefault(ch, 0) + 1);
		}
		
        System.out.println("Character Occurrences:");
	        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
	            System.out.println(entry.getKey() + " → " + entry.getValue());
	        }
	}

}
