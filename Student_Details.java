package semester_3;

import java.util.Scanner;

class Student {
	
	public String name;
	public String department;
	public int rollnumber;
	
	Student(String name,int rollnumber,String department){
		this.name = name;
		this.rollnumber = rollnumber;
		this.department = department;
	}
	public void printStudentInfo() {
		System.out.println("Name:" + name);
		System.out.println("department:" + department);
		System.out.println("rollnumber:" + rollnumber);
	}
}
public class Student_Details {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name =sc.nextLine();
		System.out.println("Enter your rollnumber:");
		int rollnumber = sc.nextInt();
		System.out.println("Enter your department:");
		String department = sc.next();
		Student student = new Student(name,rollnumber,department);
		student.printStudentInfo();
		sc.close();
	}
}
