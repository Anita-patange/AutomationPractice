
public class ifcondition2 {
	public static void main (String [] args) {
		int marks=95;
		if (marks<50) {
			System.out.println(" faill");
		}else if (marks>=20 && marks<60) {
			System.out.println(" D grade");
		}else if (marks >=60 && marks <70) {
			System.out.println(" C grade");
		}else if (marks >=70 && marks <80) {
			System.out.println(" B grade");
		}else if (marks >=80 && marks<100) {
			System.out.println(" A grade");
		}else {
			System.out.println("invalid");
		}
	}

}