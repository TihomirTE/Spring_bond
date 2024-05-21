package com.springboot.demo.mycoolapp.dao;

import com.springboot.demo.mycoolapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// This is Spring Data JPA Repository which make the data access implementation easier
// There is no need to implement DAO classes and interfaces
//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
