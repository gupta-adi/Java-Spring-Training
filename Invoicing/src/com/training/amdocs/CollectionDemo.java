package com.training.amdocs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
		
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "Laptop");
		myMap.put(2, "Desktop");
		myMap.put(3, "TV");
		myMap.put(4, "Mobile");
		
		for(Map.Entry<Integer,String> entry:myMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		for(String value : myMap.values()) {
			System.out.println(value);
		}
		
		for(int key : myMap.keySet()) {
			System.out.println(key);
		}
		
		//myMap.forEach((k,v)->System.out.println("Key: "+);)
		
		Set<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(101, "Adam", "Pune"));
		studentSet.add(new Student(102, "Wess", "Delhi"));
		studentSet.add(new Student(103, "Papu", "Agra"));
		studentSet.add(new Student(101, "Pap1", "Agra"));
		System.out.println("");
		
		for(Student std:studentSet) {
			System.out.println(std.getName());
		}
		System.out.println("");
		
		names.add("Adam");
		names.add("Paul");
		names.add("Mike");
		names.add("Paul");
		
		for(String std:names) {
			System.out.println(std);
		}

	}
	
	static int add(int ... a) {
		int  sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
