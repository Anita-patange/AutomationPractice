package interface1

public class inter1 {
	public static void main (String[] args) {
		property1 p1=new property1();
		p1.name();
		property2 p2=new property2();
		p2.name();
		p2.test();
		leaf l1=new property3();
		l1.size();
		flower f2=new property3();
		f2.name();
	}
}

interface flower{
	abstract void name();
}

interface fruite{
	abstract void test();
}
abstract class leaf{
	abstract void size();
}

 class property1 implements flower{
	public void name() {
		System.out.println("i am rose");
	}
 
}
 class property2 implements flower,fruite{
	 public void name() {
		 System.out.println("i am lotus");
		 System.out.println("i am pink in colour");
	 }
	 public void test() {
		 System.out.println("i am mango");
		 System.out.println("i am sweet");
	 }
 }
 
 class property3 extends leaf implements flower{
	 public void size() {
		 System.out.println("i am small size leaf");
	 }
	 public void name() {
		 System.out.println("i am leaf of strawberry");
	 }
	 
 }