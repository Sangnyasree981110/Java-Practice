package Test;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = {1,2,4,5};
		
		int n = numArr.length + 1;
		int actualSum = n * (n + 1) /2;
		
		int arraySum = 0;
		
		for (int num : numArr)
		{
			arraySum = arraySum + num;
		}
		
		int missingNum = actualSum -arraySum;
		System.out.println(missingNum);
	}

}
