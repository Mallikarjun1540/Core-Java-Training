package assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



class HostelManagement 
{
	String name;
	int sid;
	long mobile;
	public void addStudent(String name,int sid,long mobile)
	{
		this.name=name;
		this.sid=sid;
		this.mobile=mobile;
		ArrayList arr=new ArrayList();
		arr.add(name);
		arr.add(sid);
		arr.add(mobile);
		Iterator iterator=arr.iterator();
		System.out.println("* * * * * * * * * * Student Details are * * * * * * * * * *");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		
		
	}
}

		
}

class Singleroom implements Serializable
{
    String name;
    String contact;
    String gender;   
    ArrayList<String> food =new ArrayList<>();

   
    Singleroom()
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
    }
}
class Doubleroom extends Singleroom implements Serializable
{ 
    String name2;
    String contact2;
    String gender2;  
    
    Doubleroom()
    {
        this.name="";
        this.name2="";
    }
    Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }
}
class NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";
    }
}


public class HostelManagementSystem {

	
		public void hosteldetails()
		{
			System.out.println("****Hostel Facilities****");
			System.out.println("1. Rooms\n 2. Mess\n 3. WiFi\n 4. laundry\n 5. Canteen");
		}
	
	
	
	
	public static void main(String[] args) {
		while(true)
		{
		System.out.println("* * * * * Welcome to HOSTEL MANAGEMENT SYSTEM* * * * * *");
		System.out.println("1. View Hostel Details\n 2. Insert Student\n 3. View Student Details\n 4. Search Room\n 5. Edit Student Details\n 6. Exit\n");
		System.out.println("Enter Your Choice\n");
		Scanner scan = new Scanner(System.in);
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1:HostelManagementSystem hstl=new HostelManagementSystem();
				hstl.hosteldetails();
				break;
		case 2:HostelManagement hs=new HostelManagement();
				System.out.println("To Add Student");
				System.out.println("enter student name");
				String name=scan.next();
				System.out.println("enter Student id");
				int id=scan.nextInt();
				System.out.println("Enter student mobile number");
				long mob=scan.nextLong();
				hs.addStudent(name, id, mob);
		break;
				
		}
		}

	}

}
