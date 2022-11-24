package com.springboot.bbs.service;

import com.springboot.bbs.domain.dto.ReviewCreateRequset;
import com.springboot.bbs.domain.dto.ReviewCreateResponse;
import com.springboot.bbs.domain.entity.Hospital;
import com.springboot.bbs.domain.entity.Review;
import com.springboot.bbs.repository.HospitalRepository;
import com.springboot.bbs.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    public ReviewService(ReviewRepository reviewRepository, HospitalRepository hospitalRepository) {
        this.reviewRepository = reviewRepository;
        this.hospitalRepository = hospitalRepository;
    }

    public ReviewCreateResponse add(ReviewCreateRequset reviewCreateRequset) {
        Optional<Hospital> hospital = hospitalRepository.findById(reviewCreateRequset.getHospitalId());
        Review review = Review.builder()
                .title(reviewCreateRequset.getTitle())
                .content(reviewCreateRequset.getContent())
                .userName(reviewCreateRequset.getContent())
                .hospital(hospital.get())
                .build();
        Review savedReview = reviewRepository.save(review);
        return new ReviewCreateResponse(savedReview.getId(), savedReview.getTitle(), savedReview.getContent(), savedReview.getContent(), "리뷰 등록이 성공 했습니다.");
    }
}
