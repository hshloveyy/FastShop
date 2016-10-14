package com.sea.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sea.entity.Company;
import com.sea.mybatis.param.CompanyParams;

@Repository
public interface CompanyMapper {
	
	List<Company> queryCompany(CompanyParams companyParams);

}
