package com.rays.testjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcedure_In {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gogo", "root", "root");

		CallableStatement cs = con.prepareCall("{CALL getEmpIdIn(?)}");

		cs.setInt(1, 3);
		cs.execute();
		System.out.println("Data inserted");
	}

}
