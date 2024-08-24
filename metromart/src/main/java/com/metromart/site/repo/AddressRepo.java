package com.metromart.site.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metromart.site.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

	
	
}
