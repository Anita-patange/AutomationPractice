package assignment;

public class all {

	static int age=50000;
	double salary=50000.69;
	
 class Flower{
	int qty;
	double rate;
	void disply () {
		System.out.println("quantity of the flower is :"+qty);	
	}
		 
	Flower (double amount ){
	
	System.out.println("rate of the flower is:"+amount);
	 	
	}
	Flower (char grade){
	
	System.out.println("rate of the flower is:"+grade);
	}
	
	public void colour(char r) {
		System.out.println("red colour is reprecent as r");
		System.out.println("rose is red flower");
	}
	
	public void colour(double b) {
		System.out.println("b is for colour blue");
	}
		
	}
public static void main (String [] args) {
	all a1= new all();
	Flower f1= new Flower();
	
}
}
class rose{
	
}
