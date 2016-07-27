package com.itaoniu.testserver.persist.pojo;

// Generated 2016-6-28 9:38:42 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * TPermission generated by hbm2java
 */
public class TPermission implements java.io.Serializable {

	private Long id;
	private String name;
	private String clazz;
	private String method;
	private Date createTime;
	private Date updateTime;
	private int exist;

	public TPermission() {
	}

	public TPermission(String name, String clazz, String method, Date createTime, Date updateTime, int exist) {
		this.name = name;
		this.clazz = clazz;
		this.method = method;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.exist = exist;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClazz() {
		return this.clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getExist() {
		return this.exist;
	}

	public void setExist(int exist) {
		this.exist = exist;
	}

}
