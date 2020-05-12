package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entity.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {
	

}