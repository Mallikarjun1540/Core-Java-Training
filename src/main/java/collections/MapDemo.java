package collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("Arjun", 40);
		map.put("Praveen", 52);
		map.put("Amith", 9);
		
		System.out.println(map.get("Arjun"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println("\nDisplaying Using Iterator\n");
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			//System.out.println(iterator.next());
			Map.Entry<String, Integer> me = (Map.Entry) iterator.next();
			
			System.out.println(me.getKey()+"  =  "+me.getValue());
			
		}
		
		

	}

}
