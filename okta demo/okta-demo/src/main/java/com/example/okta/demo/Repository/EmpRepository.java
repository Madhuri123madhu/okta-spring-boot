package com.example.okta.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.okta.demo.model.Emp;


@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>
{
	

}
