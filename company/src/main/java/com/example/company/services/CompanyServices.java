package com.example.company.services;

import java.util.List;

import org.hibernate.Session;

import com.example.company.entity.Department;
import com.example.company.entity.Employee;
import com.example.company.entity.Project;

public interface CompanyServices {

	List<Employee> findAllEmployees(Session session);
	List<Department> findAllDepartment(Session session);
	List<Employee> getEmployeeWorksAt(Department department, Session session);
	List<Project> getAllProjectsAt(Department department, Session session);
}
