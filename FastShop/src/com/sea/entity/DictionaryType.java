package com.sea.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the t_com_sys_dictionary_type database table.
 * 
 */
public class DictionaryType implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private int id;

	private String name;
	
	private Date createTime;
	
	private Date modifyTime;
	
	private String modifyUser;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	
}