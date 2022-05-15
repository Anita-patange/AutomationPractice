package method;
 
//Method1.java
//Last week
//Thu 8:06 AM

//Shailesh Kumar moved an item to
//Google Drive Folder
//Programs
//Java
//Method1.java
//Thu 8:05 AM

//Shailesh Kumar uploaded an item
//Java
//Method1.java
 

public class Method1 {

	/*
	 * accessmodifier:public
	 * non-accessmodifier:non static
	 * return type:not present
	 * methodName:method 1
	 * argument/parameter:not present
	 * return value:not present
	 */
	private static int getEmpName(int id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:privet
	 * non-accessmodifier:static
	 * return type:int
	 * methodName:getEmpName
	 * argument/parameter:int
	 * return value:id
	 */
	public static int getEmpContact(short id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:public
	 * non-accessmodifier:ststic
	 * return type:int
	 * methodName:getEmpContact
	 * argument/parameter:short
	 * return value:id
	 */
	static protected double getEmpPin(long id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:protected
	 * non-accessmodifier:static
	 * return type:double
	 * methodName:getEmpPin
	 * argument/parameter: long
	 * return value:id
	 */
	static int getEmpAccount() {
		//statement
		return 25;
	}
	/*
	 * accessmodifier:default
	 * non-accessmodifier:static
	 * return type:int
	 * methodName:getEmpAccount
	 * argument/parameter:empty
	 * return value:25
	 */
	public static void main(String[] args) {
		
		//return;//by default written by java compiler at the time of compilation
	}
	/*
	 * accessmodifier:public
	 * non-accessmodifier:static
	 * return type:void
	 * methodName:main
	 * argument/parameter:args 
	 * return value:empty
	 */
	void addTwoNumbers() {
		int num1=25,num2=50,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
	/*
	 * accessmodifier:default
	 * non-accessmodifier:non static
	 * return type:void
	 * methodName:twonumbers
	 * argument/parameter: empty
	 * return value:empty
	 */
	private double addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		return res;
	}
}
/*
 * accessmodifier:privet
 * non-accessmodifier:non static
 * return type:double
 * methodName:addtownumber
 * argument/parameter:int
 * return value:res
 */