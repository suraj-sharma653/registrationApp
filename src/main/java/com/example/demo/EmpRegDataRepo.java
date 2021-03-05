package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
public class EmpRegDataRepo {
	 
	private Connection con;
	private PreparedStatement st ;
	@Autowired
	private BusinessLogic bl;
	
	public EmpRegDataRepo() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/REG", "postgres", "12345678");
	}

	public void addEmpRegData(EmpRegData erd) throws SQLException
	{
		Timestamp instant= Timestamp.from(Instant.now());  
		st= con.prepareStatement("insert into public.logindata values(?,?,?,?,?,?,?)");
		st.setString(1, erd.getUsername());
		st.setString(2, bl.encryptText(erd.getPassword()));
		st.setString(3, erd.getFullName());
		st.setString(4, erd.getAddress());
		st.setInt(5, erd.getContact());
		st.setString(6, erd.getCity());
		st.setString(7, instant.toString());
		st.execute();
		
	}
	
	public boolean checkLoginDetails(LogInData ld) throws SQLException
	{
		st= con.prepareStatement("select * from public.logindata where username=? and password=?");
		st.setString(1, ld.getUsername());
		st.setString(2, bl.encryptText(ld.getPass()));
		ResultSet rs=st.executeQuery();
		return rs.next();
	}

	public boolean checkfullname(String fullname) throws SQLException
	{
		st= con.prepareStatement("select * from public.logindata where fullname=?");
		st.setString(1,fullname);
		boolean count=st.execute();
		return count;
	}
	public boolean checkcontact(String contact)  throws SQLException
	{
		st= con.prepareStatement("select * from public.logindata where contact=?");
		st.setInt(1,Integer.parseInt(contact));
		boolean count=st.execute();
		return count;
	}

	public int checkUserName(String username)  throws SQLException {
		st= con.prepareStatement("select * from public.logindata where username=?");
		st.setString(1,username);
		int count=st.executeUpdate();
		return count;
	}
	
}
