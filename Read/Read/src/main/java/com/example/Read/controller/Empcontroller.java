package com.example.Read.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Read.model.Emp;
import com.example.Read.service.Empservice;

@RestController
@RequestMapping("/Readapplication")
public class Empcontroller 
{

	
	@Autowired
	private Empservice empService;
	
	@GetMapping("/getallempdetails")
	public List<Emp> getallepdetails()
	{
		 return empService.getAlldetails();
		
	}
	
}
