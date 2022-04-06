package mq.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {

	public static void main(String[] args) 
	{
		
		
			Map<Integer, String> map=new HashMap<Integer,String>();
			map.put(100, "Samsung");
			map.put(101, "Iphone");
			map.put(102, "Vivo");
			map.put(103, "OnePlus");
			map.put(104, "Oppo");
			map.put(null, null);
			map.put(106, null);
			
			//Read Single Pair value
			String Phone=map.get(102);
			System.out.println(Phone);
			
			
			//Read all Object value using keyname
			for (Integer keyname : map.keySet()) 
			{
				System.out.println(map.get(keyname));
			}
			
	}

}
