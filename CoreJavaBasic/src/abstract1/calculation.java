package abstract1;

public class calculation {
	public static void main (String[] args) {
	arit aa1=new addition();
	aa1.disply();
	addition a1=new addition();
	System.out.println("addition is:"+a1.operation());
	arit s1=new subtraction();
	System.out.println("subtraction is:"+s1.operation());
	multiplication m1=new multiplication();
	System.out.println("multiplication is:"+m1.operation());
	division d1=new division();
	System.out.println("division is:"+d1.operation());
	System.out.println("operations end");
	}

}

abstract class arit{
	abstract int operation ();
	
	void disply() {
		System.out.println("operations start");
		
	}
	
}
 
class addition extends arit{
	int operation() {
		int a=50;int b=25;int res;
		res=a+b;
		return res;
	}
	
}
class subtraction extends arit{
	int operation() {
		int a=50;int b=25;int res;
		res=a-b;
		return res;
	}
	
}

class multiplication extends arit{
	int operation() {
		int a=50;int b=25;int res;
		res=a*b;
		return res;
	}
	
}

class division extends arit{
	int operation() {
		int a=50;int b=25;int res;
		res=a/b;
		return res;
	}
	
}