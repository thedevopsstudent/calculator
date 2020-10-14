package com.devopsguru.calculator.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OperationsService {

	public ResponseEntity<Object> operation(double num1,double num2,String op){
		
		double result;
		if(op.equalsIgnoreCase("ADD")) {
			result = num1+num2;
		}
		else if(op.equalsIgnoreCase("SUB")) {
			result = num1-num2;
		}
		else if(op.equalsIgnoreCase("MUL")) {
			result = num1*num2;
		}
		else if(op.equalsIgnoreCase("MOD")) {
			result = num1%num2;
		}
		else if(op.equalsIgnoreCase("DIV")) {
			if(num2==0.0)
				return new ResponseEntity<>("Num2 cannot be 0",HttpStatus.BAD_REQUEST);
			result = num1/num2; 
		}
		else
			return new ResponseEntity<>("Invalid Operator",HttpStatus.BAD_REQUEST);
		return new ResponseEntity<Object>(result,HttpStatus.OK);
	}
}
