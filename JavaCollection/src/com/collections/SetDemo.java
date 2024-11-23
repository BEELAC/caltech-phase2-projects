package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		// ArrayList can have duplicate records
		// ArrayList maintains insertion order
		// ArrayList<String> emails = new ArrayList<String>();
		
		
		// HashSet ensures uniqueness and doesn't maintain the insertion order
		// HashSet doesn't support indexing, so individual records can't be accessed
		HashSet<String> emails = new HashSet<String>();
		emails.add("john123@gmail.com");
		emails.add("sam123@gmail.com");
		emails.add("leo123@gmail.com");
		emails.add("mike123@gmail.com");
		emails.add("roy123@gmail.com");
		emails.add("caleb123@gmail.com");
		
		emails.add("sam123@gmail.com");
		
		System.out.println(emails);
		
		Iterator<String> itr = emails.iterator();
		while(itr.hasNext()) {
			String email = itr.next();
			System.out.println((email));
		}
		
	}

}
