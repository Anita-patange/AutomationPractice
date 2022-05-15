package array;

public class arr3 {
	public static void main (String [] args) {
		//int number[];
		//number=new int[10];
		int [] number= {10,-5,20,-7,-9,96,8,52,21,43};
		
		
		
		double sum=0;
		double avarage;
		
		for(int add:number) {
			sum=sum+add;
		}
        int arraylength= number.length;		
        avarage=sum/arraylength;
        System.out.println("sum of array is: "+sum);
        System.out.println("avarage of array is: "+avarage);
        System.out.println("************************************");
        
        
        
		for (int num1:number) {
			System.out.println(num1);
		}
		System.out.println("length of the array is: "+number.length);
		System.out.println("************************************");
		
		System.out.println("number 1 is: "+number[0]);
		System.out.println("number 2 is: "+number[1]);
		System.out.println("number 3 is: "+number[2]);
		System.out.println("number 4 is: "+number[3]);
		System.out.println("number 5 is: "+number[4]);
		System.out.println("number 6 is: "+number[5]);
		System.out.println("number 7 is: "+number[6]);
		System.out.println("number 8 is: "+number[7]);
		System.out.println("number 9 is: "+number[8]);
		System.out.println("number 10 is: "+number[9]);
		System.out.println("************************************");
		test.min(number);
		System.out.println("************************************");
		test.max(number);
		System.out.println("************************************");
	}
}

class test{
	static void min(int number[]) {
		int min=number[0];
		for(int j=1;j<number.length;j++) {
			if(min>number[j]) {
				min=number[j];
			}
			System.out.println("smallest number of array is: "+min);
		}
	}
	
	static void max(int number[]) {
		int max=number[0];
		for(int j=1;j<number.length;j++) {
			if (max<number[j]) {
				max=number[j];
			}
			System.out.println("largest number of array is: "+max);	
		}
	}
}









