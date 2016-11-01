package com.sea.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sea.controller.BaseController;

@RestController
public class DictionaryController extends BaseController<Object> {

	@RequestMapping("dictionary")
	public ModelAndView dictionary(){
		return modelViewFactory.create("setting/dictionary");
	}
}
