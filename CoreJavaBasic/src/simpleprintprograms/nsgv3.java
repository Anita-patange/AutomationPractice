package simpleprintprograms;

public class nsgv3 {
 int empid;
 static double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		 
		System.out.println("static global variable:"+ salary);
		System.out.println(" std way static global variable:"+ nsgv3.salary);
		 nsgv3 g2=new nsgv3();
		System.out.println("non static global variable:"+ g2.empid);
		nsgv3.salary=45000.56;
		System.out.println("updated static global variable:"+ salary);
		System.out.println("updated  std way static global variable:"+ nsgv3.salary);
		g2.empid=789; 
		 
		System.out.println("updated non static global variable:"+ g2.empid);
	 
		System.out.println("program end");
	}

}
