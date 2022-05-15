package wrapperClass;

public class unboxing {
	
 public static void main (String []args) {
	double db= 50000;//auto boxing
	System.out.println("db: "+db);
	
	double salary= new Double(db);//unboxing
	System.out.println("SALARY: "+salary);
	
	int age=26;
	Integer i1=new Integer(28);
	Integer i2=new Integer(age);
	int i3=30;
	System.out.println("i3: "+i3);
	System.out.println("age: "+age);
	System.out.println("i1: "+i1);
	System.out.println("i2: "+i2);
	
	
	
	 }																																									
}
