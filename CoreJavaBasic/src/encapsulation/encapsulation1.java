package encapsulation;

class demo{
	private int empid=1111;
	private double salary=100000;
	
	public int getempid () {
		return empid;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setempid(int emp) {
		empid=emp;
		 }
	public void setsalary(double salary) {
		this.salary=salary;
	}
}

public class encapsulation1 {
	public static void main (String [] args) {
		demo d1=new demo();
		System.out.println("read only by getter method");
		System.out.println("private member empid is: "+d1.getempid());
		System.out.println("private member salary is: "+d1.getsalary());
		System.out.println("modified by setter mettod");
		d1.setempid(2222);
		d1.setsalary(200000);
		System.out.println("private member empid is: "+d1.getempid());
		System.out.println("private member salary is: "+d1.getsalary());
	}
	
}
