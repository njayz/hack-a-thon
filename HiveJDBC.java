package com.vaibhav.hive;
import java.sql.*;


public class HiveJDBC {
	
	public static void main (String args[]) throws Exception{
		
		Class.forName("org.apache.hadoop.hive.jdbc.HiveDriver");
		String url = "jdbc:hive://localhost:10000/default";
		System.out.println("connected");
		Connection con = DriverManager.getConnection(url);
		Statement stmt = con.createStatement();
		String qr="select * from ehrdemo";
		ResultSet rs = stmt.executeQuery(qr);
		
		while(rs.next()){
			
			String s1 = rs.getString(1);
			String s2 = rs.getString(2);
			String s3 = rs.getString(3);
			String s4 = rs.getString(4);
			String s5 = rs.getString(5);
			String s6 = rs.getString(6);
			String s7 = rs.getString(7);
			String s8 = rs.getString(8);
			String s9 = rs.getString(9);
			String s10 = rs.getString(10);
		    String s11 = rs.getString(11);
		//	String s12   = rs.getString(12);


	System.out.print(s1 +"\t" +s2+ "\t" +s3+ "\t" +s4+ "\t" +s5+ "\t" +s6+ "\t" +s7+ "\t" +s8+ "\t" +s9+ "\t" +s10+ "\t" +s11+  "\n" )	;	
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}

