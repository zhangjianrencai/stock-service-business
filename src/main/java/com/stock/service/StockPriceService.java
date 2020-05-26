package com.stock.service;


import com.stock.entity.StockPrice;

public interface StockPriceService {

    public void save(StockPrice stockPrice);
    
    public Object companyStockPrice(long companyId, String startDate, String endDate);

}
