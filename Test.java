package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库加载完成");
			
		} catch (Exception e) {
			System.out.println("我擦嘞干不过");
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","123");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from new_table");
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
 		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
