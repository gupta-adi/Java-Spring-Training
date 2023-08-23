package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2,3,5,6,12);
		numbers.stream().filter(x->x%2!=0).map(n->n*n).sorted().forEach(System.out::println);
		
		List<Integer> sortedOddNo = numbers.stream().filter(x->x%2!=0).map(n->n*n).sorted().collect(Collectors.toList());
		System.out.println(sortedOddNo);
		
		List<String> names = Arrays.asList("Joe", "Steph", "Mike","David","Sara");
		names.stream().filter(x->x.startsWith("S")).sorted().forEach(x->System.out.println(x));
		
		
	}

}
