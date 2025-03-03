package com.eva.bpo.app.repository;

import com.eva.bpo.app.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
