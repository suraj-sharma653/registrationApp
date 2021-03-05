package com.example.demo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTApis {

	
	@Autowired
	public EmpRegDataRepo repo; 
	
	@PostMapping("/chkfullname")
	public boolean CheckFullName(String FullName)throws SQLException
	{
		boolean count=repo.checkfullname(FullName);
		return count;
	}
	
	@PostMapping("/chkusername")
	public int CheckUserName(String username)throws SQLException
	{
		int count=repo.checkUserName(username);
		return count;
	}
	
	@PostMapping("/chkcontact")
	public int CheckContact(int Contact)
	{
		int count=0;
		return count;
	}
	
	@PostMapping()
	public int checkLoginDetails(LogInData ld)
	{
		int count=0;
		return count;
	}
	
}
