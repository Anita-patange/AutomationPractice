package system;


public class System1 {
	System1(){
		System.out.println("constructor of system1 class");
	}
    void manualtstting() {
	 System.out.println("i am manualtesting method");
 }
    void automationtesting() {
    	System.out.println("i am automation tstng method");
    }
 
}

class system2{
	static System1 s1=new System1();
	public static void main(String[] args) {
	
	system2.s1.manualtstting();
	system2.s1.automationtesting();
	
}
}