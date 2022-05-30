package AssignmentWeek4.Day3;


public class Students {
 
	
	public void getStudentinfo(String name) {
		System.out.println("Student name"+name);
	
	}
	public void getStudentinfo(String name,int StudentId) {
		System.out.println("String name"+name+" "+"StudentId"+StudentId);
		
	}
	public void getstudentinfo(int StudentId,String name) {
		System.out.println("Student Id"+StudentId+" "+"Student name"+name);
		
	}
	public void getStudentinfo(String name,long PhoneNumber) {
		System.out.println("Student name"+name+" "+" PhoneNumber"+PhoneNumber);
		
	}
	public void getStudentinfo(int phoneNumber,String name) {
		System.out.println("Phone Number"+phoneNumber+" "+" Student Id"+name);
		
	}
	public void getStudentinfo(String name,Short Email) {
		System.out.println("Email"+Email+" "+" PhoneNumber"+name);
		
		
	}
	public static void main(String[] args) {
		Students Student = new Students();
		Student.getStudentinfo("SANATH");
		Student.getStudentinfo("SANATH, 907");
		Student.getStudentinfo("SANATH,9566972144");
		Student.getStudentinfo("SANATH,sanathrajssr2000@gmail.com" );
		
		
	}
	
	}

	
	


