package com.metromart.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.metromart.site.Enum.userStatus;
import com.metromart.site.entity.CreateAccount;
import com.metromart.site.repo.AccountCreationRepo;

@Service
public class AccountCreateService {
	
	@Autowired
	private AccountCreationRepo userdetailrepo;

	public List<CreateAccount> getAllUserDetails(){
		return userdetailrepo.findAll();
	}
	
	public CreateAccount addNewUser(@RequestBody CreateAccount adding) {
		adding.setStatus(userStatus.active);
		return userdetailrepo.save(adding);
	}
	
	public CreateAccount modifyUserDetails(@RequestBody CreateAccount update) {
	
		CreateAccount user=userdetailrepo.findById(update.getUser_id()).orElse(null);
		
		user.setGmail(update.getGmail());
		user.setPhonenumber(update.getPhonenumber());
		user.setPassword(update.getPassword());
		user.setStatus(update.getStatus());
		user.setUsername(update.getUsername());
	
		return userdetailrepo.save(user);
	}
	
}
