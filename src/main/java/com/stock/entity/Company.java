package com.stock.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	@Column(nullable = false)
	private String companyName;
	// 营业额
	@Column(nullable = false)
	private String turnover;
	@Column(nullable = false)
	private String ceo;
	@Column(nullable = false)
	private String directors;
	@Column(nullable = false)
	private String stockCode;
	@Column(nullable = false)
	private String brief;
	
	@ManyToMany
	@JoinTable(name = "company_sector", 
			joinColumns = @JoinColumn(name = "company_id"),
			inverseJoinColumns = @JoinColumn(name = "sector_id"))
	private List<Sector> sector;
	
	@ManyToMany
	@JoinTable(name = "company_exchange", 
			joinColumns = @JoinColumn(name = "company_id"),
			inverseJoinColumns = @JoinColumn(name = "exchange_id"))
	private List<Exchange> exchange;

	public List<Exchange> getExchange() {
		return exchange;
	}

	public void setExchange(List<Exchange> exchange) {
		this.exchange = exchange;
	}

	public List<Sector> getSector() {
		return sector;
	}

	public void setSector(List<Sector> sector) {
		this.sector = sector;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTurnover() {
		return turnover;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
	
}
	


