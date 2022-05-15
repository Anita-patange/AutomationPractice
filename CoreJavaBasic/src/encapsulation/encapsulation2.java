package encapsulation;

public class encapsulation2 {
	public static void main (String [] args) {
	student s1=new student();
  System.out.println("class number is: "+s1.getClassno());
  System.out.println("roll number of abive class is: "+s1.getRollno());
  System.out.println("percentage of above class is: "+s1.getPercentage()+"%");  
  System.out.println("grade od above class is: "+s1.getGrade());  
  
  s1.setClassno(2);
  s1.setRollno(26);
  s1.setPercentage(75.20);
  s1.setGrade('B');
  System.out.println("**********************************"); 
  
  System.out.println("class number is: "+s1.getClassno());
  System.out.println("roll number of abive class is: "+s1.getRollno());
  System.out.println("percentage of above class is: "+s1.getPercentage()+"%");  
  System.out.println("grade od above class is: "+s1.getGrade()); 
  }
}

class student{
	private int classno=1;
	private int rollno=25;
	private double percentage=85.92d;
	private char grade='A';
	
	
	public int getClassno() {
		return classno;
	}
	public int getRollno() {
		return rollno;
	}
	public double getPercentage() {
		return percentage;
	}
	public char getGrade() {
		return grade;
	}
	
	
	public void setClassno(int classno) {
		this.classno = classno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}