package Test;

import java.util.HashSet;
import java.util.Set;


public class FindDuplicateArrayWithHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 1, 4, 5};
        
       // A HashSet doesn't allow duplicates.
        //It automatically checks whether a number is already in it.
        //If they’re not on the list → you add them (seen.add(num)).
        //If they are already on the list → you don’t add them again — they’re a duplicate!

        Set<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        
       for(int num : arr)
        {
    	 //!seen = !true -> false //add- 1 for 1st time true ---> !true -> not execute 
			//!seen = !False -> True //add - 1 2nd time false bcoz hashset has unique value , !false -> True
        	if(!seen.add(num))  
        	{
        		// True --> execute
        		 duplicate.add(num);
        	}
        	

        			
        }
       
       System.out.println(duplicate);

        

	}

}
