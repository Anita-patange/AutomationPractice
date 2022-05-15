package Loops;

public class dowhile1 {
	public static void main(String [] args) {
		int c=-22;
		do {
			System.out.println("value of c"+c);
			++c;
		}
		while (c>0);
		System.out.println("value of c should be greter than 0");
		
		int day=5;
		do {
			System.out.println("day:"+day+"continue to play");
			 day++;
		} while (day<=30);
	}

}
