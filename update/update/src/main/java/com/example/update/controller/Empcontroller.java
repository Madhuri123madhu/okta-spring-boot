package com.example.update.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.update.model.Emp;
import com.example.update.service.Empservice;


@RestController
@RequestMapping("/update")
public class Empcontroller 
{
	@Autowired
	private Empservice empservice;
	
	
	
	
	@PutMapping("/method/{id}")
	public ResponseEntity<Emp> updatestu(@PathVariable int id,@RequestBody  Emp emp1)
	{
		Emp response = empservice.updatestu(id,emp1);
		return new ResponseEntity<Emp>(response, HttpStatus.OK);
	}


}
