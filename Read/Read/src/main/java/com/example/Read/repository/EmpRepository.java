package com.example.Read.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Read.model.Emp;


@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>
{

}
