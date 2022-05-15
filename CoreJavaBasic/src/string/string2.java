package string;
import java.util.Scanner;
public class string2 {
	public static void main (String [] args) {
		string2 str=new string2();
		String a="ShivajiNagarAurangabad";
		char c=a.charAt(0);
		 System.out.println("print chat boject c: "+c);
		 
		 //to print one by one charecter of string
		 for(int i=0;i<a.length();i++) {
			 System.out.println("to print one by one charecter of string: "+(a.charAt(i)));
		 }
		 System.out.println("******************************");
		 
		 //print one by one charecter from last
		 for(int i=a.length()-1;i>=0;i--) {
			 System.out.println("to print one by one charecter of string: "+(a.charAt(i)));
			 
		 }
		 System.out.println("******************************");
		 
		 String temp="";
		 for (int i=a.length()-1;i>=0;i--) {
			 temp=temp+a.charAt(i);
			 
		 }
		 System.out.println("a: "+a);
		 System.out.println("temp: "+temp);
		// System.out.println(reverseString("ShivajiNagarAurangabad"));
		 
		 String b="bangalore";
		 System.out.println("b: "+b);
		 
		 Scanner sc=new Scanner(System.in);
		 String b2;
		 System.out.println("enter string to be revers");
		 b2=sc.next();
		 try {
		// System.out.println("reverce string is: "+(reverseString(b2));
		 }catch(Exception e) {
				System.out.println("Exeption handle: "+e);
				
		 }
		 String s3;
			System.out.println("Enter string to check for palindrome");
			s3=sc.next();
			//palinString(s3);
		 
		 
	}

}
