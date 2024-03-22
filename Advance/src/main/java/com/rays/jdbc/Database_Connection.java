package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("Select name,age from person");

		while (rs.next()) {
			//Access by column name
			String name = rs.getString("name");
			//Access by column index starting from 1
			int age = rs.getInt(2);
			System.out.println(name + " -> " + age);

		}

		stmt.close();
		con.close();
	}
}