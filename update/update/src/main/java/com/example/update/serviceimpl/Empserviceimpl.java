
package com.example.update.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.update.model.Emp;
import com.example.update.repository.EmpRepository;
import com.example.update.service.Empservice;

@Service
public class Empserviceimpl implements Empservice
{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Emp updatestu(int id,Emp emp1) {
		// TODO Auto-generated method stub
		
		Emp emp=empRepository.findById(id).get();
		
		emp.setName(emp1.getName());
		emp.setAddress(emp1.getAddress());
		emp.setRole(emp1.getRole());
		empRepository.save(emp);
		return emp ;
	}

	

	
}
