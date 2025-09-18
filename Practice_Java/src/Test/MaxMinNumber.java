package Test;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = {7,18,4,57,9,39};
		
		int max =  numArr[0];
		int min = numArr[0];
		
		for(int num : numArr)
		{
			if(num < min)
			{
				min = num;
			}
			
			if(num > max)
			{
				max = num;
			}
		}
		

       
		
		System.out.println("minimum number =" + min );
		System.out.println("maximum number =" + max );


	}

}
