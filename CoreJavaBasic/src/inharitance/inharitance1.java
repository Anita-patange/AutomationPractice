package inharitance;

public class inharitance1 {
	
	
	public static void main(String [] args) {
		{ System.out.println("**********program start**********");}
		C c1=new C();
		c1. m1();
		c1. m2();
		c1. m3();
	}

}
class A {
	 protected int a=5;
	double b=50.50;
	char c='S';
	void m1() {
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println("value of c is "+c);
		}
	 
}

class B extends A{
	int a=10;
	protected double b=100.50;
	char c='A';
	void m2() {
		System.out.println("value of a is "+super.a);
		System.out.println("value of b is "+b);
		System.out.println("value of c is "+c);
		}
	
}

class C extends B{
	int a=15;
	double b=150.50;
	protected char c='P';
	void m3() {
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println("value of c is "+super.c);
		}
	
}