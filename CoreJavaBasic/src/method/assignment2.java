package method;

public class assignment2 {
	static char section='A';
	int labNo=1;
	
public static void main(String [] args) {
	
	//access of static and non static method
	information(1234567890,26);
	assignment2 a1=new assignment2();
	a1.informatiom(444,45000.50);
	
	//access of static and non static global variable
	
	System.out.println("working at sention "+section);
	assignment2 a2=new assignment2();
	
	System.out.println("lab number "+a2.labNo);
	
}


static void information(long mobno, int age) {
	System.out.println("i am " +age+ " year old");
	System.out.println("my mobile number is " +mobno);
	
}
void informatiom(int empid, double salary) {
	System.out.println("my empid is " +empid);
	System.out.println("my salary is " +salary);
}
}