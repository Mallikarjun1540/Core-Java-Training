package collections;

import java.util.*;


public class VectorDemo {
	public static void main(String[] args) {
		List<String> a = new Vector<String>();
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

	}

}
