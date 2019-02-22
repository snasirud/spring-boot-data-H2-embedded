package com.snasirud.springboot.SpringBootRestWithH2.service;

import com.snasirud.springboot.SpringBootRestWithH2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
