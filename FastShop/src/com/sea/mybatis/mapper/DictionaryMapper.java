package com.sea.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sea.entity.Dictionary;

@Repository
public interface DictionaryMapper {
	
	List<Dictionary> queryDictionary();

}
