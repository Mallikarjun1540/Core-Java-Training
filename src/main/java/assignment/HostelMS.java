package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Hostel {
	private int studId;
	private String studName;
	private String studEmail;
	private long studMobile;

	public Hostel() {
	}

	public Hostel(int studId, String studName, String studEmail, long studMobile) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.studMobile = studMobile;

	}

	public String GetStudentDetails() {
		return " student Id is :" + studId + " \nStudent Name : " + studName + " \nStudent Email  : " + studEmail
				+ " \nStudent mobile : " + studMobile + "\n";
	}

	public int getstudId() {
		return studId;
	}

	public void setstudId(int studId) {
		studId = studId;
	}

	public String getstudName() {
		return studName;
	}

	public void setstudName(String studName) {
		studName = studName;
	}

	public String studEmpEmail() {
		return studEmail;
	}

	public void setstudEmail(String studEmail) {
		studEmail = studEmail;
	}

	public long getstudMobile() {
		return studMobile;
	}

	public void setstudMobile(long studMobile) {
		studMobile = studMobile;
	}

}

class StudentDB {
	List<Hostel> studentDb = new ArrayList<>();

	public boolean addstudent(Hostel e) {
		return studentDb.add(e);
	}

	public boolean deletestudent(int studId) {
		boolean isRemoved = false;

		Iterator<Hostel> it = studentDb.iterator();

		while (it.hasNext()) {
			Hostel emp = it.next();
			if (emp.getstudId() == studId) {
				isRemoved = true;
				it.remove();
			}
		}

		return isRemoved;
	}

	public Hostel[] listAll() {
		Hostel[] studArray = new Hostel[studentDb.size()];
		for (int i = 0; i < studentDb.size(); i++)
			studArray[i] = studentDb.get(i);
		return studArray;
	}

}

public class HostelMS {
	Scanner scan = new Scanner(System.in);
	StudentDB empDb = new StudentDB();

	public void hosteldetails() {
		System.out.println(" \n* * * * * * * Hostel Facilities * * * * * * * \n");
		System.out.println("1. Rooms\n 2. Mess\n 3. WiFi\n 4. laundry\n 5. Canteen\n");
	}

	public void addstud() {
		System.out.println("\nTo Add Student");
		System.out.println("enter Student id");
		int id = scan.nextInt();
		System.out.println("enter student name");
		String name = scan.next();
		System.out.println("Enter student email id");
		String email = scan.next();
		System.out.println("Enter student mobile number");
		long mob = scan.nextLong();
		Hostel stud1 = new Hostel(id, name, email, mob);
		empDb.addstudent(stud1);

		System.out.println("\nInserted succesfully\n");
	}

	public void viewstud() {
		for (Hostel emp : empDb.listAll())
			System.out.println(emp.GetStudentDetails());
	}

	public void deletestud() {
		System.out.println("Enter Student ID to delete\n");
		int id = scan.nextInt();
		empDb.deletestudent(id);
		System.out.println("\n * * * * *Remaining Records are * * * * *\n");
		for (Hostel emp : empDb.listAll())
			System.out.println(emp.GetStudentDetails());

		System.out.println();
	}
	
	
	public void updatestud() 
	{
		System.out.println("Enter id: ");
		int id=scan.nextInt();
		boolean found=false;
		for(Hostel emp:empDb.listAll())
		{
			if(emp.getstudId()==id) 
			{
				System.out.println("Enter new name: ");
				String name1=scan.next();
				System.out.println("Enter new email: ");
				String email=scan.next();
				System.out.println("Enter new Mobile");
				long mobile=scan.nextLong();
				emp.setstudName(name1);
				emp.setstudEmail(email);
				emp.setstudMobile(mobile);
				System.out.println(" * * * * * *Updated Details of Student : * * * * * * ");
				System.out.println(emp.GetStudentDetails());
				found=true;
			}
		}
	
		
	}
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HostelMS hstl = new HostelMS();
		x:
		while (true) {
			System.out.println("* * * * * * Welcome to HOSTEL MANAGEMENT SYSTEM * * * * * *\n");
			System.out.println(
					"1. View Hostel Facilities\n 2. Insert Student\n 3. View Student Details\n 4. delete student\n 5. Edit Student Details\n 6. Exit\n");
			System.out.println("Enter Your Choice\n");

			int ch = scan.nextInt();
			switch (ch) {
			case 1:
				hstl.hosteldetails();
				break;
			case 2:
				hstl.addstud();
				break;

			case 3:
				System.out.println("\n * * * * * Student Details are * * * * *\n");
				hstl.viewstud();
				break;
			case 4:
				hstl.deletestud();
				break;
			case 5:hstl.updatestud();
					System.out.println("\nStudent details updated succesfully\n");
				break;
			case 6:
				break x;
				

			}
		}

	}

}