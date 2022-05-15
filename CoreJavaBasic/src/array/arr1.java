package array;

public class arr1 {
	public static void main (String [] args) {
		int a[];
		a=new int[5];
		//int a=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("given value to arraay");
		a[0]=10;
		a[1]=15;
		a[2]=-10;
		a[3]=-7;
		a[4]=20;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("array element count"+a.length);
		System.out.println("using for loop");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("using for each loop");
		
		for(int num:a) {
			System.out.println(num);
		}
		
		//double salary=new double[4];
		double [] salary= {15000,20000,25000,30000};
		System.out.println(salary[0]);
		System.out.println(salary[1]);
		System.out.println(salary[2]);
		System.out.println(salary[3]);
		System.out.println("length of salary array"+salary.length);
		System.out.println("***************************	");
		for(double num1:salary) {
			System.out.println(num1);
}
}
}


