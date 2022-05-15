package operater;

public class logicalop {
	public static void main (String[] args) {
	//variable defination and initialization
	boolean boo11 = true; boolean boo12= false ;
	boolean res=boo11 && boo12;
	
	//logical AND
	
	System.out.println("boo11 && boo12 = "+(boo11 && boo12));
	
	//logical or
	
	System.out.println("bool1 || bool2 = " + (boo11 || boo12) );
	
	//logical not
	
	System.out.println("(!bool1 || bool2) = " + !(boo11 && boo12) );
}
}