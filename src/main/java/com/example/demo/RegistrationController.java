package com.example.demo;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class RegistrationController {

	@Autowired
	public EmpRegDataRepo repo;

	@RequestMapping("/")
	public String Home() {
//		model.addAttribute("empregdata", new EmpRegData());
		return "Home.jsp";
	}

	@RequestMapping("/register")
	public String getRegPage() {
		return "RegisterPage.jsp";
	}

	@GetMapping("/login")
	public String getLoginPage() throws SQLException {
		return "Login.jsp";
	}

	@PostMapping("/login")
	public String postLoginPage(EmpRegData erd)
			throws SQLException 
	{
			repo.addEmpRegData(erd);
			return "Login.jsp";
		

	}

	@RequestMapping("/log")
	public String LoggedINPage(LogInData ld) throws SQLException {
		if (!repo.checkLoginDetails(ld))
			return "Login.jsp";

		return "LoggedInPage.jsp";
	}
}
