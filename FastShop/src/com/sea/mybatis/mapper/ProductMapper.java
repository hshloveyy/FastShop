package com.sea.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sea.entity.Product;
import com.sea.mybatis.param.ProductParams;

@Repository
public interface ProductMapper {
	
	List<Product> queryProduct(ProductParams productParams);

}
