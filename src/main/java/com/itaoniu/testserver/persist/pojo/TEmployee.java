package com.itaoniu.testserver.persist.pojo;

// Generated 2016-6-28 9:38:42 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * TEmployee generated by hbm2java
 */
public class TEmployee implements java.io.Serializable {

	private Long id;
	private String uuid;
	private String number;
	private String name;
	private String password;
	private int status;
	private Date createTime;
	private Date updateTime;
	private int exist;

	public TEmployee() {
	}

	public TEmployee(String uuid, String number, String name, String password, int status, Date createTime, Date updateTime, int exist) {
		this.uuid = uuid;
		this.number = number;
		this.name = name;
		this.password = password;
		this.status = status;
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

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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
