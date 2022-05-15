package wrapperClass;

public class boxing2 {
	public static void main (String []args) {
		
		char c1= 's';
		
		Character charObj1=new Character(c1);
		System.out.println(c1==charObj1);
		
		//System.out.println(Obj1);
		
		Character charObj2=new Character('b');
		
		Character charObj3='a';
		
		System.out.println("c1: "+c1);
		
		System.out.println("charobj1: "+charObj1);
		
		System.out.println("charobj2: "+charObj2);
		
		System.out.println("charobj3: "+charObj3);
		
	}
}
