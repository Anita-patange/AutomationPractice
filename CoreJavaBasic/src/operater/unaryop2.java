package operater;

public class unaryop2 {
	public static void main (String []args) {
	int a=47,b;
	b=a++;
	System.out.println("a= "+a);//48
	System.out.println("b= "+b);//47
	
	int x = a;
	System.out.println("x= "+x);//48
	int y;
	y=x++;
	System.out.println("y= "+y);//48
	System.out.println("**************************************");
	
	int p=15, q=36, res;
	res=++p +q--;
	System.out.println("res= "+res);//-20
	System.out.println("p= "+p);//16
	System.out.println("q= "+q);//35
	
	
	
	}
	
	 
	
	

}
