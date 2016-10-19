package com.sea.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sea.entity.AdminAccount;

@Repository
public interface AdminAccountMapper {
	
	List<AdminAccount> queryAdminAccount(Map<String, Object> params);

}
