package com.rays.testjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedure_Out {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gogo", "root", "root");

		CallableStatement cs = con.prepareCall("{CALL getEmpOut(?)}");

		cs.setInt(1, 4);
		cs.registerOutParameter(1, Types.INTEGER);

		cs.execute();

		System.out.println(cs.getString(1));
	}

}
