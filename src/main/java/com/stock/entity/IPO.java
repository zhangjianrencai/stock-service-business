package com.stock.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IPO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	@Column(nullable = false)
	private String companyId;
	@Column(nullable = false)
	private String exchangeId;
	@Column(nullable = false)
	private String price;
	@Column(nullable = false)
	private String shares;
	@Column(nullable = true)
	private String remarks;
	@Column(nullable = false)
	private Timestamp dataTime;

	public IPO() {
		super();
	}

	public IPO(long id, String companyId, String exchangeId, String price, String shares, String remarks,
			Timestamp dataTime) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.exchangeId = exchangeId;
		this.price = price;
		this.shares = shares;
		this.remarks = remarks;
		this.dataTime = dataTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getShares() {
		return shares;
	}

	public void setShares(String shares) {
		this.shares = shares;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getDataTime() {
		return dataTime;
	}

	public void setDataTime(Timestamp dataTime) {
		this.dataTime = dataTime;
	}
}
	


