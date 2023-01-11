package org.college;

public class Students {
	public void getStudentInfo(long id)
	{
	
	System.out.println("Student Id = "+id);
	}
public void getStudentInfo(long id,String name)
{

	System.out.println("Student Name "+name);
}
public void getStudentInfo(long id,String name,String email)
{

	System.out.println("Student email -"+email);
}
public void getStudentInfo(long id,String name,String email,long phnNum)
{
	System.out.println("Student Phn Number -"+phnNum);
}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(422613104016l);
		obj.getStudentInfo(422613104016l,"Madhusree Sudhakar");
		obj.getStudentInfo(422613104016l,"Madhusree Sudhakar","selvampriya658@gmail.com");
		obj.getStudentInfo(422613104016l,"Madhusree Sudhakar","selvampriya658@gmail.com", 7539976506l);
		
		

	}

}
