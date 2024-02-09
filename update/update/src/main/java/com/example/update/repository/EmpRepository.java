package com.example.update.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.update.model.Emp;


@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {

//	Emp save(Emp stu1);

}
