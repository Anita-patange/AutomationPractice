package obj;

class demo2{
	int a=10;
	//Override by object class
	public int hashCode() {
		return 101;
	}
	//Override by object class
	public String toString() {
		return "i am demo2 class toString";
	}
	//Override by object class
	public boolean equals (Object obj) {
		demo2 d1=(demo2)obj;//new demo2
		return (this.a==d1.a);//10==10
		
	}
}

public class object4 {
	static int lastroll=100;
	int rollno;
	
	object4() {
		rollno=lastroll;
		lastroll++;
		
	}
	
public static void main (String[] args) {
Object obj;
object4 o1=new object4();
System.out.println("s: toString of Object4: "+o1);
System.out.println("s: hash code of Object4: "+o1.hashCode());
System.out.println("lastroll is: "+lastroll);
System.out.println("rollno is: "+o1.rollno);
System.out.println("*********************************");

demo2 d1=new demo2();
System.out.println("s: toString of Object4: "+d1);
System.out.println("s: hashcode of Object4: "+d1.hashCode());
System.out.println("s: equals to of demo2: "+d1.equals(d1));
System.out.println("s: equals to of Object4 and demo2: "+o1.equals(d1));
System.out.println("*********************************");

demo2 d2=new demo2();
System.out.println("s: equals  of demo2: "+d1.equals(d2));

System.out.println("*********************************");

}
}
