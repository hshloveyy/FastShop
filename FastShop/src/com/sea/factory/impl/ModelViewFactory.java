package com.sea.factory.impl;

import org.springframework.web.servlet.ModelAndView;

import com.sea.factory.ModelAndViewFactory;

public class ModelViewFactory extends ModelAndViewFactory{

	@Override
	public ModelAndView create(String viewName) {
		return new ModelAndView(viewName);
	}
}
