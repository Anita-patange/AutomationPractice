package inharitance;


public class Animal1 {
	
	public static void main (String [] args) {
		tiger t1=new tiger();
		t1.animal();
		t1.tiger();
		dog d1=new dog();
		d1.animal();
		d1.dog();
		animal a1=new animal();
		a1.animal();
		apple a2=new apple();
		
	}
}
	class animal {
		void animal(){
			System.out.println("i am class animal");
			}
		}
	class dog extends animal{
		void dog(){
			System.out.println("dog is pet animal");
		}
	}
	class tiger extends animal{
		void tiger(){
			System.out.println("tiger is wild animal");
		}
		
		
		
			
			
			
			
			
			
			
		
		}
		 
	
	


