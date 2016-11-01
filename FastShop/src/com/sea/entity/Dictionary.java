package com.sea.entity;

import java.io.Serializable;


/**
 * The persistent class for the t_com_sys_dictionary database table.
 * 
 */
public class Dictionary implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private int id;

	private String name;

	private int typeId;

	public Dictionary() {
	}

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

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}