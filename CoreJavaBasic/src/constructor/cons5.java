package constructor;

public class cons5 {
	
	cons5(){
		System.out.println("constructor overloading start--------------");
		System.out.println("i am zero parameter constructor");
		System.out.println("constructor overloading end---------------");
		
	}
	cons5(int a){
		System.out.println("constructor overloading start=**************");
		System.out.println("i am int parameter constructor"+ "  "+a);
		System.out.println("constructor overloading end***************");
	}
	cons5(int a, double b){
		System.out.println("constructor overloading start++++++++++++++++");
		System.out.println("i am int and double parameter constructor"+"  "+a+"  "+b);
		System.out.println("constructor overloading end++++++++++++++++++");
	}
	cons5(char a, int b, float c){
		System.out.println("constructor overloading start--------------");
		System.out.println("i am char, int and float parameter constructor"+"  "+a+"  "+b+"  "+c);
		System.out.println("constructor overloading end------------");
	}
	cons5(int a,double b,char c, float d){
		System.out.println("constructor overloading start*****************");
		System.out.println("i am int,double,char,float parameter constructor"+a+"  "+b+"  "+c+"  "+d);
		System.out.println("constructor overloading end*******************");
	}
	
	class X{
		
		X (int x,int y,int z){
			System.out.println("sum of three="+(x+y+z));
			System.out.println("subtraction of three="+(x-y-z));
			System.out.println("multiplication of three="+(x*y*z));
			System.out.println("division of three="+(x/y/z));
			System.out.println("aljebric combination="+(x-y+z));
			System.out.println("aljebric combination="+(x*y/z));
		}
		
		
	}
	
	 
	public static void main (String [] args) {
		System.out.println("main method start");
		cons5 c1 =new cons5('a',10,50.20f);
		cons5 c2=new cons5();
		cons5 c3=new cons5(20,500.5,'s',30.50f);
		cons5 c4=new cons5(25,50000);
        X x1=new X(100,200,300);
		System.out.println("main method end");
	}

}
