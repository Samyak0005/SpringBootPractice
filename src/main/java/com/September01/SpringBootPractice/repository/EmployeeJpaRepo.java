package com.September01.SpringBootPractice.repository;

import com.September01.SpringBootPractice.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeJpaRepo extends JpaRepository<EmployeeData,Long> {

    public EmployeeData findByName(String name);
    public List<EmployeeData> findByDept(String dept);


 public EmployeeData deleteByName(String name);


}
