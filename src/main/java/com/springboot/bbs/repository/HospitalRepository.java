package com.springboot.bbs.repository;

import com.springboot.bbs.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
