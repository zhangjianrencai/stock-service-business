package com.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.StockPrice;
import com.stock.repository.StockPriceRepository;
import com.stock.service.StockPriceService;

@Service
public class StockPriceServiceImpl implements StockPriceService{

    @Autowired
    private StockPriceRepository stockPriceRepository;

    @Override
    public void save(StockPrice stockPrice) {
    	stockPriceRepository.save(stockPrice);
    }
    
    @Override
    public Object companyStockPrice(long companyId, String startDate, String endDate) {
    	return stockPriceRepository.companyStockPrice(companyId, startDate, endDate);
    }
}


