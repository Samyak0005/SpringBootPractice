package com.September01.SpringBootPractice.repository;

import com.September01.SpringBootPractice.model.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepo extends JpaRepository<StudentData,Long> {


}
