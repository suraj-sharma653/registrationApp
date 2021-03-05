package com.example.demo;
 
import javax.validation.constraints.*;

public class EmpRegData {
	
	@NotBlank(message="Please enter your FullName")
	@Size(min=3, max=20)
	private String FullName;
	
	@NotBlank(message="Please enter your Username")
	@Size(min=3, max=15)
	private String username;
	
	@NotBlank(message="Please enter your Password")
	@ValidPassword
	private String password;
	
	@NotBlank(message="Please enter your Address")
	@Size(min=10, max=40)
	private String Address;
	
	@NotBlank(message="Please enter your Contact")
	private int Contact;
	
	@NotBlank(message="Please enter your City")
	@Size(min=6, max=18)
	private String City;
	
	private String datatime;
  
	
	public String getDatatime() {
		return datatime;
	}
	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
