package constructor;

 public class cons4 {
	 	void disply() {
System.out.println("Main() of Class Cons4 is started...");
	 	}
public static void main(String args[]) {
	 cons4 c1 =new cons4();
	 c1.disply();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	X x1=new X();
	x1.disply();
	System.out.println("class X global variable is i:"+x1.j);
	A a1=new A();
	a1.disply();
	System.out.println("class A global variable is i:"+a1.i);
	
	 System.out.println("main of the cons4 ens here");
	 
	 c q1 = new c(25.20);
	 System.out.println("value of global variable of c class is :"+ q1.p);
	 	}
}
 class X{
	 int j=20;
	 X () {
			System.out.println("i am constructor of class X");
	 }
	 void disply() {
			System.out.println("i am disply of class X");
	 }
 }
 class A{
 int i;
 A(){
		System.out.println("running class A constructor ");
		i=10;
		
 }
void disply() {
System.out.println("i am disply of class A");
}
}
class c{
	double p =50.20;
	
	c(double q){
		p=q;
		System.out.println("running class c constructor "+q);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	