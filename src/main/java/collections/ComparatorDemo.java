package collections;
import java.util.*;

class Student2 
{
	int rollno;
	String name;
	int age;

	Student2(int rollno, String name, int age) 
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student2> 
{

	
	public int compare(Student2 s1, Student2 s2) 
	{
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}
class RollnoComparator implements Comparator<Student2>
{
	
	@Override
	public int compare(Student2 s1, Student2 s2) 
	{
		if(s1.rollno==s2.rollno)
		{
			return 0;
		}
		else if(s1.rollno<s2.rollno)
		{
			return-1;
		}
		else
		{
			return 1;
		}
		
	}
	
}
class NameComparator implements Comparator<Student2> 
{
	public int compare(Student2 s1, Student2 s2) 
	{
		return s1.name.compareTo(s2.name);
	}
}

class ComparatorDemo 
{
	public static void main(String args[]) 
	{
  
		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(101, "Vijay", 23));
		al.add(new Student2(106, "Ajay", 27));
		al.add(new Student2(105, "Jai", 21));

		System.out.println("\nSorting by Name");
 
		Collections.sort(al, new NameComparator());
 
		for (Student2 st : al) 
		{
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("\nsorting by Age");
 
		Collections.sort(al, new AgeComparator());
  
		for (Student2 st : al) 
		{
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("\nSorting by Roll Number");
		Collections.sort(al,new RollnoComparator());
		for(Student2 st:al)
		{
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}