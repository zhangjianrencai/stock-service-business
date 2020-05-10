package com.stock.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stock.entity.IPO;

@Repository
public interface IPORepository extends JpaRepository<IPO, Long> {
	
	@Query(value = "select c.company_name as companyName, c.ceo as CEO, c.directors as broadMember, c.brief as remarks, s.sector_name as sectorName from company c left join sector s on c.sector_id = s.id where c.id=?;", nativeQuery = true)
	public int searchIPOByUser(@Param("id")Long id);

}