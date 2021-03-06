package com.stock.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entity.Exchange;
import com.stock.service.ExchangeService;


/**
 * StockExchange相关的CRUD功能
 * 
 * @author JianZhang
 */
@RestController
@RequestMapping("/exchange")
public class ExchangeController {
    @Resource
    ExchangeService exchangeService;
	
	@GetMapping
	public List<Exchange> findAllExchangeList() throws Exception{
		return exchangeService.findAllExchangeList();
	}
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Exchange exchange) throws Exception{
		exchangeService.save(exchange);
		return ResponseEntity.ok("Save is OK"); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) throws Exception{
		exchangeService.delete(id);
		return ResponseEntity.ok("Delete Exchange successfully.");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable long id, @RequestBody Exchange exchange) throws Exception{
		exchange.setId(id);
		exchangeService.save(exchange);
		return ResponseEntity.ok("Update is OK"); 
	}
}				