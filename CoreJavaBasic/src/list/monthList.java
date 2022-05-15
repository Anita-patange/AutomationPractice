package list;

import java.util.ArrayList;

public class monthList {
	
	public static void main (String [] args) {
		ArrayList list = new ArrayList();
		
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("june");
		list.add("july");
		list.add("august");
		list.add("september");
		list.add("october");
		list.add("november");
		list.add("december");
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
