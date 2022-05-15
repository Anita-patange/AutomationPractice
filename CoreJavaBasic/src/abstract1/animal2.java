package abstract1;

public class animal2 {
	public static void main (String[] args) {
		cat c1=new cat();
		c1.name();
		c1.colour();
		System.out.println("no of cat we have is"+c1.n);
		//animal h1=new hors();
		//h1.name();
		//h1.colour();
		property pro=new property();
		pro.output();
		pro.input();
	}
}

abstract class animal{
	abstract void name(); 
	abstract void colour();	 
}

class cat extends animal{
	int n=5;
	void name() {
		System.out.println("i am cat");
	}
	void colour() {
		System.out.println("cat have gray clour");
	}
	void sound() {
		System.out.println("cat say meau meau");
	}


public class hors extends animal{
	void name() {
		System.out.println("a am hors");
	}
	
	void colour() {
		System.out.println("cat have brown colour");
	}
}
	 
		 
}
abstract class ship{
	abstract void output();
	abstract void input();
}

class property extends ship{
	void output() {
		System.out.println("ship give wool and milk");
	}
	void input() {
		System.out.println("ship eat grass");
	}
	
}






