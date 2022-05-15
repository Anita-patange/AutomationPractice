package obj;

public class object2 {
	
	int age=20;
	double salary=30000;
	void claculation() {
		System.out.println("calculation of age and salary of object2");
	}
	public static void main(String [] args) {
		object2 obj =new object2();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		obj.claculation();
		System.out.println("value of age object "+obj.age);
		System.out.println("value of salary object "+obj.salary);
	}
	


class anita extends object1{
	int age=25;
	double salary=40000;
	void claculation() {
		System.out.println("calculation of age and salary of anita ");
	}
}
}