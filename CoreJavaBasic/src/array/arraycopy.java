package array;

import java.util.Arrays;

public class arraycopy {
public static void main (String [] args) {
	int arr []= {9,3,6};
	System.out.println("length of array is: "+arr.length);
	System.out.println("printing original array");
	for (int num:arr) {
		System.out.print(num+" ");
		System.out.println();
	}
	System.out.println("printing clone array");
	int carr[]=arr.clone();
	for(int num1:carr) {
		System.out.println(num1+" ");
		}
	System.out.println("are both array equal");
	System.out.println(Arrays.equals(arr, carr));
	System.out.println("**************************");
	
	int newcopyedarray[]=Arrays.copyOf(arr,arr.length);
	for(int num2:newcopyedarray) {
		System.out.println(num2);
	}
	System.out.println("**************************");
	int newcopyedrangearray[]=Arrays.copyOfRange(arr,0,8);
	for(int num2:newcopyedarray) {
		System.out.println(num2);
		System.out.println("Comparing newCopiedRangeArray & newCopiedArray : "
				+Arrays.equals(newcopyedrangearray, newcopyedrangearray));	
	}
	System.out.println("**************************");
	
	Arrays.sort(arr);
	System.out.println("after sorting array");
	for(int num3:arr) {
		System.out.println(num3);
	}
}
}
