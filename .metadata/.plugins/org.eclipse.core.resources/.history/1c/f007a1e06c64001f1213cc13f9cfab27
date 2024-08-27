package com.metromart.site.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metromart.site.entity.CreateAccount;

@Repository
public interface AccountCreationRepo extends JpaRepository<CreateAccount,Integer> {
	
	CreateAccount findByUsername(String username);

}
