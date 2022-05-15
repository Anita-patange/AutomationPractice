package constructor;

public class this1 {
	
	int age=25;
	double salary=25000;
	
	this1(int age, double salary){
		System.out.println("global variable age="+this.age);
		System.out.println("local variable age ="+age);
		System.out.println("global variable salary="+this.salary);
		System.out.println("global variable salary="+salary);
	}
	
	
	public static void main (String [] args) {
		final double time=10.5;
		  final int age=30;
		double salary=45000;
		this1 t1=new this1(20, 35000);
		System.out.println("global variable age="+t1.age);
		System.out.println("global variable salary="+t1.salary);
		System.out.println("local variable age="+age);
		System.out.println("local variable salary="+salary);
		 System.out.println("time is :"+time);
		 
		A1 a1=new A1();
		a1.m();
		a1.n();
		B1 b1=new B1();
		b1.m();
		b1.n();
		c1 c2=new c1(500);
		
		c2.method(01.01);
		speed s1=new speed();
		
		
	}

}

class A1{
	void m() {
		System.out.println("i am  M void method OF CLASS A");
	}
	void n() {
		System.out.println("i am  N void method OF CLASS A");

	}
}

class B1{
	void m() {
		System.out.println("i am  M void method OF CLASS B");
	}
	void n() {
		System.out.println("i am  N void method OF CLASS B");

	}
	
	
}


class c1{
	
	int ref=369;
	double id=05.02;

		c1(int ref){
	
		 
		 System.out.println("local variable refrance id="+ref);
		 System.out.println("global/instance refrance id="+this.ref);
		 ref=501;
		 System.out.println("local variable refrance id="+ref);
		 System.out.println("global/instance variable refrance id="+this.ref);
		 ref=ref;
		 System.out.println("local variable refrance id="+this.ref);
	 }
	 void method(double id) {
		 System.out.println("local variable refrance id="+id);
		 System.out.println("global/instance refrance id="+this.id);
		 id=02;
		 System.out.println("local variable refrance id="+id);
		 System.out.println("global/instance variable refrance id="+this.id);
		 id=id;
		 System.out.println("local variable refrance id="+this.id);
		 
	 }
}

class speed{

	final int limit;
	speed(){
		limit=80;
	
		 System.out.println("speed limit should be:"+limit);
		
	}
	
	 
}


	
	
	
	
	
	
	
	
