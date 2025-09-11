package Test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 28;
		
		boolean isPrime = true;
		
		if(a <= 1)
		{
			isPrime = false;
		}
		
		else
		{
			for(int i = 2 ; i<=Math.sqrt(a); i++)
			{
				if(a % i == 0) 
				{
				isPrime = false;
				break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	
	}

}
