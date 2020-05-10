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

@RestController
@RequestMapping("/api/ipo")
public class IPOController {

    @Resource
    IPOService ipoService;

	@GetMapping
	public List<IPO> findAllIPOList(){
		return ipoService.findAllIPOList();
	}
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody IPO ipo){
		ipoService.save(ipo);
		return ResponseEntity.ok("Save is OK"); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		ipoService.delete(id);
		return ResponseEntity.ok("Delete IPO successfully.");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update(@RequestBody IPO ipo){
		ipoService.save(ipo);
		return ResponseEntity.ok("Update is OK"); 
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> searchIPOByUser(@PathVariable long id){
		ResponseEntity<Object> searchIPOByUser = (ResponseEntity<Object>) ipoService.searchIPOByUser(id);
		return searchIPOByUser;
	}
}				