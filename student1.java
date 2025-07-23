package dayofweek;
import java.util.Scanner;
public class student {
	String name;
	int rollnumber,age;
	public void studentdetails() {
		System.out.println(" Name : " + name);
		System.out.println(" Age : " + age);
		System.out.println(" Rollnumber : " + rollnumber);
	}
	public static void main(String[]args){
		student s1=new student();
		s1.name="adi";
		s1.age=19;
		s1.rollnumber=7;
		s1.studentdetails();
	}
	
}
