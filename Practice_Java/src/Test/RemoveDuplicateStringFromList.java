package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateStringFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> duplicateArray = Arrays.asList("apple", "orange", "apple", "apple", "banana", "orange");
		
		Set<String> set = new HashSet<>(duplicateArray);
		
		List<String> duplicateWithoutArray = new ArrayList<>(set);
		
		System.out.println(duplicateWithoutArray);
				
		

	}

}
