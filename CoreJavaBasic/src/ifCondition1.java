
public class ifCondition1 {
	public static void main (String [] args) {
		int num1=45, num2=30;
		if (!(num1 == num2)) {
			System.out.println(" number 1 is not equal to number 2");
			}else {
				System.out.println(" number 1 is equal to number 2");
			}
		if (num1 > num2) {
			System.out.println(" number 1 is greter than to number 2");
		}else {
			System.out.println(" number 1 is smaller than to number 2");
		}
		if (num1 >= num2) {
			System.out.println(" number 1 is either greter than or equal to number 2");
		}else {
			System.out.println(" number 1 is smaller than number 2");
		}
		if (num1 == num2 || num1 > num2) {
			System.out.println(" number 1 is either equal to number 2 or greter than no 2");
		}else {
			System.out.println(" number 1 is smaller than number 2");
		}
		if (num1 == num2) {
			System.out.println(" number 1 is equal to number 2");
		}else if (num1>num2) {
			System.out.println(" number 1 is greter than to number 2");
			}else {
				System.out.println(" number 1 is smaller than number 2");	
			}
		int sub1=50, sub2=30;
		if (sub1>35 && sub2>35) {
			System.out.println(" pass");
		}else {
			System.out.println(" fail");
		}
	}

}
