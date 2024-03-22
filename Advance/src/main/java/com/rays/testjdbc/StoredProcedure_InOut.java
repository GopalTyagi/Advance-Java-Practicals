package com.rays.testjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedure_InOut {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gogo", "root", "root");

		CallableStatement cs = con.prepareCall("{CALL getEmpInOut(?)}");

		
		cs.setInt(1, 4);
		
		cs.registerOutParameter(1, Types.VARCHAR);
		
		cs.execute();
		
		System.out.println(cs.getString(1));
		cs.close();
		con.close();

	}

}
