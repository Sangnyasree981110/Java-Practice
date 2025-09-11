package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateStringAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> duplicate = Arrays.asList("jackfruit", "orange", "jackfruit", "banana","orange");
		
		Set<String> set = new TreeSet<>(duplicate);
		
		List<String> noDuplicateAndSorted = new ArrayList<>(set);
		
		System.out.println(noDuplicateAndSorted);
		
		
	}

}
