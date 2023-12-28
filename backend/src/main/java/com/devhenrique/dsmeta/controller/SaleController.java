package com.devhenrique.dsmeta.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devhenrique.dsmeta.entity.Sale;
import com.devhenrique.dsmeta.service.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	private final SaleService service;
	
	public SaleController(SaleService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<Page<Sale>> findAll(
			@RequestParam(value = "minDate", defaultValue = "") String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable pageable) {
		return ResponseEntity.ok().body(service.findAll(minDate, maxDate, pageable));
	}
}
