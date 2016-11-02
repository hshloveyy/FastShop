package com.sea.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sea.controller.BaseController;
import com.sea.entity.DictionaryType;
import com.sea.mybatis.mapper.DictionaryMapper;

@RestController
public class DictionaryController extends BaseController<Object> {

	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@RequestMapping("dictionary")
	public ModelAndView dictionary(){
		List<DictionaryType> dictTypeList = dictionaryMapper.queryDictionaryType();
		toJsonString(dictTypeList);
		return modelViewFactory.create("setting/dictionary").addObject("dictionaryTypeList", dictTypeList);
	}
}
