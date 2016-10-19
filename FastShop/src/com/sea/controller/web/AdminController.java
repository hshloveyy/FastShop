package com.sea.controller.web;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sea.controller.BaseController;
import com.sea.entity.AdminAccount;
import com.sea.result.Result;

@RestController
public class AdminController extends BaseController<AdminAccount> {

	@RequestMapping("registAdmin")
	public Result registAdmin(Map<String, String> params){
		return new Result();
	}
	
	@RequestMapping("loginAction")
	public ModelAndView loginAction(@RequestParam Map<String, String> params){
		toJsonString(params);
		return new ModelAndView("index");
	}
}
