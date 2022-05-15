package operater;

public class unaryop3 {
	public static void main (String [] args) {
		int a=0, b;
		b=a++ + ++a + ++a + a;
		System.out.println("a: "+a);//3
		// b= 0+2+3+3=8
		System.out.println("b: "+b);//8
		
		System.out.println("**********************************");
		
		a= -5;
		b = a-- + --a + --a + a;
		//b=-5+-7+-8+-8
		System.out.println("a: "+a);//-8
		System.out.println("b: "+b);//-28
		
		System.out.println("**********************************");
		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		//b= 20+19+18+18+19+19
		System.out.println("a: "+a);//20
		System.out.println("b: "+b);//113
		
		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		//b= -2+-3+-2+-2+
		System.out.println("a: "+a);//1
		System.out.println("b: "+b);//-8
		
	}

}
