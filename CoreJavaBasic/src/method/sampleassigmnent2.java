package method;

public class sampleassigmnent2 {
	static char section='A';
	int labNo=1;
	
public static void main(String [] args) {
	
	//access of static and non static method
	
	System.out.println("addition1:"+addition(50,150));
	System.out.println("addition1:"+ sampleassigmnent2.addition(550,300));
	
	sampleassigmnent2 m1=new sampleassigmnent2();
	System.out.println("addition1:"+m1.addition(25.50f,10.20));
	
	//access of static and non static global variable
	 
	System.out.println("working at sention "+section);
	assignment2 a2=new assignment2();
	
	System.out.println("lab number "+a2.labNo);
	
}


static double addition(int num1, int num2) {
    int res =num1+num2;
	return res;
	
}
double addition( float num3,double num4) {
	
	double res=num3+num4;
	 return res;
}
}

