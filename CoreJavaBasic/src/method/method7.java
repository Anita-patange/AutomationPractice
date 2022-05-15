package method;

public class method7 {
	public static void main(String[] args) {
		System.out.println("program start");
		method7 m1=new method7();
		m1.additionoftwono(50,20);
		
       int res=m1.getadditionoftwono(20,30);
       System.out.println("result:"+res);
		double total=res*100;
		System.out.println("total:"+total);
	}
public void additionoftwono (int a, int b) {
int res=a+b;
System.out.println("addition of two no:"+res);
}
public int getadditionoftwono(int p,int t) {
	int res=p+t;
	return res;
	
}
}