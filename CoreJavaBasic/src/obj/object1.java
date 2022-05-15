package obj;

public class object1 {
	
	public void disply() {
		System.out.println("i am super class disply method");
	}
	
	public void notes() {
		System.out.println("i am super class notes method");
	}
	
	public static void main(String [] args) {
		
		object1 o1=new object1();
		System.out.println(o1);
		System.out.println(o1.toString());
		System.out.println(o1.hashCode());
		o1.disply();
		o1.notes();
		//System.out.println("comparison of objects"+(equels(o1,o1.toString()));
		System.out.println("**********************************");
	object1 o2=new print();//upcasting
	
	object1 o3=o2; // downcasting
	System.out.println(o3.toString());
	System.out.println(o3.hashCode());
	o3.disply();
	o3.notes();
	
	System.out.println("**********************************");
	System.out.println(o2);
	System.out.println(o2.toString());
	System.out.println(o2.hashCode());
	o2.disply();
	o2.notes();
	System.out.println("**********************************");
	print p1=new print();
	System.out.println(p1);
	System.out.println(p1.toString());
	System.out.println(p1.hashCode());
	p1.disply();
	p1.notes();
	System.out.println("**********************************");
	object1 p2=p1;
	p2.disply();
	p2.notes();
	
		
	}
}

class print extends object1{
	//override
	public void disply() {
		System.out.println("i am sub class disply method");
	}
	
	//override
	public void notes() {
		System.out.println("i am sub class notes method");
	}
}