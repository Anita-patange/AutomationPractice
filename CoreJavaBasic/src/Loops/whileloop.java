package Loops;

public class whileloop {
	
	whileloop(int month){
		 
		switch(month) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("februvry");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		}
}
	public static void main (String [] args) {
		 whileloop w1=new whileloop(4);
		 
		int c=-3;
		do {
			System.out.println("value of c is "+c);
			++c;
		}
		while (c>0);
		
		 int day=30;
		do {
			System.out.println("day"+day+"continue to play");
		day++;
		}while (day<=30);
		
		int day1=40;
		if (day1<=30) {
		System.out.println("day"+day1+"continue to play");
	} else {
		System.out.println("you are not allow to play");
	}
	
		
				
				
				int a=50, b=30,res;
				char op='-';
				switch (op){
				case '+': 
					res = a+b;
					System.out.println("addition is:"+res);
					break;
				case '-':
					res = a-b;
					System.out.println("subtraction is:"+res);
					break;
				case '*':
					res = a*b;
					System.out.println("multiplication is:"+res);
					break;
				case '/':
					res=a/b;
						System.out.println("division is:"+res);
						break;
				default:
					System.out.println("operation dose not match");
				
				}
	}
}
