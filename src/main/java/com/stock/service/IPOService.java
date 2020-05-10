package com.stock.service;


import java.util.List;
import java.util.Optional;

import com.stock.entity.IPO;

public interface IPOService {

	public Optional<IPO> findById(long id);

    public void save(IPO ipo);

    public void edit(IPO ipo);
    
    public List<IPO> findAllIPOList();
    
    public void delete(long id);
    
    public Object searchIPOByUser(long id);
}
