package com.thupham.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thupham.dto.DeptEmpDto;
import com.thupham.entity.Department;
import com.thupham.service.ServiceClass;

@RestController
public class DepartmentApi {
	@Autowired
	private ServiceClass service;
	
	@GetMapping(value = "/department")
	public List<DeptEmpDto> get(){
		return service.fetch();
	}
	
	@PostMapping(value = "/department")
	public Department create(@Valid @RequestBody Department d) {
		return service.add(d);
	}
}
