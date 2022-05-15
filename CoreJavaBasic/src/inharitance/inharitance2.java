package inharitance;

 

public class inharitance2 {
	public static void main (String [] args) {
		
		fruit f=new fruit();
		f.disply();
		apple a2=new apple();
		a2.disply();
		orange o=new orange();
		o.disply();
		
	}

}
class fruit {
	public fruit(){
		System.out.println("i am class fruite");
		}
	void disply() {
		System.out.println("i am disply of fruite");
		System.out.println("**************************************");
		
	}
}
	
class apple extends fruit {
	
	apple(){
		System.out.println("i am cons of class apple");
	}
	void disply() {
		System.out.println("apple is round");
		System.out.println("apple is red");
		System.out.println("**************************************");
	}
}
class orange extends apple {
	orange(){
		System.out.println("i am cons of class orange");
	}
	void disply() {
		System.out.println("orange is sweet");
		System.out.println("orange is of orange colour");
		System.out.println("**************************************");
	}
	
}
