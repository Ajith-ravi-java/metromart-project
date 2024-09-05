package com.metromart.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metromart.site.entity.product;
import com.metromart.site.service.ProductService;

@RestController
@RequestMapping("/metromart/product")
public class productController {
	
	@Autowired
	private ProductService productservice;

	@PostMapping("/add")
	public product addProduct(@RequestBody product add) {
		return productservice.addProduct(add);
	}
	
	@GetMapping("/list")
	public List<product> listOfProduct() {
		return productservice.listOfProduct();
	}
	
	@GetMapping("/my-order/{userid}")
	public List<product> buyingProducts(@PathVariable int userid){
		return productservice.buyingProducts(userid);
	}
	
	@PutMapping("/edit")
	public product updatedetails(@RequestBody product edit) {
		return productservice.updatedetails(edit);
	}
	
}
