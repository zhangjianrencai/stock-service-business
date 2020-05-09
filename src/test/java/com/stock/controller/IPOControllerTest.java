/**
 * 
 */
package com.stock.controller;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author JianZhang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration
public class IPOControllerTest {

	private MockMvc mvc; 
	
	@Before 
	public void setUp() throws Exception { 
		mvc = MockMvcBuilders.standaloneSetup(new CompanyController()).build(); 
	}
	
	@Test 
	public void testUserController() throws Exception { 
        // 测试UserController 
		RequestBuilder request = null; 
 
		// 1、get查一下user列表，应该为空 
		request = get("/api/ipo/"); 
		mvc.perform(request) 
				.andExpect(status().isOk());
				//.andExpect(content().string(equalTo("[]"))); 
		
		// 2、post提交一个user 
		request = post("/api/ipo/") 
				.param("companyId", "123") 
				.param("exchangeId", "123") 
				.param("price", "20")
				.param("shares", "1") 
				.param("remarks", "test") 
				.param("dataTime", "2018-08-10"); 
		mvc.perform(request) 
		        .andExpect(content().string(equalTo("Save is OK"))); 
 
	} 

}
