package system;

import java.util.Scanner;

public class scanner1 {
	public static void main(String[]args) {
		
		Scanner abc=new Scanner(System.in);
		String name;
		int age;
		double salary;
		boolean valid;
		
		//print the name of candidate
		System.out.println("fill the name of candidate");
		name=abc.next();
		
		//print age of candidate
		System.out.println("fill age of candidate");
		age=abc.nextInt();
		
		//print salary of candidate
		System.out.println("print salary of candidate");
		salary=abc.nextDouble();
		
		//given data is valid or not
		System.out.println("given data is valid or not");
		valid=abc.hasNext();
		
		int num1,num2;
		double res;
		
		num1=abc.nextInt();
		num2=abc.nextInt();
		res=num1+num2;
		System.out.println("addition result"+res);
		
	}

}
