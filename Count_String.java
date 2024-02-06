package com.assign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Count_String {

	public static void main(String[] args) {

		String s1 = "Sachin,Amol,Jay,Sachin,Ram,Amol,Laxman,Rahul,Amol";

		String[] s = s1.split(",");

		Map<Integer, String> h = new HashMap<Integer, String>();
		int id = 100;

		for (String s2 : s) {
			h.put(id, s2);
			id++;
		}

		int count=0;
		Set<Integer> keys = h.keySet();
		for (Integer key : keys) {
			System.out.print(key + " = ");
			String value = h.get(key);
			if(value.contains("Amol"))
			{
				count++;
			}
			System.out.println(value);

		}
		System.out.println("Amol "+count+" Times");
	}
}
