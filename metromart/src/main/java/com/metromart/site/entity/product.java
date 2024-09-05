package com.metromart.site.entity;

import java.util.List;

import com.metromart.site.Enum.Products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private int user_id;
	private int price;
	private String brand;
	private Products productType; 
	private int ram;
	private int rom;
	private String productimageurl;
	private String model;
	private List<String> colour;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUser_id() {
		return user_id;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<String> getColour() {
		return colour;
	}
	public void setColour(List<String> colour) {
		this.colour = colour;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Products getProductType() {
		return productType;
	}
	public void setProductType(Products productType) {
		this.productType = productType;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getProductimageurl() {
		return productimageurl;
	}
	public void setProductimageurl(String productimageurl) {
		this.productimageurl = productimageurl;
	}
	public product(int product_id, int user_id, int price, String brand, Products productType, int ram, int rom,String productimageurl,List<String> colour) {
		super();
		this.product_id = product_id;
		this.user_id = user_id;
		this.price = price;
		this.brand = brand;
		this.productType = productType;
		this.ram = ram;
		this.rom = rom;
		this.productimageurl=productimageurl;
		this.colour=colour;
	}
	public product() {
		super();
	}
	
	
}
