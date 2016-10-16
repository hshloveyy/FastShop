package com.sea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController extends BaseController<Object> {

	@RequestMapping("")
	public String example(){
		return "";
	}
}
