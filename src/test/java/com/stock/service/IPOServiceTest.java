package com.stock.service;

import static org.junit.Assert.*;

import java.security.Timestamp;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.stock.entity.IPO;

import junit.framework.Assert;

public class IPOServiceTest {

	@Autowired
	private IPOService ipoService;
	
	private IPO generateIPO() {
		IPO ipo = new IPO();
		ipo.setCompanyId("123");
		
		return ipo;
	}

	@Test
    @Transactional
    @Rollback
	public void testSave() {
		/*
		 * IPO ipo = this.generateipo(); IPO savedipo = ipoService.save(ipo);
		 * Assert.assertEquals(savedipo.getipoName(), "ipoName");
		 * Assert.assertEquals(savedipo.getBrief(), "brief");
		 */
	}
	
	@Test
    @Transactional
    @Rollback
	public void testFindById() {
		/*
		 * IPO ipo = this.generateipo(); IPO savedipo = ipoService.save(ipo);
		 * Assert.assertEquals(savedipo.getipoName(), "ipoName");
		 * Assert.assertEquals(savedipo.getBrief(), "brief");
		 */
	}

	@Test
    @Transactional
    @Rollback
    public void testEdit() {
		/*
		 * IPO ipo1 = this.generateipo(); IPO savedipo = ipoService.save(ipo1);
		 * Assert.assertEquals(savedipo.getipoName(), "ipoName");
		 * Assert.assertEquals(savedipo.getBrief(), "brief");
		 */
	}
    
	@Test
    @Transactional
    @Rollback
    public void findALL() {
		/*
		 * IPO ipo = this.generateipo(); IPO savedipo = ipoService.save(ipo);
		 * Assert.assertEquals(savedipo.getipoName(), "ipoName");
		 * Assert.assertEquals(savedipo.getBrief(), "brief");
		 */
		
	}
    
	@Test
    @Transactional
    @Rollback
    public void testDelete() {
		/*
		 * IPO ipo = this.generateipo(); IPO savedipo = ipoService.save(ipo);
		 * Assert.assertEquals(savedipo.getipoName(), "ipoName");
		 * Assert.assertEquals(savedipo.getBrief(), "brief");
		 */
	}

}
