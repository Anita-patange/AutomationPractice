package array;

public class multipalarray2 {
 public static void main (String [] args) {
	 char [][] alphabet=new char[3][3];

	 alphabet[0][0]='A';
	 alphabet[0][1]='A';
	 alphabet[0][2]='A';
	 alphabet[1][0]='S';
	 alphabet[1][1]='S';
	 alphabet[1][2]='S';
	 alphabet[2][0]='A';
	 alphabet[2][1]='A';
	 alphabet[2][2]='A';
	 
	 
	 System.out.println("********************************");
	 
	 for (int c=0;c<alphabet.length;c++) {
		 for (int c1=0; c1<alphabet[c].length;c1++) {
			 System.out.print(alphabet [c][c1]+" "); 
		 }
		 System.out.println();
	 }
	 System.out.println("********************************");
	 
	
 }
}
