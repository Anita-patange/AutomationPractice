package Loops;

public class forloop3 {
	 public static void main (String[] args) {
	
		for (int i=0; i<5; i++) { //no of line in pyramid
			
		for (int j=0;j<=i; j++) {     //format of the pyramid
			System.out.print("*");
			
		}
		System.out.println( "  ");
	 }
	
		for (int i=0; i<5; i++) {
			
		for (int j=5; j>i; j--) {
			System.out.print("*");
		}
		System.out.println();
		}
}
}

	 