package com.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.IPO;
import com.stock.repository.IPORepository;
import com.stock.service.IPOService;

@Service
public class IPOServiceImpl implements IPOService{

    @Autowired
    private IPORepository ipoRepository;

	@Override
	public Optional<IPO> findById(long ipoId) {
		return ipoRepository.findById(ipoId);
	}

	@Override
	public void save(IPO ipo) {
		ipoRepository.save(ipo);
	}
									
	@Override
	public void edit(IPO ipo) {
		IPO newipo = ipoRepository.getOne(ipo.getId());
		newipo.setCompanyId(ipo.getCompanyId());
		newipo.setCompanyName(ipo.getCompanyName());
		newipo.setDateTime(ipo.getDateTime());
		newipo.setExchangeId(ipo.getExchangeId());
		newipo.setPrice(ipo.getPrice());
		newipo.setRemarks(ipo.getRemarks());
		newipo.setShares(ipo.getShares());
		newipo.setStockExchange(ipo.getStockExchange());
		ipoRepository.save(newipo);
		//ipoRepository.update(ipo.getExchangeId(), ipo.getPrice(), ipo.getShares(), ipo.getDataTime(), ipo.getRemarks(), ipo.getCompanyName(), ipo.getStockExchange(),ipo.getCompanyId(), ipo.getId());
	}

	@Override
	public List<IPO> findAllIPOList() {
		return ipoRepository.findAll();
	}

	@Override
	public void delete(long id) {
		ipoRepository.deleteById(id);
	}

	@Override
	public Object searchIPOByUser(long id) {
		return ipoRepository.searchIPOByUser(id);
	}

  
}


