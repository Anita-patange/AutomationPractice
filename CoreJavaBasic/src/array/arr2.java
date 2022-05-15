package array;

public class arr2 {
	public static void main (String [] args) {
		int age[]= {15,20,25,30};
		for(int num1:age) {
			System.out.println(num1);
			if(num1==25) {
				System.out.println(num1);
				break;
			}
			else {
				System.out.println("age is not 25");
			}
			
				
		}
		
		System.out.println("*****************************");
		for(int num1:age) {
			System.out.println(num1);
		}
		System.out.println("*****************************");
		
		for (int i=0;i<=age.length;i++) {
			System.out.println(age[i]);
			
		}
		 int [] copyTo=new int [7];
		 System.arraycopy(age, 2, copyTo, 0, copyTo.length);
		 for(int i=0;i<copyTo.length;i++) {
				System.out.println(copyTo[i]);
			}
    }
}