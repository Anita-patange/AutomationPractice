package operater;

public class unaryop {
	public static void main (String [] args) {
		int r=6;
		System.out.println("r=: " + r++);//6
		System.out.println("r=: " + r);//7
		
		System.out.println("r=: " + r--);//7
		System.out.println("r=: " + r);//6
		
		System.out.println("r=: " + ++r);//7
		System.out.println("r=: " + r);//7
		
		System.out.println("r=: " + --r);//6
		System.out.println("r=: " + r);//6
	}

}
