package com.springboot.bbs.repository;

import com.springboot.bbs.domain.entity.Hospital;
import com.springboot.bbs.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByHospital(Hospital hospital);
}
