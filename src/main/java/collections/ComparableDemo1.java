package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>
{
	int rolllno;
	String name;
	int age;
	Student1(int rollno,String name,int age)
	{
		this.rolllno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student1 o) 
	{
		if(o.age==age)
		{
			return 0;
		}
		else if(o.age<age)
		{
			return -1;
			
		}
		else
		{
			return 1;
		}
		
	}
	
	
}
public class ComparableDemo1 {

	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student(40, "Arjun", 23));
		arr.add(new Student(15, "Deepa", 22));
		arr.add(new Student(52, "Praveen", 24));
		arr.add(new Student(9, "Amith", 25));
		Collections.sort(arr);
		for(Student st:arr)
		{
			System.out.println(st.rollno+"  "+st.name+"   "+st.age);
		}

	}

}
