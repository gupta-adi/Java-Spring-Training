package com.training.amdocs;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedDemo {

	public static void main(String[] args)throws Exception {
		
		FileReader fr=new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuffer str = new StringBuffer();
		
		String line;
		while((line = br.readLine())!=null) {
			str.append(line);
			str.append("\n");
		}
		fr.close();
		System.out.println("Output is: ");
		System.out.println(str);
	}

}
