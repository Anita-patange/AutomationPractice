package method;

public class method5 {
public static void main(String[] args) {
	System.out.println("get simple intrest:"+getintrest(25000, 6.5, 60));
	System.out.println("get simple intrest:"+getintrest1(35000, 7.5, 80));
	double res=method5.getintrest(25000,6.5,60);
	System.out.println("intrest is:"+res);
}
public static double getintrest(int p, double r,int t) {
return (p*r*t)/100;
}
public static double getintrest1 (int p,double r,int t) {
	double res=(p*r*t)/100;
	return res;

}
public static void getintrest2 (int p,double r,int t) {
	double res=(p*r*t)/100;
	System.out.println("intrest is:"+res);
	
	
}

}
