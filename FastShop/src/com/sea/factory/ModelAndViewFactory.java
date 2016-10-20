package com.sea.factory;

import org.springframework.web.servlet.ModelAndView;

public abstract class ModelAndViewFactory {
	
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	public ModelAndView login(){
		return new ModelAndView("login");
	}
	
	public ModelAndView error_500(){
		return new ModelAndView("error/500");
	}
	
	public ModelAndView error_404(){
		return new ModelAndView("error/404");
	}
	
	public abstract ModelAndView create(String viewName);
}
