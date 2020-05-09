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

import com.stock.entity.Company;
import com.stock.entity.Company;
import com.stock.service.CompanyService;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
    @Resource
    CompanyService companyService;
	@GetMapping
	public List<Company> findAllCompanyList(){
		return companyService.findAllCompanyList();
	}
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Company company){
		companyService.save(company);
		return ResponseEntity.ok("Save is OK"); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		companyService.delete(id);
		return ResponseEntity.ok("Delete company successfully.");
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Company company){
		companyService.save(company);
		return ResponseEntity.ok("Update is OK"); 
	}
}				