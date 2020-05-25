package com.stock.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stock.entity.IPO;

@Repository
public interface IPORepository extends JpaRepository<IPO, Long> {
    
	@Query(value = "select c.company_name as companyName, c.ceo as CEO, c.directors as broadMember, c.brief as remarks, s.sector_name as sectorName from company c left join sector s on c.id = s.id where c.id=?;", nativeQuery = true)
	public Object searchIPOByUser(@Param("id")Long id);
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE ipo\n" + 
			"SET exchange_id=?, price=?, shares=?, data_time=?, remarks=?, company_name=?, stock_exchange=?, company_id=?\n" + 
			"WHERE id=?;",nativeQuery = true)
	public int update(@Param("exchange_id")String exchange_id, @Param("price")String price, @Param("shares")String shares, @Param("data_time")Timestamp data_time, @Param("remarks")String remarks, @Param("company_name")String company_name, @Param("stock_exchange")String stock_exchange, @Param("company_id")String company_id, @Param("id")Long id);

}