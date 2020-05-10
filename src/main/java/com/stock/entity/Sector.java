package com.stock.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="sector")
public class Sector implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	@Column(nullable = false)
	private String sectorName;
	@Column(nullable = false)
	private String brief;

	public Sector() {
		super();
	}

	public Sector(long id, String sectorName, String brief) {
		super();
		this.id = id;
		this.sectorName = sectorName;
		this.brief = brief;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
	
}
	


