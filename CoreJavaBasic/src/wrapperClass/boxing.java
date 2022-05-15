package wrapperClass;

public class boxing {
	public static void main (String[] args) {
		int age=25;
		Integer obj=50; //auto boxing
		System.out.println("age: "+age);
		System.out.println("obj: "+obj);
		
		Integer obj2=new Integer(60);//explisit boxing
		Integer obj3=new Integer(age);
		
		System.out.println("obj2: "+obj2);
		System.out.println("obj3: "+obj3);
		
		char gred='A';//
		Character charc2=new Character('S');//explicit boxing
		Character charc3='P';//
		Character charC4=new Character(charc3);//
		Character charc5=new Character(gred);//
		
		System.out.println("c2: "+charc2);
		System.out.println("c3: "+charc3);
		
		System.out.println("C4: "+charC4);
		System.out.println("c5: "+charc5);
		
		
		}

}
