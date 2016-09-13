package com.sea.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sea.entity.Product;

@Repository
public interface ProductMapper {
	
	List<Product> queryProduct();

}
