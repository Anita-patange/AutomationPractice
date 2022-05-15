package IfElseStatement;

public class IfCondition1 {
public static void main (String [] args) {
	//defining the variable
	int number=55;
	//check number is devide by 2 or not
	if (number % 2==0) {
		System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
	//ststic variable access
	IfCondition1.CheckEvenOddNumber(700);
	CheckEvenOddNumber(369);
	 
}   

//static method with argument/parameter and return type
static void CheckEvenOddNumber (int num) {
	if (num%2==0) {
		System.out.println("given number is even number: "+num);
	}else {
		System.out.println("given number is odd number: "+num);	
	}
}
//static method with argument parameter and return type in boolean
	static boolean isnumberEven(int num) {
		if (num % 2 ==0) {
			return true;
		}else {
			return false;
		}
	}
//static method with no argument and return type
	static void CheckEvenOddNumber2 () {
		int num=50;
		if (num % 2 == 0) {
		System.out.println("given number is even number: "+num);
	} else {
		System.out.println("given number is odd number: "+num);	
	}
		
	}
}
