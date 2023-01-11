package org.college;

class Student extends Department {
	public void studentName()
	{
		String studName="Sudhakar";
		System.out.println("Student Name - "+studName);
	}
public void studentDept()
{
	String dept="Computer Science And Engineering";
	System.out.println("Student Department - "+dept);
}
public void studentId()
{
	long id=422613104016l;
	System.out.println("Student ID"+id);
}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
