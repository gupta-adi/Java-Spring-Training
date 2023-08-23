package com.training.amdocs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) {
		
		FileInputStream input = null;
		try {
//			input = new FileInputStream("input.txt");
//			int n=0;
//			while((n=input.read())!=-1) {
//				System.out.print((char)n);
//			}
			FileOutputStream output = new FileOutputStream("output.txt");
			String str = "Written from a java code";
			byte[] b = str.getBytes();
			output.write(b);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		/*finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
	}

}
