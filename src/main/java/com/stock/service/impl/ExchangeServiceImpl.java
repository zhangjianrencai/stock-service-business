package com.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.Exchange;
import com.stock.entity.IPO;
import com.stock.repository.ExchangeRepository;
import com.stock.service.ExchangeService;

@Service
public class ExchangeServiceImpl implements ExchangeService{

    @Autowired
    private ExchangeRepository exchangeRepository;


	@Override
	public void save(Exchange exchange) {
		exchangeRepository.save(exchange);
	}


	@Override
	public Optional<Exchange> findById(long id) {
		return exchangeRepository.findById(id);
	}


	@Override
	public void edit(Exchange exchange) {
		Exchange newExchange = exchangeRepository.getOne(exchange.getId());
		newExchange.setBrief(exchange.getBrief());
		newExchange.setContactAddress(exchange.getContactAddress());
		newExchange.setRemarks(exchange.getRemarks());
		newExchange.setStockExchange(exchange.getStockExchange());
		exchangeRepository.save(exchange);
	}


	@Override
	public List<Exchange> findAllExchangeList() {
		return exchangeRepository.findAll();
	}


	@Override
	public void delete(long id) {
		exchangeRepository.deleteById(id);
	}


}


