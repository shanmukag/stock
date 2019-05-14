package com.eof.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eof.stock.model.Employee;
import com.eof.stock.repository.EmpRepository;

@Service
public class EmpService implements IEmpService{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee saveEmp(Employee emp) {

		return empRepository.save(emp);
	}
	
	
	

}
