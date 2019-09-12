package com.thupham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thupham.dto.DeptEmpDto;
import com.thupham.entity.Department;
import com.thupham.repository.DepartmentRepository;

@Service
public class ServiceClass {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<DeptEmpDto> fetch(){
		return departmentRepository.fetchEmpDeptDataLeftJoin();
	}
	
	public Department add(Department d){
		Department dep = departmentRepository.save(d);
		return dep;
	}
}
