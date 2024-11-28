package com.lamdas.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdasExample {

	public static void main(String[] args) {

		List<String> emails = new ArrayList<String>();
		emails.add("john123@gmail.com");
		emails.add("sam123@gmail.com");
		emails.add("roy123@yahoo.com");
		emails.add("caleb123@outlook.com");
		
		List<String> emailList = Arrays.asList("john123@gmail.com", "sam123@gmail.com", "roy123@gmail.com", "caleb123@gmail.com");
		
		System.out.println(emails);
		System.out.println(emailList);
		
		String csvData = emails.stream().map((String email) -> email.replace("yahoo,com", "google.com")).collect(Collectors.joining(", "));
		
		emails = emails.stream().map((String email) -> email.replace("yahoo.com", "google.com")).collect(Collectors.toList());
		
		// emails.stream() -> converts the list of emails to a stream for processing
		// map(String email) -> email.replace("yahoo.com", "google.com") -> replaces yahoo.com with google.com in each element present inside the list
		// collect(Collectors.joining(", ") -> collects the modified emails into a single comma separated string
		// emails.stream().map((String email) -> email.replace("yahoo.com", "google.com")).collect(Collectors.toList()); -> this entire expression is a lambda expression, it actuallay defines
		// an anonymous function that takes String email as an input and returns a modified version of that String.
		// "->" this is a lambda operator, it separates the parameters from the method body
		
		System.out.println(csvData);
		System.out.println(emails);
	}

}
