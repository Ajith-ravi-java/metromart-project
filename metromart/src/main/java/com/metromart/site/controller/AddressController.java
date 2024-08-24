package com.metromart.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metromart.site.entity.Address;
import com.metromart.site.service.AddressService;

@RestController
@RequestMapping("/metromart/address")
public class AddressController {
	
	@Autowired
	private AddressService addressservice;
	
	@PostMapping("/add")
	public Address addAddress(@RequestBody Address add) {
		return addressservice.addAddress(add);
	}
	
	@GetMapping("/list")
	public List<Address> listOdAddress(){
		return addressservice.listOdAddress();
	}
	
	@PutMapping("edit")
	public Address editAddress(@RequestBody Address edit) {
		return addressservice.editAddress(edit);
	}
	
	
}
