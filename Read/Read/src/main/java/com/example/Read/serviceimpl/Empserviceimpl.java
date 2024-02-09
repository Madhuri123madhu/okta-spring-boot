package com.example.Read.serviceimpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Read.model.Emp;
import com.example.Read.repository.EmpRepository;
import com.example.Read.service.Empservice;



@Service
public class Empserviceimpl implements Empservice
{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Emp> getAlldetails() {
		
		return empRepository.findAll();
	}


}
