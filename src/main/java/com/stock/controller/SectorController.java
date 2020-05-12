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

import com.stock.entity.Sector;
import com.stock.service.SectorService;


/**
 * Sector相关的CRUD功能
 * 
 * @author JianZhang
 */
@RestController
@RequestMapping("/api/sector")
//@CrossOrigin(origins="http://localhost:4200")
public class SectorController {
	
    @Resource
    SectorService sectorService;
    
	@GetMapping
	public List<Sector> findAllSectorList() throws Exception{
		return sectorService.findALL();
	}
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Sector sector) throws Exception{
		sectorService.save(sector);
		return ResponseEntity.ok("Save is OK"); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) throws Exception{
		sectorService.delete(id);
		return ResponseEntity.ok("Delete sector successfully.");
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Sector sector) throws Exception{
		sectorService.save(sector);
		return ResponseEntity.ok("Update is OK"); 
	}
}				