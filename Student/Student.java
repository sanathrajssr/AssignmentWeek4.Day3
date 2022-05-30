package org.Student;

import org.Department.Department;

public class Student extends Department{
	
	public void StudentName() {
		System.out.println("Name Of Student Is SANATH");
	}
	public void StudentDepartment() {
		System.out.println("Student Department Is CIVIL");
	}
	public void StudentId() {
		System.out.println("Student Id Is 907");
	}
	
	
	public static void main(String[] args) {
		Student std = new Student();
		std.CollegeCode();
		std.CollegeName();
		std.CollegeRankInTamilnadu();
		std.StudentName();
		std.StudentId();
		std.StudentDepartment();
		std.Dept();
		
	}

}
