package method;

public class method8 {
public static void main (String[]args) {
	System.out.println("program start......");
	method8 m1=new method8();
	m1.display( 'B',30,20000);
	m1.display( 'A',30,40000);
	m1.display( 'C',30,10000);
	m1.getnumber();
	System.out.println("result"+m1);
	
	
	
}
int getnumber() {
	return 25;
}
void display() {
	System.out.println(".....display witout parameter......");
	char grade='A';
	int age=30,salary=45000;
	System.out.println("grade is"+grade);
	System.out.println("age is"+age);
	System.out.println("salary is"+salary);
	System.out.println(".....display witout parameter......");
}
void display(char grade,int age,int salary) {
	System.out.println("grade is"+grade);
	System.out.println("age is"+age);
	System.out.println("salary is"+salary);
}
void display(int age,char grade,int salary) {
	System.out.println("grade is"+grade);
	System.out.println("age is"+age);
	System.out.println("salary is"+salary);
}

}
