package simpleprintprograms;

public class nsgv2 {
 int empid=123;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		nsgv2 v1;
		v1=new nsgv2();
		System.out.println("non static global variable:"+ v1.empid);
		v1.empid=456;
		System.out.println("updated non static global variable:"+ v1.empid);
		 
		 
	 
	 
		System.out.println("program end");
	}

}
