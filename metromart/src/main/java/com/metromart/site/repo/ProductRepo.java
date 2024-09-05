package com.metromart.site.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metromart.site.entity.product;

@Repository
public interface ProductRepo extends JpaRepository<product, Integer> {

}
