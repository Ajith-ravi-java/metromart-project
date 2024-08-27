package com.metromart.site.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metromart.site.entity.SignUp;

@Repository
public interface AccountCreationRepo extends JpaRepository<SignUp,Integer> {
	
	SignUp findByUsername(String username);

}
