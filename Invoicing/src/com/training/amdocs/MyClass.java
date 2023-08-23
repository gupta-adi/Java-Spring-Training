package com.training.amdocs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyClass {
	int age = 23;
	static int marks = 89;

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521/orcl.docker.internal";
		
		String username = "scott";
		String pass = "tiger";
		Connection con = DriverManager.getConnection(url, username, pass);
		
		if(con!=null) {
			System.out.println("connection successfully");
		}else {
			System.out.println("Unable");
		}
		
//		System.out.println("Enter the prodId: ");
//		
//		String prodId = sc.next();
//		
		//PreparedStatement pstmt = con.prepareStatement("select * from product where prod_id = ?");
		
		//pstmt.setString(1, prodId);
		
		//ResultSet rs = pstmt.executeQuery();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select  * from product");
		
		while(rs.next()) {
			System.out.println("ProdID: "+rs.getString(1)+" ProdName: "+rs.getString(2));
		}
//		System.out.println("Hello Class");
//		MyClass obj1 = new MyClass();
//		System.out.println("Age is: " + obj1.age);
//		System.out.println("Marks is: " + marks);
//		System.out.println(obj1);
		
//		Student std1 = new Student();
//		std1.setStudID(001);
//		std1.setAddress("Pune");
//		std1.setName("Amar");
//		std1.setAge(22);
		//System.out.println(std1);
//		System.out.println("Student ID: "+std1.getStudID());
//		System.out.println("Student Name: "+std1.getName());
//		System.out.println("Student Address: "+std1.getAddress());
//		
//		Student std2 = new Student();
//		std2.setStudID(002);
//		std2.setAddress("Mumbai");
//		std2.setName("Akbar");
//		std2.setAge(30);
		//System.out.println(std2);
//		System.out.println("Student ID: "+std2.getStudID());
//		System.out.println("Student Name: "+std2.getName());
//		System.out.println("Student Address: "+std2.getAddress());
		
//		Student std3 = new Student();
//		std3.setStudID(003);
//		std3.setAddress("Nagpur");
//		std3.setName("Anthony");
//		std3.setAge(22);
		//System.out.println(std3);
				
		//Student std4 = new Student();
		//std4 = generateObj(4, "Michael", "Goa",19);
		//System.out.println(std4);
		
		
	}
////	
//	public static Student generateObj(int id, String name, String address, int age) {
//		if(age>20) {
//			Student ob= new Student(id,name, address, age);
//			return ob;
//		}
//		else
//			return null;
//	}
//	
	public String toString() {
		return "Retruned from Object: "+age;
	}
	
	
	


}
