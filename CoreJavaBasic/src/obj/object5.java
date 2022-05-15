package obj;

class anita{
	int b=25;
	public String toString() {
		return "overriden tostring from object class";
	}
		public int hashCode() {
			return 369;
			
		//public boolean (equals Object obj) {
			//		anita a=(anita)obj;//new anita	
				//	return (this.b==a.b); //25=25
											
		
	}
}
public class object5 {
	int age=28;
	double salary=45000;
	public static void main (String [] args) {
		anita a1=new anita();
		System.out.println("to string of anita : "+a1);
		System.out.println("hash code of anita : "+a1.hashCode());
		System.out.println("*********************************");
		
		object5 o5=new object5();
		System.out.println("to string of object5 : "+o5);
		System.out.println("hash code of object5 : "+o5.hashCode());
		System.out.println("to check object is equal or not : "+a1.equals(o5)); 
		
	}

}
