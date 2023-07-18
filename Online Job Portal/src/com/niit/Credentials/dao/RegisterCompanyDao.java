package com.niit.Credentials.dao;
 
import java.sql.*;

import com.niit.SqlConnect.SqlConnection;
public class RegisterCompanyDao {
	Connection con=null;
	public int update(String s1,String CompanyEmail,String Password,String s4) {
		con=SqlConnection.dbConnector();
		String query = "INSERT INTO companies VALUES (?,?,?,?)";
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1,s1);
			st.setString(2,s4);
			st.setString(3,CompanyEmail);
			st.setString(4,Password);
			int i=st.executeUpdate();
			return i;
		} catch (SQLException e) {e.printStackTrace();}
		return 0;
		
	}

}
