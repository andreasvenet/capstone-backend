package com.example.capstoneproject.repo;

import com.example.capstoneproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    void deleteEmployeeById(Integer id);

}
