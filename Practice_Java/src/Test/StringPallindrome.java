package Test;

import java.util.Scanner;

public class StringPallindrome {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter word");
	 String org = sc.next();
	
	 StringBuffer sb = new StringBuffer(org);
	String reverse =  sb.reverse().toString();
	System.out.println("Reverse word " + reverse);
	 
	 if(org.equals(reverse))
	 {
		 System.out.println("it is a pallindrome");
	 }
	 
	 else
	 {
		 System.out.println("it is not a pallindrome");
	 }
	
	
			

}
}