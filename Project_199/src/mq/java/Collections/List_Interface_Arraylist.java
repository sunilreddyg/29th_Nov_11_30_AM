package mq.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class List_Interface_Arraylist {

	public static void main(String[] args) {
		

		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("five");
		list.add("six");
		
		//Remove object from collection
		list.remove("four");
		
		//Get single obejct using index number
		String RequiredObj=list.get(2);
		System.out.println("2nd index object is --> "+RequiredObj);
		
		//Get size of objects
		System.out.println("Collection Size is --> "+list.size());
		
		//Verify Object Available status
		boolean flag=list.contains("four");
		System.out.println("Object Available status is --> "+flag);
		
		//Read first iterator value
		String itr=list.iterator().next();
		System.out.println("First iterator of obejct in collection is --> "+itr);
		
		
		//Verify Collection empty stuts
		boolean flag1=list.isEmpty();
		System.out.println("Collection Empty status is --> "+flag1);
		
		
		
		//Read list of objects using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String Eachobj=list.get(i);
			System.out.println(Eachobj);
		}
		
	
		
	
		//Read all collection of objects
		for (String Eachobj : list) 
		{
			System.out.println(Eachobj);
		}
		
		//Read all objects using iterator with While loop
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			String obj=iterator.next();
			System.out.println(obj);
		}
		

	}

}
