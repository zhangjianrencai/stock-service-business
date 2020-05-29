package com.stock.repository;

import java.sql.Timestamp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stock.entity.IPO;

@Repository
public interface IPORepository extends JpaRepository<IPO, Long> {
    
	@Query(value = "select c1.id as id, c1.stock_code as stock_code ,sptotal.current_price as current_price from company c1 inner join (select sp1.current_price, sp1.stock_code from stock_price sp1 , (select max(date_time) as time from stock_price group by stock_code) sp where sp1.date_time = sp.time) sptotal on c1.stock_code = sptotal.stock_code;", nativeQuery = true)
	public List<Object> searchIPOListByUser();
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE ipo\n" + 
			"SET exchange_id=?, price=?, shares=?, data_time=?, remarks=?, company_name=?, stock_exchange=?, company_id=?\n" + 
			"WHERE id=?;",nativeQuery = true)
	public int update(@Param("exchange_id")String exchange_id, @Param("price")String price, @Param("shares")String shares, @Param("data_time")Timestamp data_time, @Param("remarks")String remarks, @Param("company_name")String company_name, @Param("stock_exchange")String stock_exchange, @Param("company_id")String company_id, @Param("id")Long id);

}