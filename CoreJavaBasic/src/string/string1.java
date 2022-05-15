package string;

public class string1 {
public static void main (String[] args) {
	
  string1 s=new string1();

  System.out.println("to string of s"+s);
  System.out.println("******************************************");
  String s1="aurangabad";
  String s2="Aurangabad";
  String s3="aurangabad";
  String s4="pune";
  
  //compare two object by equal method and operator
  System.out.println("compare s1 and s2 by equals method "+s1.equals(s2));//compare value
  System.out.println("compare s1 and s2 by equals method "+s1.equals(s3));
  System.out.println("compare s1 and s2 by == : " +(s1==s2));//compare adress
  System.out.println("compare s1 and s2 by == : "+(s1==s3));
  System.out.println("compare s1 and s2 by == : "+(s2==s3));
  System.out.println("******************************************");
  
  //printing string
  System.out.println("s1: "+s1);
  System.out.println("s2: "+s2);
  System.out.println("s3: "+s3);
  System.out.println("s4: "+s4);
  System.out.println("******************************************");
  
  //printing string length
  System.out.println("length of s1: "+s1.length());
  System.out.println("length of s1: "+s4.length());
  System.out.println("******************************************");
  
  String s6=new String("hyderabad");
  System.out.println("s6: "+s6);
  System.out.println("length of s6: "+s6.length());
  System.out.println("compare s6 and s1 by equals method "+s6.equals(s1));
  System.out.println("compare s1 and s2 by == : " +(s6==s1));
  System.out.println("Character at index 6: "+s6.charAt(5));
  System.out.println("intern of string s6: "+s6.intern());
  System.out.println("replace d with p: "+s6.replace('d', 'p'));
  System.out.println("replace string s3 with s4: "+s6.replace(s3, s4));
  try {
  System.out.println("replaceAll string s6 with null: "+s6.replaceAll(s6, null));
  }
  catch(Exception obj) {
	  System.out.println("exeption handling start");
	  System.out.println("catches metthod: "+obj);
	  System.out.println("exeption handling end");
  }
  System.out.println("index of string aurangabad: "+s6.indexOf("aurangabad"));
  System.out.println("replaceFirst string s1 with s4"+s6.replaceFirst(s1, s4));
  System.out.println("replace beginindex 0: "+s6.substring(0));
  System.out.println("replace index 2 to 4: "+s6.substring(2, 4));
  System.out.println("string in lowercase: "+s6.toLowerCase());
  System.out.println("string in uppercase: "+s6.toUpperCase());
  System.out.println("to upper case index 5: "+s6.toUpperCase());
  System.out.println("trim : "+s6.trim());
  System.out.println("compare string s6 with s1: "+s6.compareTo(s1));
  System.out.println("split s6 with s3: "+s6.split(s3));
  System.out.println("is empty: "+s6.isEmpty());
  System.out.println("get class: "+s6.getClass());
  System.out.println("get byte: "+s6.getBytes());
  System.out.println("***********************************************");
  
  
  
  
  
  
  //short string of string
  String s5="I Am Anita";
  System.out.println("s5: "+s5);
  System.out.println("length of s5 : "+s5.length());
  System.out.println("s5:sub string from 5 : "+s5.substring(5));
  System.out.println("s5:sub string from 2 to 5 : "+s5.substring(2, 7));
  System.out.println("s5:lower case : "+s5.toLowerCase());
  System.out.println("s5:uppar case: "+s5.toLowerCase());
  System.out.println("s5:alphabet at no 5 : "+s5.charAt(5));
  System.out.println("s5:alphabet at no 5 : "+s5.charAt(1));
  System.out.println("******************************************");
  
}
}
