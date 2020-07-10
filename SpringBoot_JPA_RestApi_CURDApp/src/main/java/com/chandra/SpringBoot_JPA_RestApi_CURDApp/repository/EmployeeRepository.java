package com.chandra.SpringBoot_JPA_RestApi_CURDApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandra.SpringBoot_JPA_RestApi_CURDApp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
