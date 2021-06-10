package com.atyeti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atyeti.rest.model.Account;
import com.atyeti.rest.model.AccountRepo;

@RestController
public class HomeController {

	@Autowired
	private AccountRepo repo;
	
	@GetMapping("/getaccountdetails/student/rollno/{rollno}/accno/{id}")
	public Account getAccountDetails(@PathVariable String rollno,@PathVariable String id) {
		System.out.println("Account Service is Call..............");
		Account account=repo.findByIdAndRollno(Long.parseLong(id), rollno);
		return account;
		
	}
	
	
}
