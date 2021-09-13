package org.college;

public class Student extends College{
	
	public void studentName() {
		
		System.out.println("Name is Ajith");
	
	}
	public void studentDept() {
		
		System.out.println("Dept is Computer science");

	}
	public void studentId() {
		
		System.out.println("Id is 123456789");

	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
	}

}
