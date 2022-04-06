package mq.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Set_interface_hashSet {

	public static void main(String[] args) 
	{
		
		/*
		 * => set is a unorder collection of objects
		 * => Set doesn't allow duplicates
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		set.add("five");
		set.add("six");
		
		//Remove object from collection
		set.remove("four");
		
		//Get size of objects
		System.out.println("Collection Size is --> "+set.size());
		
		//Verify Object Available status
		boolean flag=set.contains("four");
		System.out.println("Object Available status is --> "+flag);
		
		//Read first iterator value
		String itr=set.iterator().next();
		System.out.println("First iterator of obejct in collection is --> "+itr);
		
		
		//Verify Collection empty stuts
		boolean flag1=set.isEmpty();
		System.out.println("Collection Empty status is --> "+flag1);
		
		
		
		
		//Read all collection of objects
		for (String Eachobj : set) 
		{
			System.out.println(Eachobj);
		}
		
		//Read all objects using iterator with While loop
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String obj=iterator.next();
			System.out.println(obj);
		}
		
	}

}
