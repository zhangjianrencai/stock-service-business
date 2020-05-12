package com.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.Sector;
import com.stock.repository.SectorRepository;
import com.stock.service.SectorService;

@Service
public class SectorServiceImpl implements SectorService{

    @Autowired
    private SectorRepository sectorRepository;

    @Override
    public Sector save(Sector sector) {
    	return sectorRepository.save(sector);
    }

	@Override
	public Sector findById(long sectorId) {
		return sectorRepository.findById(sectorId);
	}

	@Override
	public List<Sector> findALL() {
		return sectorRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		sectorRepository.deleteById(id);
		
	}

	@Override
	public void edit(Sector sector) {
		sectorRepository.save(sector);
	}
}


