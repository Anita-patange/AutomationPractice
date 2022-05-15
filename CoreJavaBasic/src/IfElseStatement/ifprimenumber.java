package IfElseStatement;
 
import inharitance2.*;

public class ifprimenumber {
public static void main (String [] args) {
	fruit f=new fruit();
	f.disply();
	 
	
	/*
	 * num==2, num % num ==0, num!=0,num!=1;
	 */
	int num = 1;
	if(num ==0 || num==1) {
		System.out.println("Number is not prime "+num);
	}else if (num % num == 0){
		System.out.println("Number is prime");
	}else {
		System.out.println();
	}
}
}
