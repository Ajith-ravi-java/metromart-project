package com.metromart.site.entity;

import com.metromart.site.Enum.Type;
import com.metromart.site.Enum.userStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int address_id;
	private String name;
	private String phonenumber;
	private String pincode;
	private String state;
	private String city;
	private String housenumber;
	private String area;
	private Type typeofaddress;
	private userStatus address_status;
	
	
	
	public userStatus getAddress_status() {
		return address_status;
	}
	public void setAddress_status(userStatus address_status) {
		this.address_status = address_status;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Type getTypeofaddress() {
		return typeofaddress;
	}
	public void setTypeofaddress(Type typeofaddress) {
		this.typeofaddress = typeofaddress;
	}
	public Address(int address_id, String name, String phonenumber,userStatus address_status, String pincode, String state, String city,
			String housenumber, String area, Type typeofaddress) {
		super();
		this.address_id = address_id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.pincode = pincode;
		this.state = state;
		this.city = city;
		this.housenumber = housenumber;
		this.area = area;
		this.typeofaddress = typeofaddress;
		this.address_status=address_status;
	}
	public Address() {
		super();
	}
	
	
	
}
