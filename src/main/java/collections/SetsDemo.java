package collections;

import java.util.*;



public class SetsDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		
		set.add("BMW");
		set.add("Audi");
		set.add("Benz");
		set.add("Tata");
		
		System.out.println("\nDisplaying Using Enhanced Loop \n");
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("\nDisplaying Using Iterator\n");
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("Cheking Set is empty or not\n "+set.isEmpty());
		
		System.out.println("Paricular Element Present or not \n"+set.contains("Benz"));
		System.out.println("Before Deleting Element");
		System.out.println(set);
		set.remove("Tata");
		System.out.println("After Deleting Element");
		System.out.println(set);
	}
	

}
