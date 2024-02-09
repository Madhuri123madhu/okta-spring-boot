
package com.example.okta.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.okta.demo.Repository.EmpRepository;
import com.example.okta.demo.model.Emp;
import com.example.okta.demo.service.Empservice;


@Service
public class Empserviceimpl implements Empservice
{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Emp saveEmployee(Emp emp) {
		
		return empRepository.save(emp); 
	}

	
}
