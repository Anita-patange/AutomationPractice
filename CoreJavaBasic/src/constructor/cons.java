package constructor;

public class cons {
	int age=50;
	 
	cons(double salary){
		System.out.println("salary is:"+salary);
	}
	cons(int age, int no){
		System.out.println("age is:"+this.age);
		System.out.println("age is:"+age);
		System.out.println("number of people is:"+no);
	}
	public addition (double b,a) {
		 return double res;
	      res=a+b;
		System.out.println("res is:"+res);
	}
	public static void main (String [] args) {
		cons c1=new cons(15000);
		//cons c2=new cons();
		System.out.println("age is:"+c1.age);
		//cons c3=new cons(25, 5);
		cons c2=new cons(20,30);
		
		
		System.out.println("addition result is:"+c2.addition(30.2,50));
}
	 

}
