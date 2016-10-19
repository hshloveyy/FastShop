package com.sea.controller.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.sea.controller.BaseController;
import com.sea.entity.AdminAccount;
import com.sea.mybatis.mapper.AdminAccountMapper;
import com.sea.result.Result;

@RestController
public class AdminController extends BaseController<AdminAccount> {

	@Autowired
	private AdminAccountMapper adminAccountMapper;
	
	@RequestMapping("registAdmin")
	public Result registAdmin(Map<String, String> params){
		return new Result();
	}
	
	@RequestMapping("loginAction")
	public ModelAndView loginAction(@RequestParam Map<String, Object> params, HttpSession session){
		AdminAccount admin = adminAccountMapper.adminLogin(params);
		if(admin != null){
			session.setAttribute("user", admin);
		}else{
			return modelViewFactory.LOGIN;
		}
		return modelViewFactory.INDEX;
	}
}
