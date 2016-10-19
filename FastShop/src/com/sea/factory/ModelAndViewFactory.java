package com.sea.factory;

import org.springframework.web.servlet.ModelAndView;

public abstract class ModelAndViewFactory {

	public ModelAndView INDEX = null;
	public ModelAndView LOGIN = null;
	public ModelAndView ERROR = null;
	
	{
		INDEX = new ModelAndView("index");
		LOGIN = new ModelAndView("login");
		ERROR = new ModelAndView("error/500");
	}
	
	public abstract ModelAndView create(String viewName);
}
