package com.sea.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sea.mybatis.param.BaseParams;

public class BaseController<T> {
	
	@Autowired
	protected SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<T> queryPageList(String statment, BaseParams params){
		int offset = params.getPageSize() * (params.getPageNum() - 1);
		params.setOffset(offset);
		return sqlSessionFactory.openSession().selectList(statment, params);
	}
	
}
