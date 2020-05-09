package com.stock.service;


import java.util.List;
import java.util.Optional;

import com.stock.entity.Exchange;

public interface ExchangeService {

	public Optional<Exchange> findById(long id);

    public void save(Exchange exchange);

    public void edit(Exchange exchange);
    
    public List<Exchange> findAllExchangeList();
    
    public void delete(long id);

}
