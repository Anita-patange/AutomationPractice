package string;

public  class immutableClass {
	public static void main(String[] args) {
		immutable2 im=new immutable2("anita",80000);
		System.out.println(im.getName());
		System.out.println(im.getSalary());
		
		immutable2 im2=new immutable2("shubham",100000);
		System.out.println(im2.getName());
		System.out.println(im2.getSalary());
	}
	
}

 final class immutable2{
	 final String name;
		final double salary;																			
		immutable2 (String s1,double num1){
			name=s1;
			salary=num1;
		}
		

		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
	 
 }