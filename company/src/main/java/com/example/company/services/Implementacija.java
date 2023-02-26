package com.example.company.services;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;

import com.example.company.entity.Department;
import com.example.company.entity.Employee;
import com.example.company.entity.Project;

public class Implementacija implements CompanyServices {

	public List<Employee> findAllEmployees(Session session) {

		Transaction tx = null;
		List<Employee> result = new ArrayList<Employee>();

		try {

			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM com.example.company.entity.Employee").list();

			for (Employee employee : employees) {
				System.out.println(
						"Employee name: " + employee.getFname() + " " + employee.getLname() + " " + employee.getDno());

				result.add(employee);
			}

		} catch (Exception e) {
			System.out.println(e);
			tx.rollback();
		}
		return result;
	}

	public List<Department> findAllDepartment(Session session) {

		List<Department> result = new ArrayList<Department>();

		try {

			List<Department> departments = session.createQuery("FROM com.example.company.entity.Department").list();

			for (Department department : departments) {

				System.out.println("Dept id: " + department.getdNumber());
				System.out.println("Department name: " + department.getdName());

				result.add(department);
			}

		} catch (HibernateException e) {
			System.out.println(e);

		}
		return result;
	}

	public List<Employee> getEmployeeWorksAt(Department department, Session session) {

		List<Employee> result = new ArrayList<Employee>();

		try {
			List<Employee> employees = session
					.createQuery("FROM com.example.company.entity.Employee E WHERE E.dno = " + department.getdNumber())
					.list();

			for (Employee employee : employees) {

				System.out.println("Employee working in Administration department: ");

				System.out.println("Employee name: " + employee.getFname() + " " + employee.getLname() + " salary "
						+ employee.getSalary());

				result.add(employee);
			}

		} catch (HibernateException e) {
			System.out.println(e);
		}
		return result;
	}

	public List<Project> getAllProjectsAt(Department department, Session session) {

		List<Project> result = new ArrayList<Project>();

		try {

			List<Project> projects = session
					.createQuery("FROM com.example.company.entity.Project P WHERE P.dNum = " + department.getdNumber())
					.list();

			// List<Project> projects = query.list();

			for (Project project : projects) {
				System.out.println("Project id: " + project.getpNumber() + " Project name " + project.getpName());

				result.add(project);
			}

		} catch (HibernateException e) {
			System.out.println(e);

		} finally {
			session.close();

		}
		return result;

	}

}
