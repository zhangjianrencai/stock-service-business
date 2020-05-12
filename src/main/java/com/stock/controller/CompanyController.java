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
import com.stock.service.CompanyService;


/**
 * Company相关的CRUD功能
 * 
 * @author JianZhang
 */
@RestController
@RequestMapping("/api/company")
public class CompanyController {
    @Resource
    CompanyService companyService;
    
    /**
     * 查找所有的Company
     * 
     * @return List<Company>
     */
	@GetMapping
	public List<Company> findAllCompanyList(){
		return companyService.findAllCompanyList();
	}
	
    /**
     * 保存一个Company信息
     * 
     * @return String 
     */
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Company company){
		companyService.save(company);
		return ResponseEntity.ok("Save is OK"); 
	}
	
    /**
     * 删除固定Company
     * 
     * @return String
     */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		companyService.delete(id);
		return ResponseEntity.ok("Delete company successfully.");
	}
	
    /**
     * 更新对应Company
     * 
     * @return String
     */
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Company company){
		companyService.save(company);
		return ResponseEntity.ok("Update is OK"); 
	}
}				