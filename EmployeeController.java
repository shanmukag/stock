package com.eof.stock.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eof.stock.custom.PasswordGenerator;
import com.eof.stock.model.Employee;
import com.eof.stock.service.IEmpService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private IEmpService iEmpService;

	@RequestMapping("/saveEmp")
	@ResponseBody
	public Employee saveEmp(@RequestBody Employee emp) {
		if (emp != null) {
			
			String s1 = emp.getFirst_name().substring(0, 1).toUpperCase();
			String fname = s1 + emp.getFirst_name().substring(1).trim();
			emp.setFirst_name(fname);

			String s2 = emp.getLast_name().substring(0, 1).toUpperCase().trim();
			String lname = s2 + emp.getLast_name().substring(1);
			emp.setLast_name(lname);
			// email generation
			int fcount = iEmpService.getFirstNameCount(fname);
			int lcount = iEmpService.getLastNameCount(lname);
			if (fcount > 0 && lcount > 0) {
				String shan = String.format("%03d", fcount);
				String email = emp.getFirst_name() + shan + '.' + emp.getLast_name() + "@infosys.com";
				emp.setEmail_id(email);

			} else {
				String email = emp.getFirst_name() + '.' + emp.getLast_name() + "@infosys.com";
				emp.setEmail_id(email);
			}
			//password generation
			PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
			        .useDigits(true)
			        .useLower(true)
			        .useUpper(true)
			        .build();
			String password = passwordGenerator.generate(8);
			emp.setPassword(Base64.getEncoder().encodeToString(password.getBytes()));
			return iEmpService.saveEmp(emp);
		} else {
			return new Employee();
		}

	}

}
