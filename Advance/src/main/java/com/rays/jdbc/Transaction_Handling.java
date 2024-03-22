package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction_Handling {
	public static void main(String[] args) throws SQLException {

		Connection con = null;
		Statement stmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate("update account set balance=balance-500 where id=1");
			stmt.executeUpdate("update account set balance=balance+1500 where id=1");
			con.commit();
			System.out.println("running...........");
		} catch (SQLException e) {
			con.rollback();
		}finally {
			stmt.close();
			con.close();
		}
	}

}
