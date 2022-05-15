package method;

public class method9 {
public static void main( String[] args) {
	System.out.println("program satr...");
	method9 m1=new method9();
	double res=m1.getintrest (25000,5.6,50);
	System.out.println("intrest is"+res);
	System.out.println("intrest1 is"+m1.getintrest1(30000,5.8,80));
	m1.getintrest2(35000, 4.5, 70);
	System.out.println("program ends...");
	
}
public double getintrest(int p, double r,int t) {
	return (p*r*t)/100;
}
private double getintrest1(int p, double r, int t) {
	double res=(p*r*t)/100;
			return res;
}
void getintrest2(int p,double r, int t) {
	double res=(p*r*t)/100;
	System.out.println("intrest2 is"+res);
}

}
