package collections;

import java.util.*;

public class LinkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new java.util.LinkedHashSet<String>();

		
		set.add("BMW");
		set.add("Audi");
		set.add("Benz");
		set.add("Tata");
		System.out.println(set);
		System.out.println("\nDisplaying Using Enhanced Loop \n");
		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("\nDisplaying Using Iterator\n");
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}


	}

}
