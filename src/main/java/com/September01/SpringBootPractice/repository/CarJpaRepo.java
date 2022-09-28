package com.September01.SpringBootPractice.repository;

import com.September01.SpringBootPractice.model.AutoMobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarJpaRepo extends JpaRepository<AutoMobile,Long> {
}
