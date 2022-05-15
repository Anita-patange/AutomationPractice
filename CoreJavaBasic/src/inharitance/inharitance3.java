package inharitance;

public class inharitance3 {
	public static void main(String [] args) {
		son s=new son(20);
		s.bike();
		s.car();
		s.home();
		father f=s;
		
		f.home();
		f.car();
		
		grandfather g=f;
		g.home();
		
		
	}

}
class grandfather{
	grandfather(){
		System.out.println("i am cons of grand father");
	}
		void home() {
			System.out.println("i am home of grandfather");
			System.out.println("**************************************");
		}
	
}
class father extends grandfather{
	father(double d){
		super();
		System.out.println("i am cons of class father");
	}
	void car() {
		System.out.println("i am car of father");
		System.out.println("**************************************");
	}
	
}

class son extends father{
	son(int i){
		super(50.20);
		System.out.println("i am cons of class son");
	}
	void bike() {
		System.out.println("son have bike");
		System.out.println("**************************************");
	}
}