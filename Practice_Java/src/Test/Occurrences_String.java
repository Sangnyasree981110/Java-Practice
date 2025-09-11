package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurrences_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String item : list)
		{
			map.put(item, map.getOrDefault(item, 0) + 1);
		}
		
		
		 System.out.println("Occurrences in List:");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " → " + entry.getValue());
	        }
	}

}
