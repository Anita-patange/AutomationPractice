package simpleprintprograms;

public class sgv3 {
static double empid=123;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		int age=30,empid=800;
		System.out.println("local variable age:"+age);
		System.out.println("local variable empid:"+empid);
		age=45;
		System.out.println("updated local variable age:"+age);
		System.out.println("static global variable enp ID:"+sgv3.empid);
		empid=456;
		System.out.println("updated local variable empid:"+empid);
		sgv3.empid=400;
		System.out.println("Updated static global variable enp ID:"+sgv3.empid);
		
	 
		System.out.println("program end");
	}

}
