package com.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entity.IPO;
import com.stock.entity.Sector;

@Repository
public interface IPORepository extends JpaRepository<IPO, Long> {

}