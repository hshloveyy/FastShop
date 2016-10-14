package com.sea.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sea.controller.BaseController;

@RestController
public class IndexController extends BaseController<Object> {

	@RequestMapping("login")
	private ModelAndView index(){
		return new ModelAndView("login");
	}
	
	@RequestMapping("index")
	private ModelAndView main(){
		return new ModelAndView("index");
	}
}
