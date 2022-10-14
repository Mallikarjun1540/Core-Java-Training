//Write a program that will have a Vector which is capable of
//storing emp objects. Use an Iterator and enumeration to list
//all the elements of the Vector.
package collectionframeworkassignments;

import java.util.*;

public class VectorAssignment8 {

	public static void main(String[] args) {
		Vector vc=new Vector();
		vc.add("Mallikarjun");
		vc.add(40);
		vc.add("Gadag");
		vc.add(400000);
		Iterator iterator=vc.iterator();
		System.out.println("Employee Details");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
