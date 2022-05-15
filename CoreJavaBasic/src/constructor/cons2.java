package constructor;

public class cons2 {
	 int age=27;
	double salary=10000;
	cons2(int a, double s){
		age=a;
		salary=s;
	}
		void disply2() {
		System.out.println("double parameter constrictor age:"+age+ "salary:"+salary);
		}
	
	
	void disply() {
		System.out.println("age is:"+age);
		System.out.println("age salary:"+salary);
	}
	
	cons2(){
		System.out.println("zero parameter constructor");
	}
	
	cons2(int age){
		System.out.println("single parameter constructor age :"+age);
	}
	
	
 
	cons2(double age, int salary, int rent){
		System.out.println("multipal parameter constructor");
		System.out.println("age is:"+age);
		System.out.println("age salary:"+salary);
		System.out.println("rent is:"+rent);
	}
	
	public static void main (String[] args) {
		
		cons2 c1=new cons2(25);
		cons2 c2=new cons2(35,15000);
		c2.disply2();
		cons2 c5=new cons2(25,25000);
		c5.disply2();
		cons2 c3=new cons2(50.50,150,50);
		cons2 c4=new cons2();
		System.out.println("age is:"+c4.age);
		System.out.println("age salary:"+c4.salary);
		 c4.disply();
	}
 }
