package string;

public class stringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("heloo");
		 System.out.println("original string buffer value: "+sb);
		 sb.append("java");
		 System.out.println("updated string buffer value: "+sb);
		 System.out.println(sb);
		 System.out.println( sb.capacity());
		 System.out.println(sb.deleteCharAt(3));
		 System.out.println(sb.delete(1, 4));
		// System.out.println(sb.trimToSize());
		 System.out.println(sb.reverse());
		 System.out.println(sb.replace(1, 4, "basic"));
		 System.out.println(sb.length());

		 
		 
	}

}
