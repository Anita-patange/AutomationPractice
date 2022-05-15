package assignment;

public class block {
	static int age = 25;
	double salary = 15000.57;

	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		block b1 = new block();
		b1.print();//age 25 salary 1500.57
		b1.salary=45000.32;
		b1.print();//age 25 salary 45000.32
		System.out.println("main() ends..");
	}
	
	static {
		age=35;
	}

}
