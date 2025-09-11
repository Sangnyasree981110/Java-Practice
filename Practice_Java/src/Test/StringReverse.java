package Test;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Hello";
		
		String reverse = "";
		
		for(int i = original.length()-1; i >= 0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println( reverse);
				
		
		
}
}