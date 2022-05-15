package ExceptionHandling;

public class Ex {
	public static void main (String [] args) {
		try {
			int i=1/0;
		}catch(Exception i1) {
			System.out.println("exception: "+i1);
		
		}finally {
			System.out.println("fixed exception");
		}
	}

}

class ex2 extends Ex{
	//public Ex(String str) {
		//super (str);
	}
	


