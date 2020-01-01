package com.javacore.collections.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizedHashMapExample {
	/*
	 * Generally HashMap are non synchronized and hence are not Thread safe i.e.
	 * HashMap cannot be shared with multiple Threads. This is an example of how
	 * to make a HashMap Thread safe
	 */

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Rujen");
		hmap.put(2, "Raj");
		hmap.put(3, "Shrestha");

		Map map = Collections.synchronizedMap(hmap);
		Set set = map.entrySet();

		synchronized (map) {
			Iterator i = set.iterator();
			while (i.hasNext()) {
				Map.Entry me = (Map.Entry) i.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
		}
	}
}
