package com.itaoniu.testserver.persist.pojo;

// Generated 2016-6-28 9:38:42 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * TStoreSetting generated by hbm2java
 */
public class TStoreSetting implements java.io.Serializable {

	private Integer id;
	private String uuid;
	private String storeId;
	private String name;
	private String type;
	private int option;
	private Date createTime;
	private Date updateTime;
	private int exist;

	public TStoreSetting() {
	}

	public TStoreSetting(String uuid, String storeId, String name, String type, int option, Date createTime, Date updateTime, int exist) {
		this.uuid = uuid;
		this.storeId = storeId;
		this.name = name;
		this.type = type;
		this.option = option;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.exist = exist;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getOption() {
		return this.option;
	}

	public void setOption(int option) {
		this.option = option;
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
