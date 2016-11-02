package com.sea.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sea.entity.Dictionary;
import com.sea.entity.DictionaryType;

@Repository
public interface DictionaryMapper {
	
	List<Dictionary> queryDictionary();
	
	List<DictionaryType> queryDictionaryType();

}
