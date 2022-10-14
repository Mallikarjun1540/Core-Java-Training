package collections;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Arjun");
		a.add("Praveen");
		a.add("Amith");
		a.add("Mallikarjun");

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("\nDisplaying Using Enhanced Loop \n");
		for (String s : a) {
			System.out.println(s);
		}
		System.out.println("\nDisplaying Using While Loop \n");
		int i = 0;
		while (i < a.size()) {
			System.out.println(a.get(i));
			i++;
		}
		System.out.println("\nDisplaying Using Iterator\n");
		Iterator iterator = a.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nCheking Set is empty or not\n " + a.isEmpty());

		System.out.println("\nParicular Element Present or not \n" + a.contains("Arjun"));
		System.out.println("\nBefore Deleting Element\n");
		System.out.println(a);
		a.remove("Mallikarjun");
		System.out.println("\nAfter Deleting Element\n");
		System.out.println(a);
		
		System.out.println("\n Before Inserting Element at a Particular position \n");
		System.out.println(a);
				a.set(2, "POP");
				System.out.println("\n After Inserting\n"+a);
		

	}

}
