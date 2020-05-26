package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stock.entity.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {
	
	@Query(value = "UPDATE ipo\n" + 
			"SET exchange_id=?, price=?, shares=?, data_time=?, remarks=?, company_name=?, stock_exchange=?, company_id=?\n" + 
			"WHERE id=?;",nativeQuery = true)
	public Object companyStockPrice(@Param("companyId")long companyId, @Param("startDate")String startDate,  @Param("endDate")String endDate);

}