package com.eof.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eof.stock.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
