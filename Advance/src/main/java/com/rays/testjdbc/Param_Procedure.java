package com.rays.testjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Param_Procedure {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gogo", "root", "root");

		CallableStatement cs = con.prepareCall("{CALL param(?,?)}");

		cs.setInt(1, 2);
		cs.execute();
		cs.registerOutParameter(2, Types.VARCHAR);

		System.out.println(cs.getString(2));

	}

}
