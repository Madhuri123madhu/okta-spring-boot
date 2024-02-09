
package com.example.okta.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.okta.demo.model.Emp;
import com.example.okta.demo.service.Empservice;

@RestController
@RequestMapping("/rest")
public class Empcontroller {

	@Autowired
	private Empservice empService;

	@PostMapping("/trained")
	public ResponseEntity<Emp> saveEmp(@RequestBody Emp emp) {
		return ResponseEntity.status(HttpStatus.CREATED).body(empService.saveEmployee(emp));
	}

}
