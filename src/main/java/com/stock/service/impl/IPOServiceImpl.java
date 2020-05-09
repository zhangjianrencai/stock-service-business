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
		ipoRepository.save(ipo);
	}

	@Override
	public List<IPO> findAllIPOList() {
		return ipoRepository.findAll();
	}

	@Override
	public void delete(long id) {
		ipoRepository.deleteById(id);
	}

  
}


