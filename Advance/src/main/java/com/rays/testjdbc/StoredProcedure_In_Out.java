package com.rays.testjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedure_In_Out {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gogo", "root", "root");

		CallableStatement cs = con.prepareCall("{CALL getIn_Out(?,?)}");

		cs.setInt(1, 2);
		cs.registerOutParameter(2, Types.VARCHAR);
		
		cs.execute();
		
		System.out.println(cs.getString(2));
	}

}
