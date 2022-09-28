package com.September01.SpringBootPractice.repository;

import com.September01.SpringBootPractice.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepo extends JpaRepository<EmployeeData,Long> {
}
