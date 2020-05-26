package com.stock.service;


import java.util.List;
import java.util.Optional;

import com.stock.entity.Company;

public interface CompanyService {

	public Optional<Company> findById(long id);

    public void save(Company company);

    public void edit(Company company);
    
    public List<Company> findAllCompanyList();
    
    public void delete(long id);
}
