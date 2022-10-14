//Develop a java class with a instance variable CountryMap HashMap (M1)
//* add a method saveCountryCapital(String CountryName, String capital) ,
//* the method should add the passed country and capital as key/value in the map M1 and return the
//Map (M1).
//Key- Country Value - Capital
//India Delhi
//Japan Tokyo


package collectionframeworkassignments;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;



public class CountryMap {
	Map<String,String> map=new HashMap<String,String>();

	public Map<String,String> saveCountryCapital(String CountryName, String capital)
	{
		 map=new HashMap<String,String>();
		
		map.put("INDIA", "DELHI");
		map.put("Japan","Tokyo");
		map.put(CountryName, capital);
		System.out.println(map);
		return map;
		
	}
	public Map getCapital(String CountryName)
	{
		System.out.println("Capital city of "+CountryName+ " is "+ map.get(CountryName));
		return map;
		
	}
	
	public Map getCountry(String CapitalName)
	{
		
		for(Entry<String, String> entry: map.entrySet()) {

		     
		      if(entry.getValue() == CapitalName) {
		        System.out.println("The key for value " + CapitalName + " is " + entry.getKey());
		       
		      }
		}
		return map;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		CountryMap cm=new CountryMap();
		cm.saveCountryCapital("India","Delhi");
		cm.getCapital("Japan");
		cm.getCountry("DELHI");
	

	}

}
