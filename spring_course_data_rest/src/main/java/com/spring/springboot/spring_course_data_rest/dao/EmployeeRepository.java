package com.spring.springboot.spring_course_data_rest.dao;


import com.spring.springboot.spring_course_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByEmpName(String name);

}
