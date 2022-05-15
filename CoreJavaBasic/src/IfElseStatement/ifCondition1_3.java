package IfElseStatement;

public class ifCondition2 {
	public static void main (String [] args) {
		int year=2020;
		if (((year % 4 ==0) && (year % 100!=0)) || ( year % 400==0)){
			System.out.println("LEAP YEAR 2020");
			
			}else {
				System.out.println("NOT LEAP YEAR 2020");	
			}
		System.out.println("GIVEN YEAR IS LEAP YEAR OR NOT 1"+checkleapyear(2025));
		System.out.println("GIVEN YEAR IS LEAP YEAR OR NOT 2"+checkleapyear(2020));
	}
	
	static boolean checkleapyear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
			return true;
		}else {
			return false;
		}
	}

}
