package constructor;

public class S {
		
		S(){
			this(10);
			System.out.println("hello empty");
			}
		S(int x){
			this();
			System.out.println("hello int a :"+x);
		}
		S(int a, double b){
			this(50.5,20,'S');
			System.out.println("hello int a"+a);
			System.out.println("hellow double b:"+b);
		}
		
		S(double a,int b, char c){
			this(50,500.5);
			System.out.println("double a:"+a);
			System.out.println("hellow int b "+b);
			System.out.println("hellow char c"+c);
		}
		
		public static void main (String [] args) {
			S s1=new S();
			//S s1=new S(10);
			//S s1=new S(50.5,20,'S');
			//S s1=new S(50, 500);
			
		}
	}


