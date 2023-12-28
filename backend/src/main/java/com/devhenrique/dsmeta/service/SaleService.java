package com.devhenrique.dsmeta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devhenrique.dsmeta.entity.Sale;
import com.devhenrique.dsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	private final SaleRepository repository;
	
	public SaleService(SaleRepository repository) {
		this.repository = repository;
	}
	
	public List<Sale> findAll() {
		return repository.findAll();
	}
}
