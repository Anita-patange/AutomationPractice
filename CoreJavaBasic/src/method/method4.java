package method;

public class method4 {
	
	
static double getadditionresult(double num1,double num2) {
	System.out.println("number1 is:"+num1);
	System.out.println("number2 is:"+num2);
  double res=num1+num2;
    return res;
}
public static void main(String[]args) {
	System.out.println("result of addition 1:"+getadditionresult(150.23,50));
	System.out.println("result of addition 2:"+getadditionresult(250,50));
	double sum=getadditionresult(50,97);
	System.out.println("result of addition 3:"+sum);
	double finalresult=sum*100;
	System.out.println("final result:"+finalresult);
	System.out.println("final result:"+getadditionresult(49.5,105)+"addition:/n"+sum+"final result:"+finalresult);
}

}