package com.learning.data;

import com.learning.Boys;
import java.sql.*;

public class Database {
	public Database()
	{
		
	}
	public Boys getBoys(int aid)
	{
		Boys b=new Boys();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:// localhost:3306/pradeesh","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from roll where aid="+aid);
			if(rs.next())
			{
				b.setAid(rs.getInt("aid"));
				b.setAname(rs.getString("aname"));
				b.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		return b;
	}
}
