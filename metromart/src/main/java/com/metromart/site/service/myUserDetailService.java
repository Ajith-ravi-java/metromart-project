package com.metromart.site.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.metromart.site.entity.CreateAccount;
import com.metromart.site.repo.AccountCreationRepo;

@Service
public class myUserDetailService implements UserDetailsService{

	@Autowired
	private AccountCreationRepo userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		CreateAccount user=userrepo.findByUsername(username);
		
		
		if(user==null) {
			System.out.println("user not found....");
			throw new UsernameNotFoundException("user is not founded");
		}
		
		return new myUserPrinciple(user);
	}

}
