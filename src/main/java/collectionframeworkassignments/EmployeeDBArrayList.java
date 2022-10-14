//Create an Employee class with the related attributes and
//behaviours. Create one more class EmployeeDB which has the
//following methods. a. boolean addEmployee(Employee e) b.
//boolean deleteEmployee(int eCode) c. String showPaySlip(int
//eCode) d. Employee[] listAll() Use an ArrayList which will be
//used to store the emplyees and use enumeration/iterator to
//process the employees. Write a Test Program to test that all
//functionalities are operational.


package collectionframeworkassignments;

import java.util.ArrayList;

class Employee
{
	int id,salary;
	String name,address;
	
	
	
}
class emloyeeDB 
{
	ArrayList emp=new ArrayList();
	boolean addEmployee(Employee e)
	{
		
		emp.add(e);
		
		
		return false;
		
	}
	boolean deleteEmployee(Employee e)
	{
		emp.remove(e);
		
		return false;
		
	}
	String Payslip(int ecode)
	{
		System.out.println(emp.get(ecode));
		return null;
		
		
	}
	
}
public class EmployeeDBArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
