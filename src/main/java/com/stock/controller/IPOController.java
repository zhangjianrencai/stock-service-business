package com.stock.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entity.IPO;
import com.stock.entity.IPO;
import com.stock.service.IPOService;


/**
 * IPO相关的CRUD功能
 * 
 * @author JianZhang
 */
@RestController
@RequestMapping("/ipo")
public class IPOController {

    @Resource
    IPOService ipoService;

	@GetMapping
	public List<IPO> findAllIPOList() throws Exception{
		return ipoService.findAllIPOList();
	}
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody IPO ipo) throws Exception{
		ipoService.save(ipo);
		return ResponseEntity.ok("Save is OK"); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) throws Exception{
		ipoService.delete(id);
		return ResponseEntity.ok("Delete IPO successfully.");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable long id, @RequestBody IPO ipo) throws Exception{
		ipo.setId(id);
		ipoService.edit(ipo);
		return ResponseEntity.ok("Update is OK"); 
	}
	
	@GetMapping("/byUser")
	public List<Object> searchIPOByUser() throws Exception{
		return ipoService.searchIPOByUser();
	}
}				