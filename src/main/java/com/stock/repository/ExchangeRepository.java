package com.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entity.Exchange;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

}