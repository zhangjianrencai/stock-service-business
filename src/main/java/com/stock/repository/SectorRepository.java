package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entity.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {
	
	public Sector findById(long sectorId);

}