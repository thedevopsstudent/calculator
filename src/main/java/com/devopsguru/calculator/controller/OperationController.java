package com.devopsguru.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devopsguru.calculator.service.OperationsService;

@RestController
public class OperationController {

	@Autowired
	private OperationsService service;
	
	@GetMapping(path = "/operation")
	public ResponseEntity<Object> operation(@RequestParam("num1") double num1,@RequestParam("num2") double num2,@RequestParam("op") String op){
		return service.operation(num1, num2, op);
	}
}
