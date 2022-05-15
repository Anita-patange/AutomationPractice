package abstract1;

public class bank {
	public static void main (String[] args) {
		System.out.println("program start");
		PNB p=new PNB();
		p.disply();
		p.rateofintrest();
		System.out.println("rate of intrest for SBI is"+p.rateofintrest());
		
		SBI s=new SBI();
		s.disply();
		s.rateofintrest();
		System.out.println("rate of intrest for SBI is"+s.rateofintrest());
		System.out.println("program end");
	}

}
abstract class RBIbank{
    abstract float rateofintrest() ; 
	
	public void loan(){
		System.out.println("home loan rate of intrest");
		
	}	
}

class SBI extends bank{
	float rateofintrest() {
		return 6.5f;
	}
	public void disply () {
			System.out.println("rate of intrest for SBI");
		}
	}

class PNB extends bank{
	float rateofintrest() {
		return 7.5f;
	}
	public void disply() {
		System.out.println("rate of intrest for PNB");
	}
}