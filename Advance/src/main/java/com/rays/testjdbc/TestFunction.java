
package com.rays.testjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TestFunction {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gogo", "root", "root");

		CallableStatement cs = con.prepareCall("{? = CALL getSalary()}");

		cs.registerOutParameter(1, Types.INTEGER);

		cs.execute();

		System.out.println(cs.getInt(1));
	}
}
