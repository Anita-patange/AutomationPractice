package simpleprintprograms;

public class nsgv4 {
  static int rollnumber=147;
  static boolean result;
  double payment=55000.50;
  char grade;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		System.out.println("SGV roll no:"+rollnumber);
		System.out.println("SGV result:"+nsgv4.result);
		nsgv4 a1=new nsgv4();
		System.out.println("NSGV payment:"+a1.payment);
		System.out.println("NSGV grade:"+a1.grade);
		nsgv4.rollnumber=258;
		nsgv4.result=true;
		a1.payment=60000.50;
		a1.grade='A';
		System.out.println("updated SGV roll no:"+rollnumber);
		System.out.println("updated SGV result:"+nsgv4.result);
		System.out.println("updated NSGV payment:"+a1.payment);
		System.out.println("updated NSGV grade:"+a1.grade);
		 
	 
		System.out.println("program end");
	}

}
