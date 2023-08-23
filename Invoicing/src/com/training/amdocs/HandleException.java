package com.training.amdocs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException {
	
	public static void main(String args[])throws Exception{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter student ID: ");
	String s;
	try {
		s=sc.nextLine();
		if(s.matches("[^a-zA-Z]*$"))
		throw new InputMismatchException("Enter valid string");
		System.out.println(s);
		
 	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
