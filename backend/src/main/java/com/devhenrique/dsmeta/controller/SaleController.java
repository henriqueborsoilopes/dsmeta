package com.devhenrique.dsmeta.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ResponseEntity<List<Sale>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
}
