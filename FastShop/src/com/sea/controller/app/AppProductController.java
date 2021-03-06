package com.sea.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sea.controller.BaseController;
import com.sea.entity.Product;
import com.sea.mybatis.mapper.ProductMapper;
import com.sea.mybatis.param.ProductParams;
import com.sea.result.Result;

@RestController
@RequestMapping("product")
public class AppProductController extends BaseController<Product>{
	
	Logger logger = Logger.getLogger(AppProductController.class);
	
	@Autowired
	private ProductMapper productMapper;

	@ResponseBody
	@RequestMapping("test")
	public Map<String, Object> test(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "告白气球");
		map.put("b", "Faded");
		map.put("c", "演员");
		map.put("d", "一切还好");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("queryProduct")
	public Result queryProduct(ProductParams productParams){
		logger.debug("######################## queryProduct start #############################");
		logger.debug(productParams);
		List<Product> list = queryPageList("com.sea.mybatis.mapper.ProductMapper.queryProduct", productParams);
		Result result = new Result();
//		result.setData(productMapper.queryProduct(productParams));
		result.setData(list);
		return result;
	}
}
