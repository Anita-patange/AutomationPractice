package obj;

class demo{
	void disply() {
		System.out.println("I am display()..");
	}
}


public class object3 extends demo {
	
	static int last_rolls=100;
	int roll_no;
	
	 //constructor
	object3(){
		roll_no=last_rolls;
		last_rolls++;
	}
	
	
	
	public static void main (String[] args) {
		
		object3 c1=new object3();
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		System.out.println("*********************************");
		demo d1=new demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
		System.out.println("*********************************");
		demo d2=new object3();
		System.out.println(d2);
		d2.disply();
		System.out.println(d2.toString());
		System.out.println(d2.hashCode());
	}

}
