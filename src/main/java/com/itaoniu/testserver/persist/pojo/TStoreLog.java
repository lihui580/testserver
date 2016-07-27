package com.itaoniu.testserver.persist.pojo;

// Generated 2016-6-28 9:38:42 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * TStoreLog generated by hbm2java
 */
public class TStoreLog implements java.io.Serializable {

	private Long id;
	private String uuid;
	private long storeId;
	private String storeName;
	private long storeRoleId;
	private String storeRoleName;
	private long storeEmployeeId;
	private String storeEmployeeName;
	private String operation;
	private String operationType;
	private String params;
	private String result;
	private Date createTime;
	private Date updateTime;
	private int exist;

	public TStoreLog() {
	}

	public TStoreLog(String uuid, long storeId, String storeName, long storeRoleId, String storeRoleName, long storeEmployeeId, String storeEmployeeName, String operation, String operationType,
			String params, String result, Date createTime, Date updateTime, int exist) {
		this.uuid = uuid;
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeRoleId = storeRoleId;
		this.storeRoleName = storeRoleName;
		this.storeEmployeeId = storeEmployeeId;
		this.storeEmployeeName = storeEmployeeName;
		this.operation = operation;
		this.operationType = operationType;
		this.params = params;
		this.result = result;
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

	public long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public long getStoreRoleId() {
		return this.storeRoleId;
	}

	public void setStoreRoleId(long storeRoleId) {
		this.storeRoleId = storeRoleId;
	}

	public String getStoreRoleName() {
		return this.storeRoleName;
	}

	public void setStoreRoleName(String storeRoleName) {
		this.storeRoleName = storeRoleName;
	}

	public long getStoreEmployeeId() {
		return this.storeEmployeeId;
	}

	public void setStoreEmployeeId(long storeEmployeeId) {
		this.storeEmployeeId = storeEmployeeId;
	}

	public String getStoreEmployeeName() {
		return this.storeEmployeeName;
	}

	public void setStoreEmployeeName(String storeEmployeeName) {
		this.storeEmployeeName = storeEmployeeName;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
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
