package com.stock.service;


import java.util.List;

import com.stock.entity.Sector;

public interface SectorService {

	public Sector findById(long sectorId);

    public void save(Sector sector);

    public void edit(Sector sector);
    
    public List<Sector> findALL();
    
    public void delete(Long id);

}
