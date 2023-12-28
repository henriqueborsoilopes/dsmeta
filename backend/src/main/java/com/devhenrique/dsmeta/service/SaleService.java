package com.devhenrique.dsmeta.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devhenrique.dsmeta.entity.Sale;
import com.devhenrique.dsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	private final SaleRepository repository;
	
	public SaleService(SaleRepository repository) {
		this.repository = repository;
	}
	
	public Page<Sale> findAll(String minDate, String maxDate, Pageable pageable) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		return repository.findAllByDate(min, max, pageable);
	}
}
