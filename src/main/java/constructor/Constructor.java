package constructor;

class Student
{
	String name,branch;
	Student()
	{
		System.out.println("******Student Details******");
	}
	Student(String name,String branch)
	{
		this.name=name;
		this.branch=branch;
	}
	Student(String college)
	{
		System.out.println("College name is "+college);
	}
	public void display()
	{
		System.out.println("Student name is "+name);
		System.out.println("Branch is "+branch);
		
	}
}
public class Constructor {

	public static void main(String[] args) {
		Student s3=new Student();
		Student s1=new Student("Arjun","MCA");
		s1.display();
		Student s2=new Student("KLEIT");
		
		
		
		

	}

}
