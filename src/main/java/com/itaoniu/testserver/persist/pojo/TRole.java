package com.itaoniu.testserver.persist.pojo;

// Generated 2016-6-28 9:38:42 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * TRole generated by hbm2java
 */
public class TRole implements java.io.Serializable {

	private Long id;
	private String uuid;
	private String number;
	private String name;
	private int rank;
	private Date createTime;
	private Date updateTime;
	private int exist;

	public TRole() {
	}

	public TRole(String uuid, String number, String name, int rank, Date createTime, Date updateTime, int exist) {
		this.uuid = uuid;
		this.number = number;
		this.name = name;
		this.rank = rank;
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

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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
