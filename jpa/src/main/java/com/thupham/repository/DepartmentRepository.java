package com.thupham.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thupham.dto.DeptEmpDto;
import com.thupham.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	@Query("SELECT new com.thupham.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();
}
