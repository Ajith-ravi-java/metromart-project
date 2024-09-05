package com.metromart.site.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metromart.site.entity.product;
import com.metromart.site.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productrepo;

	public product addProduct(product add) {
		return productrepo.save(add);
	}

	public List<product> listOfProduct() {
		return productrepo.findAll();
	}

	public List<product> buyingProducts(int userid) {
		List<product> myorder=new ArrayList<>();
		List<product> allproducts=productrepo.findAll();
		for(product pro:allproducts) {
			if(pro.getUser_id()==userid) {
				myorder.add(pro);
			}
		}
		
		return myorder;
	}

	public product updatedetails(product edit) {

		product getproduct=productrepo.findById(edit.getProduct_id()).orElse(null);
		getproduct.setBrand(edit.getBrand());
		getproduct.setPrice(edit.getPrice());
		getproduct.setProductimageurl(edit.getProductimageurl());
		getproduct.setProductType(edit.getProductType());
		getproduct.setRam(edit.getRam());
		getproduct.setRom(edit.getRom());
		getproduct.setUser_id(edit.getUser_id());
		getproduct.setModel(edit.getModel());
		getproduct.setColour(edit.getColour());
		product updated=productrepo.save(getproduct);
		return updated;
	}

	
}
