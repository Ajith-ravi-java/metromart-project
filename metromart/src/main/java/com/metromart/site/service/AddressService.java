package com.metromart.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.metromart.site.Enum.userStatus;
import com.metromart.site.entity.Address;
import com.metromart.site.repo.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressrepo;
	
	public Address addAddress(@RequestBody Address add) {
		add.setAddress_status(userStatus.active);
		return addressrepo.save(add);
	}
	
	public List<Address> listOdAddress(){

		return addressrepo.findAll();
		
	}
	
	public Address editAddress(@RequestBody Address edit) {

		Address address=addressrepo.findById(edit.getAddress_id()).orElse(null);
		address.setArea(edit.getArea());
		address.setCity(edit.getCity());
		address.setHousenumber(edit.getHousenumber());
		address.setName(edit.getName());
		address.setPhonenumber(edit.getPhonenumber());
		address.setPincode(edit.getPincode());
		address.setState(edit.getState());
		address.setAddress_status(edit.getAddress_status());
		address.setTypeofaddress(edit.getTypeofaddress());
		Address updated=addressrepo.save(address);
		return updated;
	}
	
}
