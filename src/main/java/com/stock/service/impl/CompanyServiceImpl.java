package com.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.Company;
import com.stock.entity.IPO;
import com.stock.repository.CompanyRepository;
import com.stock.repository.IPORepository;
import com.stock.service.CompanyService;
import com.stock.service.IPOService;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

	@Override
	public Optional<Company> findById(long id) {
		return companyRepository.findById(id);
	}

	@Override
	public void save(Company company) {
		companyRepository.save(company);
	}

	@Override
	public void edit(Company company) {
		companyRepository.save(company);
	}

	@Override
	public List<Company> findAllCompanyList() {
		return companyRepository.findAll();
	}

	@Override
	public void delete(long id) {
		companyRepository.deleteById(id);
	}

}


