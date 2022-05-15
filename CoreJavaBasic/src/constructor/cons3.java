package constructor;

public class cons3 {
	int age;
	double salary;
	
	cons3(int a, double s){
		System.out.println("value pf age:"+a);
		System.out.println("value pf salary:"+s);
	     age=a;
		salary=s;
	}
	void disply() {
		 
			System.out.println("value pf age:"+age);
			System.out.println("value pf salary:"+salary);
			
		}
	
	
public static void main (String[] args) {
	cons3 c1=new cons3(27,10000);
	c1.disply();
	
	
}
}
