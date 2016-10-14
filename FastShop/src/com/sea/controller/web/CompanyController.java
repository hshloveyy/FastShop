package com.sea.controller.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sea.controller.BaseController;
import com.sea.entity.Company;
import com.sea.mybatis.mapper.CompanyMapper;
import com.sea.mybatis.param.CompanyParams;
import com.sea.result.Result;

@RestController
public class CompanyController extends BaseController<Company>{
	
	Logger logger = Logger.getLogger(CompanyController.class);
	
	@Autowired
	private CompanyMapper companyMapper;

	@RequestMapping("queryCompany")
	public Result queryCompany(CompanyParams companyParams){
		logger.debug("######################## queryCompany start #############################");
		logger.debug(companyParams);
//		List<Product> list = queryPageList("com.sea.mybatis.mapper.CompanyMapper.queryCompany", companyParams);
		Result result = new Result();
		result.setData(companyMapper.queryCompany(companyParams));
//		result.setData(list);
		return result;
	}
}
