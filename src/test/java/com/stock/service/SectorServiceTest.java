package com.stock.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stock.entity.Sector;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SectorServiceTest {
	
	@Autowired
	private SectorService sectorService;
	
	private Sector generateSector() {
		Sector sector = new Sector();
		sector.setBrief("brief");
		sector.setId(123);
		sector.setSectorName("sectorName");
		return sector;
	}

	@Test
    @Transactional
    @Rollback
	public void testSave() {
		Sector sector = this.generateSector();
		Sector savedSector = sectorService.save(sector);
		Assert.assertEquals(savedSector.getSectorName(), "sectorName");
		Assert.assertEquals(savedSector.getBrief(), "brief");
	}
	
	@Test
    @Transactional
    @Rollback
	public void testFindById() {
		Sector sector = this.generateSector();
		Sector savedSector = sectorService.save(sector);
		Assert.assertEquals(savedSector.getSectorName(), "sectorName");
		Assert.assertEquals(savedSector.getBrief(), "brief");
	}

	@Test
    @Transactional
    @Rollback
    public void testEdit() {
		Sector sector1 = this.generateSector();
		Sector savedSector = sectorService.save(sector1);
		Assert.assertEquals(savedSector.getSectorName(), "sectorName");
		Assert.assertEquals(savedSector.getBrief(), "brief");
	}
    
	@Test
    @Transactional
    @Rollback
    public void findALL() {
		Sector sector = this.generateSector();
		Sector savedSector = sectorService.save(sector);
		Assert.assertEquals(savedSector.getSectorName(), "sectorName");
		Assert.assertEquals(savedSector.getBrief(), "brief");
		
	}
    
	@Test
    @Transactional
    @Rollback
    public void testDelete() {
		Sector sector = this.generateSector();
		Sector savedSector = sectorService.save(sector);
		Assert.assertEquals(savedSector.getSectorName(), "sectorName");
		Assert.assertEquals(savedSector.getBrief(), "brief");
	}
}
